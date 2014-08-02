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
 * Clase que describe la implementación del ADT pila (Stack) mediante el uso del 
 * objeto Vector y sus respectivos métodos. Tomado del capítulo 10 del libro 
 * Java Structures de Duane A. Bailey.
 */

public class StackList<E> implements Stack<E>{
    protected list<E> data;                        
    
    /**
     * Pre: ninguna.
     * Post: instancia un objeto pila (StackVector), cuyos datos se
     * almacenen en un objeto Vector.
     */
    public StackList(int par) {
        ListFactory<E> temp = new ListFactory<E>();
        data = temp.getList(par);
    }
    
    /**
     * Pre: ninguna.
     * Post: se aÃ±ade un elemento a la pila mediante el mÃ©todo add del
     * objeto Vector.
     */
    public void push(E item){
        data.addFirst(item);
    }
    
    /**
     * Pre: la pila no estÃ¡ vacÃ­a (se evalÃºa dentro del mismo, empleando
     * el mÃ©todo empty).
     * Post: se remueve el Ãºltimo elemento agregado al Vector (por medio
     * del mÃ©todo remove) y se retorna. En caso que la pila estÃ© vacÃ­a,
     * se lanza la excepciÃ³n correspondiente.
     */
    public E pop() {
        if (!isEmpty()) {
            return(data.removeFirst());
        } else {
            return null; 
        }
    }
    
    /**
     * Pre: la pila no estÃ¡ vacÃ­a (se evalÃºa dentro del mismo, empleando
     * el mÃ©todo empty).
     * Post: se retorna el Ãºltimo elemento agregado al Vector (por medio
     * del mÃ©todo remove). En caso que la pila estÃ© vacÃ­a, se lanza la 
     * excepciÃ³n correspondiente.
     */
    public E peek() {
        if (! isEmpty()) {
            return data.getFirst();
        } else {
            return null;
        }
        
    }
        
    /**
     * Pre: ninguna.
     * Post: retorna el nÃºmero de elementos contenidos en el Vector 
     * (evaluado mediante el mÃ©todo size del objeto Vector).
     */
    public int size() {
        return data.size();
    }
    public boolean isEmpty() {
        return size() == 0;
    }
}
