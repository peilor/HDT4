/**
 * Implementación de una lista simplemente encadenada, mediante el uso de la
 * clase nodo (Node). Tomado del capítulo 9 del libro Java Structures 
 * de Duane A. Bailey. NO fueron implementados todos sus métodos.
 */
public class singlyLinkedList<E> extends abstractList<E> {

    protected int count; // Tamaño de la lista.
    protected Node<E> head; // Referencia al primer elemento.
    
    /**
     * Pre: ninguna.
     * Post: genera una lista simplemente encadenada vacía.
     */
    public singlyLinkedList() {
        head = null;
        count = 0;
    }
    
    /*@Override*/
    /**
     * Pre: ninguna.
     * Post: regresa el número de elementos en la lista.
     */
    public int size() 
    {
        return count;
    }
    
    /*@Override*/
    /**
     * Pre: ninguna.
     * Post: el elemento o es agregado al inicio de la lista.
     */
    public void addFirst(E o) {
        head = new Node<E>(o, head);
        count++;
    }
    
    
    /**
     * Pre: ninguna.
     * Post: el elemento o es agregado al final de la lista.
     */
    public void addLast(E o) {
        if (isEmpty()) {
            addFirst(o);
        } else {
            add(size(), o);
        }
    }
    
    @Override
    /**
     * Pre: la lista no está vacía.
     * Post: el primer elemento de la lista es retornado y removido.
     */
    public E removeFirst() {
        if(!isEmpty()) {
            Node<E> temp = head;
            head = head.next(); // move head down list
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
        if (!isEmpty()) {
            Node<E> finger = head;
            Node<E> previous = null;
            while (finger.next() != null) {
                previous = finger;
                finger = finger.next();
            }
            // Cuando finger es nulo, se ha llegado al final de la lista.
            if (previous == null) {
                head = null;
            } else {
                // Se resetea el puntero al último elemento.
                previous.setNext(null);
            }
            count--;
            return finger.value();
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
        else if ((i == size()) && isEmpty()) addLast(o);
        else if ((i >= 0) && (i <= size())) {
            Node<E> previous = null;
            Node<E> finger = head;
            // Se busca a la i-ésima posición, o al final de la lista.
            while (i > 0) {
                previous = finger;
                finger = finger.next();
                i--;
            }
            // Se crea un nuevo elemento para ser insertado en la posición correcta.
            Node<E> current = new Node<E>(o, finger);
            count++;
            // Se establece que el valor previo apunte al nuevo.
            previous.setNext(current);
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
        else if ((i >= 0) && (i < size()) && !isEmpty()) {
            Node<E> previous = null;
            Node<E> finger = head;
            // Se búsca al valor indexado, manteniendo la referencia al previo.
            while (i > 0) {
                previous = finger;
                finger = finger.next();
                i--;
            }
            // Se encadenan los elementos previo y siguiente al elemento a remover.
            previous.setNext(finger.next());
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
    public E get(int i) {
        if ((i >= 0) && (i < size()) && !isEmpty()) {
            Node<E> finger = head;
            // Se búsca al valor indexado.
            while (i > 0) {
                finger = finger.next();
                i--;
            }
            // Se retorna el valor del elemento encontrado.
            return finger.value();
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
}
