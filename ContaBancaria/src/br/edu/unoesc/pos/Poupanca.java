package br.edu.unoesc.pos;

public class Poupanca extends Conta {

	private Double rendimento;

	public Poupanca() {
		super();
	}

	public Poupanca(Integer numero, Cliente cliente, Agencia agencia) {
		super(numero, cliente, agencia);
	}

	public Double getRendimento() {
		return rendimento;
	}

	public void setRendimento(Double rendimento) {
		this.rendimento = rendimento;
	}

	@Override
	public Double getSaldoDisponivel() {
		return getSaldo();
	}
}
