/**
 *	Universidad del Valle de Guatemala
 * @author Pablo Argueta, Carnet: 13028
 * @author Alejandro Diaz, Carnet: 13082
 * Clase basada en los ejemplos subidos en clase
 * Emplea el Factory que le permite selccionar que implementacion utilizara
 */
public class ListFactory<E> {
    
     /**
     * Pre: Recibe como parametro  3,4 o 5 
     * Post: regresa una instancia con una lista  distinta dependiendo de 
	 * la seleccion del usuario 
     */
    public list<E> getList(int parList) {
        if (parList == 3) {
            return new singlyLinkedList<E>();
        } else if (parList == 4) {
            return new DoublyLinkedList<E>();
        } else if (parList == 5){
            return new CircularList<E>();
        } else {
            return null;
        }
    }
    
   
    public list<E> getList() {
        return new DoublyLinkedList<E>();
    }
}

