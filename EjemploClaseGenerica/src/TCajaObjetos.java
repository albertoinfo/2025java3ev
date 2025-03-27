
/**
 * Write a description of class TCajaObjetos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TCajaObjetos
{
    public static void  main( String cadena[] ){
     
        CajaObjetos micaja = new CajaObjetos();
        micaja.pon(23);
        Integer valor = (Integer) micaja.quita();
        System.out.println( " Valor almacenado "+ valor);
        
        CajaObjetos micaja2 = new CajaObjetos();
        micaja2.pon("Mensaje ");
       
        String valors = (String) micaja2.quita();
        System.out.println( " Valor almacenado "+ valors);
        
        // Error no detectado que provoca un fallo
         micaja.pon (" Otro mensaje ");
         Integer valor3 = (Integer) micaja.quita();
         System.out.println( " Valor almacenado "+ valor3);

    }
}
