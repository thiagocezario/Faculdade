import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TrianguloTest {
	@Test
	void testCriaTriangulo() {
		double base = 4;
		double altura = 5;
		
		Triangulo objAtual = new Triangulo(base, altura);
		
		assertNotNull(objAtual);
		assertEquals(4, objAtual.getBase());
		assertEquals(5, objAtual.getAltura());
				
		assertThrows(RuntimeException.class, () -> new Triangulo(-2, -2));
	}
	
	@Test
	void testAreaTriangulo() {
		double base = 2;
		double altura = 5;
		
		Triangulo triangulo = new Triangulo(base, altura);
		double areaAtual = triangulo.area();
		double areaEsperada = (base*altura)/2;
		
		assertEquals(areaEsperada, areaAtual, 0.01);
	}
	
	@Test
	void testArea() {
		double base = 5;
		double altura = 2;
		
		Triangulo triangulo = new Triangulo(base, altura);
		double areaAtual = triangulo.area();
		double areaEsperada = (base*altura)/2;
		
		assertEquals(areaEsperada, areaAtual);
	}
}
