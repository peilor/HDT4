/**
 *	Universidad del Valle de Guatemala
 * @author Pablo Argueta, Carnet: 13028
 * @author Alejandro Diaz, Carnet: 13082
 * Clase Nodo que se utiliza para las listas 
 * Basado en el capitulo 9.4 de java structures. 
 */
public class Node<E> {
    protected E data;
    protected Node<E> nextElement;
    
    /** 
     * Pre: v es un dato, next es una referencia al resto de la lista.
     * Post: se construye un elemento que pasa a hacer la nueva cabeza de la lista.
     */ 
    public Node(E v, Node<E> next) {
        data = v;
        nextElement = next;
    }
    
    /**
     * Pre: ninguna.
     * Post: construye una nueva cola para la lista, con valor igual a value.
     */ 
    public Node(E v) {
        this(v, null);
    }
    
    /** 
     * Pre: ninguna.
     * Post: regresa la referencia al siguiente elemento en la lista.
     */ 
    public Node<E> next() {
        return nextElement;
    }

    /** 
     * Pre: ninguna.
     * Post: establece una referencia a un elemento siguiente (next).
     */ 
    public void setNext(Node<E> next) {
        nextElement = next;
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
