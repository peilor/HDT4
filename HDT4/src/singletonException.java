/**
 *	Universidad del Valle de Guatemala
 * @author Pablo Argueta, Carnet: 13028
 * @author Alejandro Diaz, Carnet: 13082
 * Clase para la singletonException
 * Tomada del libro Java Structures
 */

public class singletonException extends RuntimeException {
    
    /**
     * Pre: nada.
     * Post: Regresa la excepción singletonException
     */
    public singletonException() {
        super();
    }
    
    /**
     * Pre: nada.
     * Post: Regresa la excepción singletonException con la cadena que se desee
     */
    public singletonException(String s) {
        super(s);
    }
}
