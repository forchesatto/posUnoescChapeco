package br.edu.unoesc.pos.ocp;

public class Frete {

	public double para(String cidade) {
		if ("SAO PAULO".equals(cidade.toUpperCase())) {
			return 15;
		}
		return 30;
	}

}
