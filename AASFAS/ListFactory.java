
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
    public list<E> getList(String parList) {
        if (parList == "SL") {
            return new singlyLinkedList<E>();
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
    public list<E> getList() {
        return new DoublyLinkedList<E>();
    }
}
