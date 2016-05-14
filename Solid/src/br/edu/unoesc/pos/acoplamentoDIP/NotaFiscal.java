package br.edu.unoesc.pos.acoplamentoDIP;

public class NotaFiscal {

	private Double valor;
	private Double imposto;
	
	public NotaFiscal(double valor, double imposto) {
		this.valor = valor;
		this.imposto = imposto;
	}

	public Double getValor() {
		return valor;
	}

	public Double getImposto() {
		return imposto;
	}
	
	

}
