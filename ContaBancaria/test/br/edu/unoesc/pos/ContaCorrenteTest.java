package br.edu.unoesc.pos;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import org.junit.Test;

public class ContaCorrenteTest {

	@Test
	public void deveCriaContaCorrente(){
		Corrente corrente = new Corrente();
		corrente.setLimite(1000.0);
		corrente.setNumero(123456);
		assertThat(corrente.getLimite(), is(1000.0));
	}
	
	@Test
	public void deveConseguirSacarComLimite(){
		Corrente corrente = new Corrente();
		corrente.setLimite(1000.0);
		corrente.setNumero(123456);
		corrente.sacar(200.0);
		assertThat(corrente.getSaldo(), is(-200.0));
	}
}
