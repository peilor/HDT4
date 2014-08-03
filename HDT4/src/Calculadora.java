
import java.io.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Pablo Argueta, Carnet: 13028
 * @author Alejandro Diaz, Carnet: 13082
 * 
 * El código para la lectura del archivo de texto fue tomado de la página: http://codigosparadesarrolladores.blogspot.com/2014/06/codigo-java-leer-archivos-de-texto.html
 * 
 */

/**
 * 
 * Clase que usa distintas implementaciones para poder hacer una calculadora
 */
public class Calculadora {
    private static int tipo;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean cont=true;
        /**
        * Ciclo para mostrar el menú de implementaciones de la stack
        */
        while(cont){
        int op=Integer.parseInt(JOptionPane.showInputDialog("¿Que tipo de implementación de Stack desea?"
                + "\n1)ArrayList"
                + "\n2)Vector"
                + "\n3)Lista: Simplemente Encadenada"
                + "\n4)Lista: Doblemente Encadenada"
                + "\n5)Lista: Circular"));
        if(op==1){
            tipo=1;
            cont=false;
        }else if(op==2){
            tipo=2;
            cont=false;
        }else if(op==3){
            tipo=3;
            cont=false;
        }else if(op==4){
            tipo=4;
            cont=false;
        }else if(op==5){
            tipo=5;
            cont=false;
        }else{
            JOptionPane.showMessageDialog(null, "Usted no ha ingresado una opcion valida");
            }
        }
        /**
        * Llamando a la StackFactory con la selección del usuario
        */
        StackFactory<Float> sFactory = new StackFactory<Float>();
        Stack<Float> datos = sFactory.getStack(tipo);   
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
                JOptionPane.showMessageDialog(null, "Operacion ingresada: "+strLinea);
                
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
         
       float resultado=0;
       float num1 = 0;
       float num2 = 0;   
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
				   float dato=Character.getNumericValue(strLinea.charAt(i));
                   datos.push(dato);
                }      
        }
	   /**
       * imprime el resultado en pantalla
       */
       JOptionPane.showMessageDialog(null, "El resultado del calculo es: "+datos.pop()); 
    }
    
    
}