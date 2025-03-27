
/**
 * Write a description of class ExcepcionRara here.
 *  Ejemplo de Excepcion que heredad de RuntimeException
 *  NO tiene que ser capturada de forma obligatoria
 *  Pero si se produce termina el programa
 * @author (Alberto) 
 * @version (2/04/2018)
 */
public class ExcepcionRara extends RuntimeException {

    ExcepcionRara ( String mensaje ){
        super( mensaje );
    }
}