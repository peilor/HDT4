/**
 *	Universidad del Valle de Guatemala
 * @author Pablo Argueta, Carnet: 13028
 * @author Alejandro Diaz, Carnet: 13082
 * Clase para realizar las operaciones utilizando una Lista
 */



public class StackList<E> implements Stack<E>{
    protected list<E> data;                        
    
    /**
     * Pre: ninguna.
     * Post: 
     */
    public StackList(int par) {
        ListFactory<E> temp = new ListFactory<E>();
        data = temp.getList(par);
    }
    
    /**
     * Pre: ninguna.
     * Post: Agrega un objeto a la lista. 
     */
    public void push(E item){
        data.addFirst(item);
    }
    
    /**
     * Pre: Verifica que la pila no este vacia. 
     * Post: Remueve el ultimo elemento que fue agregado a la lista
     */
    public E pop() {
        if (!isEmpty()) {
            return(data.removeFirst());
        } else {
            return null; 
        }
    }
    
    /**
     * Pre: Verifica que la pila no este vacia
     * Post: Apunta hacia el siguiente elemento de la lista.
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
     * Post: Regresa la cantidad de elemntos que hay en la lista
     */
    public int size() {
        return data.size();
    }
	
	/**
	*Pre: ninguno.
	*Post: regreso un valor cero que indica que la pila esta vacia
	*/
    public boolean isEmpty() {
        return size() == 0;
    }
}
