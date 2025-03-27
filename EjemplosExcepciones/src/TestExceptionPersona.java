/**
 * Ejemplo de deteccion y generación de excepciones de librería y 
 * predefinidas por el programador.
 * Ejemplo: Con try-catch
 */
 
import java.util.Scanner;

public class TestExceptionPersona {
	public static void main (String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int edad1 = 39;
		Persona pepe = new Persona();
		pepe.setNombre("Pepe");
		
		try{	
			
			int edad;
			System.out.print("Ingrese edad:");
	        edad=sc.nextInt();
			pepe.setEdad(edad);
			System.out.println(pepe);
		
			// Capturo todo tipo de excepciones
			
		}catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();  // Muestra la pila de llamada en la salida de errores
		}
		
		
		pepe.incEdad(); // NO tiene que estar en try catch 
		System.out.println(pepe);
		System.out.println("Fin del programa");
	
	}
}