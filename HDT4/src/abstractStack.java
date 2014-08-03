/**
*Universidad del Valle de Guatemala
* @author Pablo Argueta, Carnet: 13028
* @author Alejandro Diaz, Carnet: 13082
* Esta clase esta basada de los ejemplos subidos en Black Board
*/

abstract public class abstractStack<E> implements Stack<E> {
    
    /**
    * 
    * @return si la pila está vacía o no
    * post: retorna true si la pila está vacía y false si tiene algo
    */
    public boolean isEmpty() {
        return size() == 0;
    }
}
