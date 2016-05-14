package br.edu.unoesc.pos.lsp;

public class ContaEstudante extends ContaComum {

	public void rende() {
		throw new ContaNaoRendeException();
	}
}
