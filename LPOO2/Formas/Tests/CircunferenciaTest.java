import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircunferenciaTest {
	@Test
	void testCriaCircunferencia() {
		double raio = 4;
		Circunferencia objAtual = new Circunferencia(raio);
		
		assertNotNull(objAtual);
		assertEquals(4, objAtual.getRaio());
		
		assertThrows(RuntimeException.class, () -> new Circunferencia(-2));
	}
	
	@Test
	void testAreaCircunferencia() {
		double raio = 4;
		
		Circunferencia circunferencia = new Circunferencia(raio);
		double areaAtual = circunferencia.area();
		double areaEsperada = 2*Math.PI*(raio*raio);
		
		assertEquals(areaEsperada, areaAtual, 0.01);
	}
	
	@Test
	void testArea() {
		double raio = 7;
		
		Circunferencia circunferencia = new Circunferencia(raio);
		double areaAtual = circunferencia.area();
		double areaEsperada = 2*Math.PI*(raio*raio);
		
		assertEquals(areaEsperada, areaAtual, 0.01);
	}
}
