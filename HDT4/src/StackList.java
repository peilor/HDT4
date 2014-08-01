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
import java.util.EmptyStackException;

/**
 * Clase que describe la implementación del ADT pila (Stack) mediante el uso del 
 * objeto Vector y sus respectivos métodos. Tomado del capítulo 10 del libro 
 * Java Structures de Duane A. Bailey.
 */
public class StackList<E> extends AbstractStack<E> {
    protected List<E> data;                        
    
    /**
     * Pre: ninguna.
     * Post: instancia un objeto pila (StackVector), cuyos datos se
     * almacenen en un objeto Vector.
     */
    public StackList(String par) {
        ListFactory<E> temp = new ListFactory<E>();
        data = temp.getList(par);
    }
    
    /**
     * Pre: ninguna.
     * Post: instancia un objeto pila (StackVector), cuyos datos se
     * almacenen en un objeto Vector.
     */
    public StackList() {
        ListFactory<E> temp = new ListFactory<E>();
        data = temp.getList("CL");
    }
    
    /**
     * Pre: ninguna.
     * Post: se añade un elemento a la pila mediante el método add del
     * objeto Vector.
     */
    @Override
    public void push(E element) {
        data.addFirst(element);
    }
    
    /**
     * Pre: la pila no está vacía (se evalúa dentro del mismo, empleando
     * el método empty).
     * Post: se remueve el último elemento agregado al Vector (por medio
     * del método remove) y se retorna. En caso que la pila esté vacía,
     * se lanza la excepción correspondiente.
     */
    @Override
    public E pop() {
        if (! empty()) {
            return(data.removeFirst());
        } else {
            throw new EmptyStackException(); 
        }
    }
    
    /**
     * Pre: la pila no está vacía (se evalúa dentro del mismo, empleando
     * el método empty).
     * Post: se retorna el último elemento agregado al Vector (por medio
     * del método remove). En caso que la pila esté vacía, se lanza la 
     * excepción correspondiente.
     */
    @Override
    public E peek() {
        if (! empty()) {
            return data.getFirst();
        } else {
            throw new EmptyStackException();
        }
        
    }
        
    /**
     * Pre: ninguna.
     * Post: retorna el número de elementos contenidos en el Vector 
     * (evaluado mediante el método size del objeto Vector).
     */
    @Override
    public int size() {
        return data.size();
    }
}
