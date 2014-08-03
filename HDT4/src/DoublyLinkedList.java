/**
 *	Universidad del Valle de Guatemala
 * @author Pablo Argueta, Carnet: 13028
 * @author Alejandro Diaz, Carnet: 13082
 * Clase para una lista doblemente enlazada 
 * Tomada del capitulo 9.5 del libro Java Structures
 */
public class DoublyLinkedList<E> extends abstractList<E> {

    protected int count;
    protected DoublyLinkedNode<E> head;
    protected DoublyLinkedNode<E> tail;

    /**
     * Pre: ninguna.
     * Post: construye una lista doblemente encadenada vacía.
     */
    public DoublyLinkedList() {
        head = null;
        tail = null;
        count = 0;
    }

    @Override
    /**
     * Pre: ninguna.
     * Post: regresa el número de elementos en la lista.
     */
    public int size() {
        return count;
    }
    
    @Override
    /**
     * Pre: el valor a agregar no es nulo.
     * Post: el elemento es agregado a la cabeza de la lista.
     */
    public void addFirst(E value) {
        // Se construye un nuevo elemento y se establece como la cabez de la lista.
        head = new DoublyLinkedNode<E>(value, head, null);
        // Se arregla la cola, de ser necesario.
        if (tail == null) tail = head;
        count++;
    }

    @Override
    /**
     * Pre: ninguna.
     * Post: el elemento es agregado a la cola de la lista.
     */
    public void addLast(E value) {
        // Se construye un nuevo elemento.
        tail = new DoublyLinkedNode<E>(value, null, tail);
        // Se actualiza la cabeza.
        if (head == null) head = tail;
        count++;
    }
    
    @Override
    /**
     * Pre: la lista no está vacía.
     * Post: el primer elemento de la lista es retornado y removido.
     */
    public E removeFirst() {
        if(!isEmpty()) {
            DoublyLinkedNode<E> temp = head;
            head = head.next();
            if (head != null) {
                head.setPrevious(null);
            } else {
                tail = null; // Se remueve el valor final.
            }
            temp.setNext(null); // Ayuda a limpieza.
            count--;
            return temp.value();
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    /**
     * Pre: la lista no está vacía.
     * Post: el último elemento de la lista es retornado y removido.
     */
    public E removeLast() {
        if(!isEmpty()) {
            DoublyLinkedNode<E> temp = tail;
            tail = tail.previous();
            if (tail == null) {
                head = null;
            } else {
                tail.setNext(null);
            }
            count--;
            return temp.value();
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    /**
     * Pre: 0<= i <= size().
     * Post: agrega el elemento o en la i-ésima posición de la lista.
     */
    public void add(int i, E o) {
        if (i == 0) addFirst(o);
        else if (i == size()) addLast(o);
        else if ((0 <= i) && (i <= size())) {
            DoublyLinkedNode<E> before = null;
            DoublyLinkedNode<E> after = head;
            // Se busca a la i-ésima posición, o al final de la lista.
            while (i > 0) {
                before = after;
                after = after.next();
                i--;
            }
            // Se crea un nuevo elemento para ser insertado en la posición correcta.
            DoublyLinkedNode<E> current = new DoublyLinkedNode<E>(o, after, before);
            count++;
            // Se establece que los valores previo y siguiente apunten al nuevo.
            before.setNext(current);
            after.setPrevious(current);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    /**
     * Pre: 0<= i <= size().
     * Post: regresa y remueve de la lista el elemento encontrado en el índice
     * especificado.
     */
    public E remove(int i) {
        if (i == 0) return removeFirst();
        else if (i == size() - 1) return removeLast();
        else if ((0 <= i) && (i < size()) && !isEmpty()) {
            DoublyLinkedNode<E> previous = null;
            DoublyLinkedNode<E> finger = head;
            // Se busca al valor indexado, manteniendo la referencia al previo.
            while (i > 0) {
                previous = finger;
                finger = finger.next();
                i--;
            }
            previous.setNext(finger.next());
            finger.next().setPrevious(previous);
            count--;
            // Se retorna el valor del elemento removido.
            return finger.value();
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
    
    @Override
    /**
     * Pre: 0<= i <= size().
     * Post: regresa el elemento encontrado en el índice especificado.
     */
    public E get(int i)
    {
        if (i >= size()) return null;
        DoublyLinkedNode<E> finger = head;
        // Se búsca al valor indexado.
        while (i > 0)
        {
            finger = finger.next();
            i--;
        }
        // Se retorna el valor del elemento encontrado.
        return finger.value();
    }

}
