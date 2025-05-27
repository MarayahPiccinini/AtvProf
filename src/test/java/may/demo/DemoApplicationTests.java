package may.demo;


import may.demo.Service.CalculadoraService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

@Test
public void testDividir(){
		CalculadoraService calculadoraService = new CalculadoraService();
		double a = 10;
		double b = 2;
		double esperado = 5;

		double resultado = calculadoraService.dividir(a,b);

		assertEquals(esperado, resultado);
	}
}
