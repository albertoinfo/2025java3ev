
public class Alumno {
    int nmatricula;
    String nombre;
    float nota;
    
	public Alumno(int nmatricula, String nombre, float nota) {
		super();
		this.nmatricula = nmatricula;
		this.nombre = nombre;
		this.nota = nota;
	}

	@Override
	public String toString() {
		return " ["+ nmatricula + " " + nombre + " " + nota + "]";
	}
    
	
	
    
}
