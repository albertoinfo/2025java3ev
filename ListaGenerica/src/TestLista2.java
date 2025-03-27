
public class TestLista2 {

	public static void main(String[] args) {
		
		Lista <Alumno> l = new Lista<Alumno>();
		
		l.ponAlPrincipio( new Alumno (100,"Luis", 7.5f));
		l.ponAlPrincipio( new Alumno (101,"Ana", 8.5f));
		l.ponAlPrincipio( new Alumno (103,"Silvia", 5.5f));
		
		Alumno manolo =  new Alumno( 105,"Manolo",3.5f);
		l.ponAlFinal(manolo);
		
		Alumno pedro =   new Alumno ( 205," Pedro", 9.5f);
		
		if ( l.esta(manolo)) {
			System.out.println(" Está "+manolo);
		} else {
			System.out.println(" NO Está "+manolo);
		}
		
		if ( l.esta(pedro)) {
			System.out.println(" Está "+pedro);
		} else {
			System.out.println(" NO Está "+pedro);
		}
		
		
		System.out.println("Nº de elementos: "+ l.numelementos()+" Lista "+l);
		
		l.borrarPrimero();
		
		System.out.println("Nº de elementos: "+ l.numelementos()+" Lista "+l);
		
		
		
	}

}
