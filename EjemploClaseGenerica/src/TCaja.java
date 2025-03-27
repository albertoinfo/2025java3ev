
/**
 * Prueba de la clase caja que guarda Integer (int)
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TCaja
{
    public static void  main( String cadena[] ){
     
        Caja micaja = new Caja();
        micaja.pon(100);
        micaja.pon(105);
        Integer valor = micaja.quita();
        System.out.println( " Valor almacenado "+ valor);
        valor = micaja.quita();
        System.out.println( " Valor almacenado "+ valor);
    }
}
