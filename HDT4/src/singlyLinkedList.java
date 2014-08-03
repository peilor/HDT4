/**
 *	Universidad del Valle de Guatemala
 * @author Pablo Argueta, Carnet: 13028
 * @author Alejandro Diaz, Carnet: 13082
 * Clase de una lista simplemente encadenada que utiliza
 * Basado del capitulo 9 seccion 4 del libro de Java Structures.
 */
public class singlyLinkedList<E> extends abstractList<E> {

	protected int count; // list size
	protected Node<E> head; // ref. to first element
	public singlyLinkedList()
	// post: generates an empty list
	{		
		head = null;
		count = 0;
	}
    
    public int size()
// post: returns number of elements in list
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
           
            previous.setNext(finger.next());
            count--;
           
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
          
            while (i > 0) {
                finger = finger.next();
                i--;
            }
           
            return finger.value();
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
}
