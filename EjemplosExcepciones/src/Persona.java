/**
 *  Clase que tiene un método que genera distintos tipos de excepciones. 
 * @author alberto
 * @version 1.0
 *
 */

public class Persona {
	private int edad;
	private String nombre;
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/*
	 * El metodo puede lazar la excepcion Definida ExceptionNegativo o IllegalArgumentException
	 */
    public void setEdad(int edadNueva) throws  IllegalArgumentException, ExceptionNegativo{
    	if( edadNueva > 100) throw new IllegalArgumentException("Edad no válida");
    	if( edadNueva < 0 )  throw new ExceptionNegativo(edadNueva);
    	
        edad = edadNueva;
    }
    
    public void incEdad() throws ExcepcionRara{
        edad = edad +1;
        if ( edad > 100 )  throw new ExcepcionRara("Mas de 100 años");
    }
    
	public String toString(){
    	return "La edad de "+nombre + " es "+ edad +" años.";
    }
}