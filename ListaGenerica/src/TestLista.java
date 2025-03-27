
public class TestLista {

	public static void main(String[] args) {
		
		Lista <String> l = new Lista<String>();
		
		l.ponAlPrincipio("Hola");
		l.ponAlPrincipio("Pepe");
		l.ponAlFinal("Luis");
		
		if ( l.esta("Luis")) {
			System.out.println(" Está Luis");
		} else {
			System.out.println(" NO Está el Luis");
		}
		
		if ( l.esta("José")) {
			System.out.println(" Está el José");
		} else {
			System.out.println(" NO Está José");
		}
		
		
		System.out.println("Nº de elementos: "+ l.numelementos()+" Lista "+l);
		
		l.borrarPrimero();
		
		System.out.println("Nº de elementos: "+ l.numelementos()+" Lista "+l);
		
		
		
	}

}
