
public class BurradasNOException extends Exception {
	
	public BurradasNOException (String palabra) {
		super("Error no se permite lenguaje obsceno :"+ palabra);
	}

}
