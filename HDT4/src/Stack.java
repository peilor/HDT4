/**
 *	Universidad del Valle de Guatemala
 * @author Pablo Argueta, Carnet: 13028
 * @author Alejandro Diaz, Carnet: 13082
 * 
 * 
 */
/**
 * 
 * @param <E>, que define el tipo de elementos que recibirá la pila
 */
public interface Stack <E>{
    /**
     * 
     * @param item 
     */
   public void push(E item);
   // pre: 
   // post: se agrega un elemento a la pila
   
   /**
    * 
    * @return --
    */
   public E pop();
   // pre: que la pila no esté vacía
   // post: el elemento que se quitó de la pila
   
   /**
    * 
    * @return --
    */
   public E peek();
   // pre: que la pila no esté vacía
   // post: el último elemento ingresado
   
   /**
    * 
    * @return si está vacía o no
    */
   public boolean isEmpty();
   // post: retorna true si la pila está vacía y false si tiene algo
   
   /**
    * 
    * @return número de lementos en la pila
    */
   public int size();
   // post: retorna el número de elementos en la pila
}
