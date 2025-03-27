import java.util.Scanner;

public class Test {
	static String tpalabros[] = { "caca", "culo", "pedo", "pis" };

	public static void main(String argv[]) {

		Scanner sc = new Scanner(System.in);
		String linea = "";
		System.out.println("Introduce tus mensajes, o pulsa . Para terminar:");

		boolean error ;
		do {
			error = false;
			try {
				linea = leerLineaOK(sc);
				
			} catch (BurradasNOException e) {
				System.out.println(e.getMessage());
				error = true;
			}
			
			if ( ! error) System.out.println("OK.");
			
		} while (!linea.contentEquals("."));
		
		System.out.println(" FIN DE PROGRAMA.");
	}

	public static String leerLineaOK(Scanner sc) throws BurradasNOException {
		String cadena = sc.nextLine();
		
		for ( int i= 0; i< tpalabros.length; i++) {
			if ( cadena.toLowerCase().contains(tpalabros[i]) ) {
		         throw new BurradasNOException(tpalabros[i]);
			}     
		}
		return cadena;
	}
}

		
		
		
		
		