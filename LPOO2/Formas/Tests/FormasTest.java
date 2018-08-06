import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FormasTest {
	@Test
	void testAreaCircunferenciaNumeroInteiroPositivo() {
		double raio = 2;
		double area = Formas.calculaAreaCircunferencia(raio);
		double areaEsperada = 2*Math.PI*(raio*raio);
		
		assertEquals(areaEsperada, area, 0.1);
	}
	
	@Test
	void testAreaCircunferenciaNumeroDecimalPositivo() {
		double raio = 2.56;
		double area = Formas.calculaAreaCircunferencia(raio);
		double areaEsperada = 2*Math.PI*(raio*raio);
		
		assertEquals(areaEsperada, area, 0.1);
	}
	
	@Test
	void testAreaCircunferenciaZero() {
		double raio = 0;
		double area = Formas.calculaAreaCircunferencia(raio);
		double areaEsperada = 2*Math.PI*(raio*raio);
		
		assertEquals(areaEsperada, area, 0.1);
	}
	
	@Test
	void testAreaCircunferenciaNumeroNegativo() {
		double raio = -5;
		double area = Formas.calculaAreaCircunferencia(raio);
		double areaEsperada = 2*Math.PI*(raio*raio);
		
		assertEquals(areaEsperada, area, 0.1);
	}
	
	@Test
	void testAreaCircunferenciaNumeroDecimalNegativo() {
		double raio = -5.43;
		double area = Formas.calculaAreaCircunferencia(raio);
		double areaEsperada = 2*Math.PI*(raio*raio);
		
		assertEquals(areaEsperada, area, 0.1);
	}
}
