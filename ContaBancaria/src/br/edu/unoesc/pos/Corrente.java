package br.edu.unoesc.pos;

public class Corrente extends Conta {

	private Double limite = 0.0;
	
	public Corrente() {
		super();
	}

	public Corrente(Integer numero, Cliente cliente, Agencia agencia) {
		super(numero, cliente, agencia);
	}
	
	public Corrente(Integer numero, Cliente cliente, Agencia agencia, 
			Double limite) {
		super(numero, cliente, agencia);
		this.limite = limite;
	}

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}

	@Override
	public Double getSaldoDisponivel() {
		return getSaldo() + limite;
	}
}
