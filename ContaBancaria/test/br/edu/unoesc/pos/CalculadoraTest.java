package br.edu.unoesc.pos;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void deveCalcularSaldoBanco(){
		CalculadoraSaldoBanco calculadora = new CalculadoraSaldoBanco();
		
		Poupanca poup1 = new Poupanca();
		poup1.depositar(100.0);
		calculadora.add(poup1);
		
		Corrente corrente1 = new Corrente();
		corrente1.depositar(200.00);
		calculadora.add(corrente1);

		assertThat(calculadora.calcular(), is(300.0));
		
	}
}
