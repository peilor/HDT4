/**
 *	Universidad del Valle de Guatemala
 * @author Pablo Argueta, Carnet: 13028
 * @author Alejandro Diaz, Carnet: 13082
 * Clase para realizar las operaciones utilizando un Vector
 */

import java.util.*;
/**
 * Clase que extiende a la clase abstracta abstractStack
 * @param <E>, que define el tipo de datos que recibe la pila
 */
public class StackVector<E>  extends abstractStack<E>{
	
    protected Vector<E> vector;
    private int cont=0;
    private E temporal;
    
        /**
         * Método que inicializa el objeto de tipo vector
         */
	public StackVector()
	{
		vector = new Vector<E>();
	}
        
        /**
         * 
         * @param item 
         * Recibe un valor y lo coloca en la posición de un contador
		 * pre: 
     	 * post: se agrega un elemento a la pila
         */
	public void push(E item)
	{
                vector.insertElementAt(item,cont);
                cont++;
	}
        
        /**
         * 
         * @return  el dato que se eliminó de la pila (siempre es el último que se ingresó)
		 * pre: que la pila no esté vacía
         * post: el elemento que se quitó de la pila
         */
	public E pop()
	{                
                temporal=vector.elementAt(cont-1);
                vector.removeElementAt(cont-1);
                cont--;
		return temporal;
	}
        
        /**
         * 
         * @return el último valor que se ingresó
		 * pre: que la pila no esté vacía
         * post: el último elemento ingresado
         */
	public E peek()
	{
		return vector.elementAt(cont-1);
	}
        
		/**
         * 
         * @return tamaño de la pila
		 * post: retorna el número de elementos en la pila
         */
	public int size()
	{
		return cont;
	}
}
