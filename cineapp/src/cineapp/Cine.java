package cineapp;

import java.util.Random;

public class Cine {

	private Pelicula pelicula;
	private float precio;
	private int nespectadores;
	private Espectador tespectadores[][];

	public Cine(int filas, int columnas, Pelicula pelicula, float precio) {
		this.pelicula = pelicula;
		this.precio = precio;
		this.nespectadores = 0;
		tespectadores = new Espectador[filas][columnas];
	}

	public String venderAsiento(Espectador esp) {

		if (precio > esp.getDinero()) {
			return esp.getNombre() + " No tiene dinero suficente";
		}

		if (esp.getEdad() < pelicula.getEdadminima()) {
			return esp.getNombre() + " No tiene la edad mínima ";
		}

		if (nespectadores == (tespectadores.length * tespectadores[0].length)) {
			return " La sala esta llena ";
		}

		Random rd = new Random();
		int fila = rd.nextInt(0, tespectadores.length);
		int columna = rd.nextInt(0, tespectadores[0].length);

		while (tespectadores[fila][columna] != null) {
			fila = rd.nextInt(0, tespectadores.length);
			columna = rd.nextInt(0, tespectadores[0].length);
		}

		tespectadores[fila][columna] = esp;
		nespectadores++;

		// Descuento el precio al dinero del espectador
		esp.setDinero(esp.getDinero() - precio);

		String resu = "Fila " + (fila + 1) + " Asiento " + (char) ('A' + columna);

		return resu;

	}

	public void informeSala() {

		int plazas = tespectadores.length * tespectadores[0].length;
		int ocupacion = nespectadores*100/plazas;
		
		
		System.out.println("\n INFORME DE SALA: ");
		System.out.println("Película:"+pelicula.getTitulo());        
		System.out.println("N.º de espectadores:"+nespectadores);
		System.out.println("N.º de plazas :"+plazas);
		System.out.println("Ocupación :"+ocupacion+ "%");
		System.out.println("Recaudación: "+ nespectadores*precio+ " Euros");
	}

	public void listadoEspetadores() {

		System.out.println("\nLista de espectadores");
		System.out.println("------------------------");
		System.out.println("Nombre Asiento");

		for (int i = 0; i < tespectadores.length; i++) {
			for (int j = 0; j < tespectadores[i].length; j++) {
				if (tespectadores[i][j] != null)
					System.out.println(tespectadores[i][j].getNombre() + "\t" + (i + 1) + (char) ('A' + j));
			}
		}

	}

	public void listadoAsientos() {
		
		System.out.println("\n OCUPACIÓN");
		System.out.print(" ");
		char letra = 'A';
		for (int i = 0; i < tespectadores[0].length; i++) {
		   letra = (char) ('A'+i);
		   System.out.print(" "+letra);
		}
		System.out.println();
		for (int i = 0; i < tespectadores.length; i++) {
			System.out.print(i+1);
			for (int j = 0; j < tespectadores[i].length; j++) {
				if (tespectadores[i][j] != null) {
					System.out.print(" X");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}
	
	
	

}
