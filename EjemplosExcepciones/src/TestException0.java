
/**
 * Ejemplo de programa que genera o puede generar distintos tipos
 * de excepciones todas de tipo RuntimeException - No obligatorias
 * 
 * @author Alberto López
 * @version 1.0
 * 
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class TestException0
{
    
    
    public static void main (String argv[]){
        
        Scanner sc = new Scanner(System.in);
        int tabla[] = new int [4];
        int numero ;
        int resultado;
        String valor = initCadena();
      
        
        
        
        System.out.println("Introduce un valor:");
        numero = sc.nextInt();                      // InputMismatchException ( Si introduzco un valor no entero
        resultado = numero / 0;                     // ArithmeticException: / by zero
        System.out.println( valor.replace('a','A'));//NullPointerException
        
        
    }   
    
    public static String initCadena(){
        return " Pepa ";
    }
}
