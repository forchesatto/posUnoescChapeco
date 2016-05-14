package br.edu.unoesc.pos;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ContaTest {
	
	private Conta conta;
	
	@Before
	public void before(){
		conta = new Conta();
		conta.depositar(100.0);
	}

	@Test
	public void deveDepositarEAlteraroSaldo() {
		conta.depositar(120.0);
		assertThat(conta.getSaldo(), is(220.00));
	}
	
	@Test
	public void deveSacarEAltearSaldo(){
		conta.sacar(100.0);
		assertThat(conta.getSaldo(), is(0.00));
	}

	@Test
	public void deveTransferirDeUmaContaParaOutra(){
		Conta conta2 = new Conta();
		
		conta.transferirPara(conta2, 100.0);
		
		assertThat(conta.getSaldo(), is(0.00));
		assertThat(conta2.getSaldo(), is(100.00));
	}
	@Test
	public void devePopularClienteEAgencia(){
		Agencia agencia = new Agencia("XXE", "09876");
		Cliente cliente = new Cliente("999999", "André");
		Conta conta = new Conta(1234,cliente,agencia);
		
		assertNotNull(conta.getCliente());
		assertNotNull(conta.getAgencia());
		
		assertEquals("André", conta.getCliente().getNome());
		assertEquals("XXE", conta.getAgencia().getNome());
		
	}
	
	@Test
	public void devePopularContaNoCliente(){
		Agencia agencia = new Agencia("XXE", "09876");
		Cliente cliente = new Cliente("999999", "André");
		Conta conta = new Conta(1234,cliente,agencia);
		
		cliente.addConta(conta);
		
		assertThat(cliente.getContas().size(), is(1));
		
	}
	
	@Test
	public void deveCalcularSaldo(){
		Agencia agencia = new Agencia("XXE", "09876");
		Cliente cliente = new Cliente("999999", "André");
		Conta conta = new Conta(1234,cliente,agencia);
		conta.depositar(100.0);
		cliente.addConta(conta);
		
		assertThat(cliente.getSaldoGeral(), is(100.0));
		
	}
	
	
	
	
	
}
