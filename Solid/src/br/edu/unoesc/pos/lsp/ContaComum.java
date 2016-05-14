package br.edu.unoesc.pos.lsp;

/**
 * Exemplo base retirado do livro "Orientação a Objeto e SOLID para ninjas." 
 * @author forchesatto
 *
 */
public class ContaComum {

	protected double saldo;

	public ContaComum() {
		this.saldo = 0;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public double getSaldo() {
		return saldo;
	}

	public void rende() {
		this.saldo *= 1.1;
	}
}
