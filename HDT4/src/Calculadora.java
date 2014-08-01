
import java.io.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Pablo Argueta, Carnet: 13028
 * @author Aarón Girón, Carnet: 13042
 * @author Esteban Barrera, Carnet: 13413
 * 
 * El código para la lectura del archivo de texto fue tomado de la página: http://codigosparadesarrolladores.blogspot.com/2014/06/codigo-java-leer-archivos-de-texto.html
 * 
 */

/**
 * 
 * Clase que usa la pila para hacer una calculadora
 */
public class Calculadora {
    private static Stack<Integer> datos;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean cont=true;
        while(cont){
        int op=Integer.parseInt(JOptionPane.showInputDialog("¿Que tipo de implementación de Stack desea?"
                + "\n1)ArrayList"
                + "\n2)Vector"
                + "\n3)Lista: Simplemente Encadenada"
                + "\n4)Lista: Doblemente Encadenada"
                + "\n5)Lista: Circular"
                + "\n6)Salir"));
        if(op==1){
            
        }else if(op==2){
            
        }else if(op==3){
            
        }else if(op==4){
            
        }else if(op==5){
            
        }else if(op==6){
            JOptionPane.showMessageDialog(null, "Gracias por usar el programa");
            cont=false;
        }else{
            JOptionPane.showMessageDialog(null, "Usted ha ingresado una opcion"
                    + "");
            }
        }
        datos= new StackVector<Integer>();
        String strLinea1=" ";
        String strLinea= " ";		
        /**
         * Se lee la cadena ingresada en un archivo de texto
         */
		 try{
            // Abrimos el archivo
            FileInputStream fstream = new FileInputStream("texto.txt");
            // Creamos el objeto de entrada
            DataInputStream entrada = new DataInputStream(fstream);
            // Creamos el Buffer de Lectura
            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
            
            // Leer el archivo linea por linea
            while ((strLinea1 = buffer.readLine()) != null)   {
                 /**
                 * Se imprime la cadena leída
                 */
				strLinea = strLinea1;
                System.out.println ("Operacion ingresada: "+strLinea);
                
            }
            // Cerramos el archivo
            entrada.close();
        }
		/**
         * Se crea la excepción por si ocurre un error
         */
        catch (Exception e){ //Catch de excepciones
            System.err.println("Ocurrio un error: " + e.getMessage());
        } 
         
       int resultado=0;
       int num1 = 0;
       int num2 = 0;   
	   /**
        * Se crea el ciclo para la clasificación y operaciónes de la cadena ingresada
        */
       for(int i=0; i<strLinea.length(); i++){
				/**
                 * Si encuentra un +, suma los dos últimos elementos de la pila
                 */
                if(strLinea.charAt(i)=='+'){
                    num1 = datos.pop();
                    num2 = datos.pop();
                    resultado = num1 + num2;
                    datos.push(resultado);
                }
				/**
                * Si encuentra un -, resta los dos últimos elementos de la pila
                */
                if(strLinea.charAt(i)=='-'){
                    num1 = datos.pop();
                    num2 = datos.pop();
                    resultado = num2 - num1;
                    datos.push(resultado);
                }
				/**
                * Si encuentra un *, multiplica los dos últimos elementos de la pila
                */
                if(strLinea.charAt(i)=='*'){
                    num1 = datos.pop();
                    num2 = datos.pop();
                    resultado = num1 * num2;
                    datos.push(resultado);
                }
				/**
                * Si encuentra un /, divide el penúltimo elemento dentro del último elemento de la pila
                */
                if(strLinea.charAt(i)=='/'){
                    num1 = datos.pop();
                    num2 = datos.pop();
                    resultado = num2 / num1;
                    datos.push(resultado);
                }
				/**
                * Si encuentra un número, lo guarda en la pila
                */
                if (Character.getNumericValue(strLinea.charAt(i))>=0)
                {
				   int dato=Character.getNumericValue(strLinea.charAt(i));
                   datos.push(dato);
                }      
        }
	   /**
       * imprime el resultado en pantalla
       */
       System.out.println ("El resultado de las operaciones es: "+datos.pop()); 
    }
}