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
    public Stack<E> getStack(String tipoStack) {
        if (tipoStack == "AL") {
            return new StackArrayList<E>();
        } else if (tipoStack == "VC") {
            return new StackVector<E>();
        } else if (tipoStack == "LL"){
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
    public Stack<E> getStack(String tipoStack, String tipoList) {
        if (tipoStack == "AL") {
            return new StackArrayList<E>();
        } else if (tipoStack == "VC") {
            return new StackVector<E>();
        } else if (tipoStack == "LL"){
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
