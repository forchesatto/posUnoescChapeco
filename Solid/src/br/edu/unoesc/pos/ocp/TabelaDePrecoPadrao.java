package br.edu.unoesc.pos.ocp;

public class TabelaDePrecoPadrao {

	public double descontoPara(Double valor) {
		if (valor > 5000)
			return 0.03;
		if (valor > 1000)
			return 0.05;
		return 0;
	}

}
