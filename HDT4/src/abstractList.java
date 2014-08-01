
public abstract class AbstractList<E> implements List <E>{

    //------------------------------------------------------------------------
    // Constructor:
    //------------------------------------------------------------------------
    
    /**
     * pre: -
     * post: -
     */
    public AbstractList(){}

    //------------------------------------------------------------------------
    // Métodos:
    //------------------------------------------------------------------------
    
    /**
     * Método encargado de revisar si la lista se encuentra vacia.
     * pre: -
     * post: regresa tru si está vacia o false si tiene algún dato.
     */
    public boolean empty()
   
    {
        return size() == 0;
    }
}