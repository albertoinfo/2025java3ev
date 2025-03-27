
/**
 *  Programa que implementa un comando que permite dividir 
 *  dos números, detectando los errores de formato y división por cero
 * 
 * @author Alberto
 * @version 1.0
 */
public class TestExcepcion1
{
    public static void main ( String args[] ) {
     
       System.out.println(" Antes de try ");
        
       try {
            int numero1 = Integer.parseInt(args[0]);  
            int numero2 = Integer.parseInt(args[1]);
            float div = numero1 / numero2;
            
            System.out.println("Div="+div);
        
        } catch (ArithmeticException e) {
            System.out.println("Error aritmetico");
            System.out.println(e.getMessage()); 
        } catch (NumberFormatException e){
            System.out.println("Error de formato");
            System.out.println(e.getMessage());
        } 
        
        finally {
           System.out.println(" Finally: -- SIEMPRE ESCRIBO ESTO --");
            
        }
        
        System.out.println(" Despues de try : NO HA Pasado Nada o las excepciones han sido tratadas " );
    }
    
}
