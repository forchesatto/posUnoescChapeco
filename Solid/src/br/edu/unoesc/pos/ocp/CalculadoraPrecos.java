package br.edu.unoesc.pos.ocp;

public class CalculadoraPrecos {

	public double calcula(Compra produto) {
		TabelaDePrecoPadrao tabela = new TabelaDePrecoPadrao();
		Frete correios = new Frete();
		double desconto = tabela.descontoPara(produto.getValor());
		double frete = correios.para(produto.getCidade());
		return produto.getValor() * (1 - desconto) + frete;
	}
}
