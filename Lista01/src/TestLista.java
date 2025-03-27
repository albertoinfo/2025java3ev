
public class TestLista {

	public static void main(String[] args) {
		
		Lista l = new Lista();
		
		l.ponAlPrincipio(10);
		l.ponAlPrincipio(5);
		l.ponAlFinal(100);
		
		if ( l.esta(100)) {
			System.out.println(" Está el 100");
		} else {
			System.out.println(" NO Está el 100");
		}
		
		if ( l.esta(101)) {
			System.out.println(" Está el 101");
		} else {
			System.out.println(" NO Está el 101");
		}
		
		
		System.out.println("Nº de elementos: "+ l.numelementos()+" Lista "+l);
		
		l.borrarPrimero();
		
		System.out.println("Nº de elementos: "+ l.numelementos()+" Lista "+l);
		
		
		
	}

}
