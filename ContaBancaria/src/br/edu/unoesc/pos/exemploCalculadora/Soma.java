package br.edu.unoesc.pos.exemploCalculadora;

public class Soma implements Operacao{

	@Override
	public int calcular(int x, int y) {
		return x + y;
	}

}
