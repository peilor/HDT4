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
 * Clase abstracta para la estructura Lista. Reúne métodos comunes a todas las
 * implementaciones de la misma. Tomado del capítulo 9 del libro Java Structures 
 * de Duane A. Bailey.
 */
public abstract class AbstractList<E> implements List<E> {
   
    /**
     * Pre: ninguna.
     * Post: ninguna.
     */ 
    public AbstractList() {
   
    }

    @Override
    /** 
     * Pre: ninguna.
     * Post: retorna verdadero si y sólo si la lista no contiene ningún elemento.
     */ 
    public boolean isEmpty() {
        return size() == 0;
    }
  
    @Override
    /**
     * Pre:
     * Post: value is added to beginning of list
     */ 
    public void addFirst(E value) {
        add(0, value);
    }
    
    @Override
    /** 
     * Pre:
     * Post: value is added to end of list
     */ 
    public void addLast(E value) {
        add(size(), value);
    }
    
    @Override
    /**
     * Pre: list is not empty
     * Post: returns first value in list
     */ 
    public E getFirst() {
        return get(0);
    }
    
    @Override
    /**
     * Pre: list is not empty
     * Post: returns last value in list
     */ 
    public E getLast() {
        return get(size() - 1);
    }
    
    @Override
    /**
     * Pre: list is not empty
     * Post: removes first value from list
     */ 
    public E removeFirst() {
        return remove(0);
    }
    
    @Override
    /**
     * Pre: list is not empty
     * Post: removes last value from list
     */ 
    public E removeLast() {
        return remove(size() - 1);
    }
    
    @Override
    /**
     * Pre:
     * Post: value is added to tail of list
     */ 
    public void add(E value) {
        addLast(value);
    }
    
    @Override
    /**
     * Pre: list has at least one element
     * Post: removes last value found in list
     */ 
    public E remove() {
        return removeLast();
    }

    @Override
    /**
     * Pre: list has at least one element
     * Post: returns last value found in list
     */ 
    public E get() {
        return getLast();
    }
}
