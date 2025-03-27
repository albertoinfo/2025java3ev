
/**
 * Lee dos números detectando posible errores de formato
 * Y la división por cero.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class TestExcepcion2 {
	public static void main(String args[]) {

		  Scanner sc = new Scanner(System.in);
	       
	       boolean error = false;
	       int numero1 = 0;
	       int numero2 = 0;
	       int resu = 0;
	       
	       do {
	 	      error = false;   
	 	      System.out.println("Introduce un valor 1:");
	 	          try {
	 	             // Leo una cadena e intento pasala a entero
	 	             String cadena = sc.next();
	 	             numero1 = Integer.parseInt(cadena);
	 	            }   catch(NumberFormatException e){
	 	              System.out.println("Error en formato");
	 	              error = true;
	 	            }
	 	        }
	 	       while ( error );
	       
	       
	       do {
	        error = false;  
	        System.out.println("Introduce un valor 2:");
	          try {
	             // Intento leer directamente un entero
	             numero2 = sc.nextInt();
	            }   catch(InputMismatchException e){
	              System.out.println("Error en formato ");
	              sc.next(); // leo el valor erroneo
	              error = true;
	            }
	        }
	       while ( error ); 
	       
	       
	       
	     
	       
	     
	       
	       try {
	            resu = numero1 / numero2;
	        } catch (ArithmeticException e) {
	            System.out.println("Error aritmetico");
	            error = true;
	        }
	        
	        if ( ! error )
	        System.out.println("Resultado = " + resu );
	        else
	        System.out.println("Error al operar :"+numero1 +"/"+numero2);
	    }  

}
