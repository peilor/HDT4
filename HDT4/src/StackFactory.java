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
 * Clase que emplea el factor de diseño Factory para seleccionar la implementación
 * a utilizar para el ADT Stack.
 */
public class StackFactory<E> {
    
    /**
     * Pre: el parámetro debe ser cualquiera de los siguientes:
     * "AL" -> ArrayList
     * "VC" -> Vector
     * "LL" -> List
     * Post: regresa una instancia del ADT Stack, con la implementación 
     * correspondiente al parámetro.
     */
    public Stack<E> getStack(String parStack) {
        if (parStack == "AL") {
            return new StackArrayList<E>();
        } else if (parStack == "VC") {
            return new StackVector<E>();
        } else if (parStack == "LL"){
            return new StackList<E>();
        } else {
            return null;
        }
    }
    
    /**
     * Pre: el parámetro debe ser cualquiera de los siguientes:
     * "AL" -> ArrayList
     * "VC" -> Vector
     * "LL" -> List
     * Post: regresa una instancia del ADT Stack, con la implementación 
     * correspondiente al parámetro, permite seleccionar la implementación para
     * la estructura StackList.
     */
    public Stack<E> getStack(String parStack, String parList) {
        if (parStack == "AL") {
            return new StackArrayList<E>();
        } else if (parStack == "VC") {
            return new StackVector<E>();
        } else if (parStack == "LL"){
            return new StackList<E>(parList);
        } else {
            return null;
        }
    }
    
    /**
     * Pre: ninguna.
     * Post: regresa una instancia del ADT Stack, implementado con la estructura
     * por defecto ArrayList.
     */
    public Stack<E> getStack() {
        return new StackArrayList<E>();
    }
}
