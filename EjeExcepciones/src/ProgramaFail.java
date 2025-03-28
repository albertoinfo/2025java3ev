import java.util.InputMismatchException;
import java.util.Scanner;
public class ProgramaFail
{
    public static void main ( String argv[]) {
    // Incluir los tratamiento de excepciones adecuados.
    
    
    
    
    
    	
    try {	
       metodoQueFalla();      
       
    } catch ( InputMismatchException e) {
    	System.out.println(" El valor introducido no es un entero ");
    }
    catch ( ExceptionCero e) {
    	System.out.println(e.getMessage());
    }
    catch ( NullPointerException e) {
    	System.out.println(" No se ha creado el objeto");
    }
    catch ( ArrayIndexOutOfBoundsException e) {
    	System.out.println(" NO existe la posición  ");
    }
    
    
    System.out.println(" FIN PROGRAMA ");
       
    }
    
    /**
     * Este metodo puede generar muchas excepciones
     */
    static void metodoQueFalla(){
        
       Cosa tcosas [] = new Cosa [5];
       Scanner sc = new Scanner (System.in);
        
       System.out.println("Introduce un valor:");
       int num = sc.nextInt();
       
       tcosas[0] = new Cosa(num++);
       tcosas[2] = new Cosa(num++);
       tcosas[4] = new Cosa(num++);
       
       System.out.println("Introduce una posicion :");
       int pos = sc.nextInt();
       
       System.out.println("El valor en la posicion "+ pos +
                          " es " + tcosas[pos].getValor());
       
    }   
}




