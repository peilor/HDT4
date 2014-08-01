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
 * Interfaz que presenta una descripción básica de la estructura Lista. Tomado 
 * del capítulo 10 del libro Java Structures de Duane A. Bailey.
 */
public interface List<E> {

    /**
     * Pre:
     * Post: returns number of elements in list
     */ 
    public int size();
   
    /**
     * Pre:
     * Post: returns true iff list has no elements
     */
    public boolean isEmpty();
   
    /** 
     * Pre:
     * Post: value is added to beginning of list
     */ 
    public void addFirst(E value);
   
    /**
     * Pre:
     * Post: value is added to end of list
     */ 
    public void addLast(E value);
   
    /**
     * Pre: list is not empty
     * Post: returns first value in list
     */ 
    public E getFirst();
   
    /**
     * Pre: list is not empty
     * Post: returns last value in list
     */ 
    public E getLast();
   
    /**
     * Pre: list is not empty
     * Post: removes first value from list
     */ 
    public E removeFirst();
   
    /**
     * Pre: list is not empty
     * Post: removes last value from list
     */ 
    public E removeLast();
   
    /**
     * Pre:
     * Post: value is added to tail of list
     */ 
    public void add(E value);
   
    /**
     * Pre: list has at least one element
     * Post: removes last value found in list
     */ 
    public E remove();
   
    /** 
     * Pre: list has at least one element
     * Post: returns last value found in list
     */ 
    public E get();
   
    /**
     * Pre: 0 <= i < size()
     * Post: returns object found at that location
     */ 
    public E get(int i);
   
    /**
     * Pre: 0 <= i <= size()
     * Post: adds ith entry of list to value o
     */ 
    public void add(int i, E o);
   
    /** 
     * Pre: 0 <= i < size()
     * Post: removes and returns object found at that location
     */ 
    public E remove(int i);
}

