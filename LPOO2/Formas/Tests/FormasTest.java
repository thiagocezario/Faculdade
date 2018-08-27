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
		assertThrows(RuntimeException.class, () -> Formas.calculaAreaCircunferencia(raio));
		
	}
	
	@Test
	void testAreaCircunferenciaNumeroDecimalNegativo() {
		double raio = -5.43;
		assertThrows(RuntimeException.class, () -> Formas.calculaAreaCircunferencia(raio));
	}
	
	@Test
	void testAreaRetanguloNumeroInteiroPositivo() {
		double lado1 = 2;
		double lado2 = 3;
		double area = Formas.calculaAreaRetangulo(lado1, lado2);
		double areaEsperada = lado1*lado2;
		
		assertEquals(areaEsperada, area, 0.1);
	}
	
	@Test
	void testAreaRetanguloNumeroDecimalPositivo() {
		double lado1 = 2.2;
		double lado2 = 3.5;
		double area = Formas.calculaAreaRetangulo(lado1, lado2);
		double areaEsperada = lado1*lado2;
		
		assertEquals(areaEsperada, area, 0.1);
	}
	
	@Test
	void testAreaRetanguloZero() {
		double lado1 = 0;
		double lado2 = 0;
		double area = Formas.calculaAreaRetangulo(lado1, lado2);
		double areaEsperada = lado1*lado2;
		
		assertEquals(areaEsperada, area, 0.1);
	}
	
	@Test
	void testAreaRetanguloNumeroNegativo() {
		double lado1 = -2;
		double lado2 = -3;
		assertThrows(RuntimeException.class, () -> Formas.calculaAreaRetangulo(lado1, lado2));
	}
	
	@Test
	void testAreaRetanguloNumeroDecimalNegativo() {
		double lado1 = -2.2;
		double lado2 = -5.3;
		assertThrows(RuntimeException.class, () -> Formas.calculaAreaRetangulo(lado1, lado2));
	}
	
	@Test
	void testAreaTrianguloNumeroInteiroPositivo() {
		double base = 2;
		double altura = 5;
		double area = Formas.calculaAreaTriangulo(base, altura);
		double areaEsperada = (base*altura)/2;
		
		assertEquals(areaEsperada, area, 0.1);
	}
	
	@Test
	void testAreaTrianguloNumeroDecimalPositivo() {
		double base = 2.2;
		double altura = 5.7;
		double area = Formas.calculaAreaTriangulo(base, altura);
		double areaEsperada = (base*altura)/2;
		
		assertEquals(areaEsperada, area, 0.1);
	}
	
	@Test
	void testAreaTrianguloZero() {
		double base = 0;
		double altura = 0;
		double area = Formas.calculaAreaTriangulo(base, altura);
		double areaEsperada = (base*altura)/2;
		
		assertEquals(areaEsperada, area, 0.1);
	}
	
	@Test
	void testAreaTrianguloNumeroNegativo() {
		double base = -22;
		double altura = -5;
		assertThrows(RuntimeException.class, () -> Formas.calculaAreaTriangulo(base, altura));
	}
	
	@Test
	void testAreaTrianguloNumeroDecimalNegativo() {
		double base = -2.2;
		double altura = -1.5;
		assertThrows(RuntimeException.class, () -> Formas.calculaAreaTriangulo(base, altura));
	}
}
