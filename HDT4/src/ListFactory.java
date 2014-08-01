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
 * a utilizar para la estructura lista encadenada.
 */
public class ListFactory<E> {
    
    /**
     * Pre: el parámetro debe ser cualquiera de los siguientes:
     * "SL" -> SinglyLinkedList
     * "DL" -> DoublyLinkedList
     * "CL" -> CircularList
     * Post: regresa una instancia de la estructura lista, con la implementación 
     * correspondiente al parámetro.
     */
    public List<E> getList(String parList) {
        if (parList == "SL") {
            return new SinglyLinkedList<E>();
        } else if (parList == "DL") {
            return new DoublyLinkedList<E>();
        } else if (parList == "CL"){
            return new CircularList<E>();
        } else {
            return null;
        }
    }
    
    /**
     * Pre: ninguna.
     * Post: regresa una instancia de la estructura lista, implementado con la 
     * estructura por defecto CircularList.
     */
    public List<E> getList() {
        return new DoublyLinkedList<E>();
    }
}

