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
 * Clase que describe los objetos de tipo nodo (Node), necesarios para la definición de 
 * listas enlazadas. Tomado del capítulo 9 del libro Java Structures de Duane A. Bailey.
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
