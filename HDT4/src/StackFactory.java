/**
 *	Universidad del Valle de Guatemala
 * @author Pablo Argueta, Carnet: 13028
 * @author Alejandro Diaz, Carnet: 13082
 * Clase basada en los ejemplos subidos en clase
 * Emplea el Factory que le permite selccionar que implementacion utilizara
 */

public class StackFactory<E> {
    
  
    /**
     * Pre: Recibe como parametro  1,2,3,4 o 5 y si es 3,4 o 5 lo manda a StackList, donde se selecciona el tipo de list
     * Post: regresa una instancia con un Stack distinto dependiendo de 
	 * la seleccion del usuario 
     */
    public Stack<E> getStack(int tipoStack)
	{
        if (tipoStack == 1) {
            return new StackArrayList<E>();
        } else if (tipoStack == 2) {
            return new StackVector<E>();
        } else if (tipoStack == 3){
            return new StackList<E>(tipoStack);
		}  else if (tipoStack == 4){
            return new StackList<E>(tipoStack);
		}   else if (tipoStack == 5){
            return new StackList<E>(tipoStack);
        } else {
            return null;
        }
    }
    
    
    public Stack<E> getStack() {
        return new StackArrayList<E>();
    }
}
