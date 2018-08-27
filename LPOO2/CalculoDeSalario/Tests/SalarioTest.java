import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SalarioTest {
	@Test
	void testSalarioBrutoPositivo() {
		double salarioHora = 15.00;
		double horasTrabalhadas = 120;
		double salarioBrutoAtual = salarioHora*horasTrabalhadas;
		double salarioBrutoEsperado = Salario.CalculoSalarioBruto(salarioHora, horasTrabalhadas);
		
		assertEquals(salarioBrutoEsperado, salarioBrutoAtual, 0.1);
	}
	
	@Test
	void testSalarioBrutoNegativo() {
		double salarioHora = -5.00;
		double horasTrabalhadas = 120;
		assertThrows(RuntimeException.class, () -> Salario.CalculoSalarioBruto(salarioHora, horasTrabalhadas));		
	}
	
	@Test
	void testSalarioLiquidoPositivo() {
		double salarioBruto = 2000.00;
		double desconto = 0.05;
		double salarioLiquidoEsperado = salarioBruto - (salarioBruto*desconto);
		double salarioLiquidoAtual = Salario.CalculoSalarioLiquido(salarioBruto, desconto);
		
		assertEquals(salarioLiquidoEsperado, salarioLiquidoAtual, 0.1);
	}
	
	@Test
	void testSalarioLiquidoNegativo() {
		double salarioBruto = -2000.00;
		double desconto = 5.00;
		assertThrows(RuntimeException.class, () -> Salario.CalculoSalarioLiquido(salarioBruto, desconto));
	}
}
