/**
*Universidad del Valle de Guatemala
* @author Pablo Argueta, Carnet: 13028
* @author Alejandro Diaz, Carnet: 13082
* Esta clase esta basada de los ejemplos subidos en Black Board
*/


public abstract class abstractList<E> implements list<E> {
   
    /**
     * Pre: ninguna.
     * Post: ninguna.
     */ 
    public abstractList() {
   
    }

   
    /** 
     * Pre: ninguna.
     * Post: retorna verdadero si y sólo si la lista no contiene ningún elemento.
     */ 
    public boolean isEmpty() 
    {
        return size() == 0;
    }
  
    @Override
    /**
     * Pre:
     * Post: value is added to beginning of list
     */ 
    public void addFirst(E value) {
        add(0, value);
    }
    
    @Override
    /** 
     * Pre:
     * Post: value is added to end of list
     */ 
    public void addLast(E value) {
        add(size(), value);
    }
    
    @Override
    /**
     * Pre: list is not empty
     * Post: returns first value in list
     */ 
    public E getFirst() {
        return get(0);
    }
    
    @Override
    /**
     * Pre: list is not empty
     * Post: returns last value in list
     */ 
    public E getLast() {
        return get(size() - 1);
    }
    
    @Override
    /**
     * Pre: list is not empty
     * Post: removes first value from list
     */ 
    public E removeFirst() {
        return remove(0);
    }
    
    @Override
    /**
     * Pre: list is not empty
     * Post: removes last value from list
     */ 
    public E removeLast() {
        return remove(size() - 1);
    }
    
    @Override
    /**
     * Pre:
     * Post: value is added to tail of list
     */ 
    public void add(E value) {
        addLast(value);
    }
    
    @Override
    /**
     * Pre: list has at least one element
     * Post: removes last value found in list
     */ 
    public E remove() {
        return removeLast();
    }

    @Override
    /**
     * Pre: list has at least one element
     * Post: returns last value found in list
     */ 
    public E get() {
        return getLast();
    }
}
