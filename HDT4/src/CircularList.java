/**
 * @author Miguel Zea
 * @author Diego Bran
 * @author Derek Orbaugh
 * @author Eduardo Drummond
 * @author Javier Gracía
 * | -------------------------------------------------- |
 * |        Universidad Del Valle De Guatemala          |
 * | -------------------------------------------------- |
 * | Algoritmos y Estructuras de Datos.                 |
 * | Sección 20.                                        |
 * | Hoja de Trabajo #4.                                |
 * | 14/08/2012.                                        |
 * | Descripción: implementación de una calculadora     |
 * | que evalúe expresiones en fortmato postfix,        |
 * | aplicando stacks representados con vectores, array |
 * | lists y listas (simples, dobles y circulares) y    |
 * | empleando los patrones de diseño factory (para la  |
 * | selección de la lista y el stack a implementar) y  |
 * | singleton (para la calculadora).                   |
 * | -------------------------------------------------- |
 */

package postfixcalculator;

/**
 * Implementación de una lista circularmente encadenada, mediante el uso de la
 * clase nodo (Node). Tomado del capítulo 9 del libro Java Structures 
 * de Duane A. Bailey. NO fueron implementados todos sus métodos.
 */
public class CircularList<E> extends AbstractList<E> {
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
    
    @Override
    /**
     * Pre: ninguna.
     * Post: el elemento es agregado a la cola de la lista.
     */
    public void addLast(E value) {
        addFirst(value);
        tail = tail.next();
    }
    
    @Override
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
    
    @Override
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
    
    @Override
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

