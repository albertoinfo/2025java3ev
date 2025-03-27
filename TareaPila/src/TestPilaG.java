import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestPilaG {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test 
	void testConstructor () {
		PilaG <String> pila = new PilaG <String>(10);
		assertTrue(pila.estaVacio());
		pila.push("HOla");
		assertFalse(pila.estaVacio());
		
	}

}
