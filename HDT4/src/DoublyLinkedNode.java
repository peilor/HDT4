/**
 *	Universidad del Valle de Guatemala
 * @author Pablo Argueta, Carnet: 13028
 * @author Alejandro Diaz, Carnet: 13082
 * Clase Nodo que se utiliza para las listas 
 * Basado en el capitulo 9.5 de java structures. 
 */
public class DoublyLinkedNode<E> {
    protected E data;
    protected DoublyLinkedNode<E> nextElement;
    protected DoublyLinkedNode<E> previousElement;
    
   
    public DoublyLinkedNode(E v, DoublyLinkedNode<E> next, DoublyLinkedNode<E> previous) {
        data = v;
        nextElement = next;
        if (nextElement != null) nextElement.previousElement = this;
        previousElement = previous;
        if (previousElement != null) previousElement.nextElement = this;
    }
    
    /**
     * Pre: ninguna.
     * Post construye un elemento doble nodo.
     */
    public DoublyLinkedNode(E v) {
        this(v, null, null);
    }
    
    /** 
     * Pre: ninguna.
     * Post: regresa la referencia al elemento posterior en la lista.
     */ 
    public DoublyLinkedNode<E> next() {
        return nextElement;
    }
    
    /** 
     * Pre: ninguna.
     * Post: regresa la referencia al elemento anterior en la lista.
     */ 
    public DoublyLinkedNode<E> previous() {
        return previousElement;
    }
    
    /** 
     * Pre: ninguna.
     * Post: establece una referencia a un elemento posterior (next).
     */ 
    public void setNext(DoublyLinkedNode<E> next) {
        nextElement = next;
    }
    
    /** 
     * Pre: ninguna.
     * Post: establece una referencia a un elemento previo (previous).
     */ 
    public void setPrevious(DoublyLinkedNode<E> previous) {
        previousElement = previous;
    }
    
    /**
     * Pre: ninguna.
     * Post: regresa el valor asociado al elemento.
     */ 
    public E value() {
        return data;
    }

    /** 
     * Pre: ninguna.
     * Post: establece el valor asociado al elemento.
     */
    public void setValue(E value) {
        data = value;
    }
}
