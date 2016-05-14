package br.edu.unoesc.pos.exemploCalculadora;

/**
 * Classe que sabe fazer uma conta de subtração
 * @author forchesatto
 *
 */
public class Subtracao extends Operacao {

	/**
	 * O valor 1 será subtraido do valor 2
	 * @param x valor 1 
	 * @param y valor 2
	 */
	@Override
	public int calcular(int x, int y) {
		return x - y;
	}

}
