package br.edu.unoesc.pos;

public class Agencia {

	private String nome;
	private String numero;

	public Agencia() {

	}

	public Agencia(String nome, String numero) {
		this.nome = nome;
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}
