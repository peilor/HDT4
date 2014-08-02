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
     * correspondiente al parámetro, permite seleccionar la implementación para
     * la estructura StackList.
     */
    public Stack<E> getStack(int tipoStack) {
        if (tipoStack == 1) {
            return new StackArrayList<E>();
        } else if (tipoStack == 2) {
            return new StackVector<E>();
        } else if (tipoStack == 3){
            return new StackList<E>(tipoStack);
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
