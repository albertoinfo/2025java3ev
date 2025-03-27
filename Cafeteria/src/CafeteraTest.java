import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CafeteraTest {

	@Test
	void testgetCapacidadActual() {
		Cafetera uno = new Cafetera ();
		uno.vaciarCafetera();
		uno.agregarCafe(200);
		assertEquals(200, uno.getCapacidadActual());
	    uno.agregarCafe(100);
	    assertEquals(300, uno.getCapacidadActual());
	    
	}
	@Test
	void testgetCapacidadMaxima() {
		Cafetera uno = new Cafetera(1000);
		assertEquals(1000, uno.getCapacidadMáxima());
		uno.vaciarCafetera();
		assertEquals(1000, uno.getCapacidadMáxima());
	}
	
	@Test 
	void testLLena () {
		Cafetera uno = new Cafetera(1000);
		uno.llenarCafetera();
		assertEquals(uno.getCapacidadActual(), uno.getCapacidadMáxima());	
	}

	@Test 
	void testServir () {
		Cafetera uno = new Cafetera(1000);
		uno.llenarCafetera();
		uno.servirTaza(100);
		assertEquals(900, uno.getCapacidadActual());
		uno.servirTaza(900);
		assertEquals(0, uno.getCapacidadActual());
		uno.servirTaza(100);
		assertEquals(0, uno.getCapacidadActual());
	}
	
	@Test
	void testAgregar() {
		Cafetera uno = new Cafetera(1000);
		uno.vaciarCafetera();
		uno.agregarCafe(100);
		uno.agregarCafe(200);
		assertEquals(300, uno.getCapacidadActual());
		uno.agregarCafe(1000);
		assertEquals(1000, uno.getCapacidadActual());
	}
}
