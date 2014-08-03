/**
 *	Universidad del Valle de Guatemala
 * @author Pablo Argueta, Carnet: 13028
 * @author Alejandro Diaz, Carnet: 13082
 * Clase para una lista circular 
 * Tomada del capitulo 9.6 del libro Java Structures
 */
public class CircularList<E> extends abstractList<E> {
    protected Node<E> tail; 
    protected int count;
    
    /**
     * Pre: ninguna.
     * Post: crea una lista circular vacía.
     */
    public CircularList() {
        tail = null;
        count = 0;
    }
    
    
    /**
     * Pre: ninguna.
     * Post: regresa el número de elementos en la lista.
     */
    public int size() {
        return count;
    }

    
    
    /**
     * Pre: el valor a agregar no es nulo.
     * Post: el elemento es agregado a la cabeza de la lista.
     */
    public void addFirst(E value) {
        Node<E> temp = new Node<E>(value);
        if (tail == null) { // first value added
            tail = temp;
            tail.setNext(tail);
        } else { // element exists in list
            temp.setNext(tail.next());
            tail.setNext(temp);
        }
        count++;
    }
    
    
    /**
     * Pre: ninguna.
     * Post: el elemento es agregado a la cola de la lista.
     */
    public void addLast(E value) {
        addFirst(value);
        tail = tail.next();
    }
    
        /**
     * Pre: 0<= i <= size().
     * Post: agrega el elemento o en la i-ésima posición de la lista.
     */
    public void add(int i, E o) {
        if (i == 0) addFirst(o);
        else if (i == size()) addLast(o);
        else if ((i >= 0) && (i <= size())) {
            Node<E> previous = tail;
            Node<E> finger = tail.next();
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
    
    
    /**
     * Pre: 0<= i <= size().
     * Post: regresa y remueve de la lista el elemento encontrado en el índice
     * especificado.
     */
    public E remove(int i) {
        if ((i >= 0) && (i < size()) && !isEmpty()) {
            Node<E> previous = tail;
            Node<E> finger = tail.next();
            // Se busca al valor indexado, manteniendo la referencia al previo.
            while (i > 0) {
                i--;
                previous = finger;
                finger = finger.next();
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
    
    
    /**
     * Pre: 0<= i <= size().
     * Post: regresa el elemento encontrado en el índice especificado.
     */
    public E get(int i) {
        if ((i >= 0) && (i < size()) && !isEmpty()) {
            Node<E> finger = tail.next();
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

