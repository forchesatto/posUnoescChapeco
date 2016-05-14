package br.edu.unoesc.pos;

public abstract class Conta {

	private Integer numero;
	private Double saldo = 0.0;
	private Cliente cliente;
	private Agencia agencia;

	public Conta() {

	}

	public Conta(Integer numero, Cliente cliente, Agencia agencia) {
		this.numero = numero;
		this.cliente = cliente;
		this.agencia = agencia;
	}

	public void depositar(Double valor) {
		saldo += valor;
	}

	public Double getSaldo() {
		return saldo;
	}

	public final void sacar(Double valor) {
		if(getSaldoDisponivel() >= valor){
			saldo -= valor;	
		} else {
			throw new IllegalArgumentException("Valor a ser sacado "
					+ "maior que o disponível");
		}
	}
	
	/**
	 * Método utilizado na método sacar para determinar o 
	 * saldo disponível para saque
	 * @return Double saldo disponível
	 */
	public abstract Double getSaldoDisponivel();

	public void transferirPara(Conta conta, Double valor) {
		this.sacar(valor);
		conta.depositar(valor);
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

}
