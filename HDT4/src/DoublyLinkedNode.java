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

/**
 * Clase que describe los objetos de tipo nodo doble, necesarios para la definición 
 * de listas doblemente enlazadas. Tomado del capítulo 9 del libro Java Structures 
 * de Duane A. Bailey.
 */
public class DoublyLinkedNode<E> {
    protected E data;
    protected DoublyLinkedNode<E> nextElement;
    protected DoublyLinkedNode<E> previousElement;
    
    /** 
     * Pre: v es un dato, next es una referencia al segmento posterior de la lista,
     * previous es una referencia al segmento anterior de la lista.
     * Post: se construye un elemento que pasa a hacer la nueva cabeza de la lista.
     */
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
