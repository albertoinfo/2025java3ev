
/**
 * Write a description of class TCajaGenerica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TCajaGenerica
{
    public static void  main( String cadena[] ){
     
        CajaGenerica <Integer> micaja = new CajaGenerica <Integer>();
        micaja.pon(23);
        Integer valor =  micaja.quita();
        System.out.println( " Valor almacenado "+ valor);
        
        CajaGenerica  <String> micaja2 = new CajaGenerica <String>();
        micaja2.pon("Mensaje ");
        String valors = micaja2.quita();
        System.out.println( " Valor almacenado "+ valors);
        
        // Error detectado por en compilador
        //micaja.pon(" Mensaje 2");
        
        CajaGenerica<Float> pepe = new CajaGenerica<Float>();
        pepe.pon(23.5f);
        
    }    
}
