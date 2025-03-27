package cineapp;

public class Pelicula {
     //  tienen los atributos  título, duración(minutos), edad mínima, genero.
	
	private String titulo;
	private int duracion;
	private int edadminima;
	private Genero genero;
	
	public Pelicula(String titulo, int duracion, int edadminima, Genero genero) {
		super();
		this.titulo = titulo;
		this.duracion = duracion;
		this.edadminima = edadminima;
		this.genero = genero;
	}
	public int getEdadminima() {
		return edadminima;
	}
	public void setEdadminima(int edadminima) {
		this.edadminima = edadminima;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	@Override
	public String toString() {
		return  titulo + ":" + duracion + " minutos " + genero ;
	}
	
	
}
