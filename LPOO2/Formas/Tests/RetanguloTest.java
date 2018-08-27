import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RetanguloTest {
	@Test
	void testCriaRetangulo() {
		double lado = 4;
		double altura = 3;
		
		Retangulo objAtual = new Retangulo(lado, altura);
		
		assertNotNull(objAtual);
		assertEquals(4, objAtual.getLado());
		assertEquals(3, objAtual.getAltura());
				
		assertThrows(RuntimeException.class, () -> new Retangulo(-2, -5));
	}
	
	@Test
	void testAreaRetangulo() {
		double lado = 2;
		double altura = 3;
		
		Retangulo retangulo = new Retangulo(lado, altura);
		double areaAtual = retangulo.area();
		double areaEsperada = lado*altura;
		
		assertEquals(areaEsperada, areaAtual);
	}

	@Test
	void testArea() {
		double lado = 5;
		double altura = 2;
		
		Retangulo retangulo = new Retangulo(lado, altura);
		double areaAtual = retangulo.area();
		double areaEsperada = lado*altura;
		
		assertEquals(areaEsperada, areaAtual);
	}
	
	@Test
	void testTrianguloPerimetro() {
		double lado = 5;
		double altura = 2;
		
		Retangulo retangulo = new Retangulo(lado, altura);
		double perimetroAtual = retangulo.perimetro();
		double perimetroEsperado = (lado*2)+(altura*2);
		
		assertEquals(perimetroEsperado, perimetroAtual);
	}

	@Test
	void testPerimetro() {
		double lado = 10;
		double altura = 2;
		
		Retangulo retangulo = new Retangulo(lado, altura);
		double perimetroAtual = retangulo.perimetro();
		double perimetroEsperado = (lado*2)+(altura*2);
		
		assertEquals(perimetroEsperado, perimetroAtual);
	}
}
