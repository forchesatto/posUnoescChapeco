package br.edu.unoesc.pos.coesao;

public enum Cargo {

	DESENVOLVEDOR(new DezOuVintePorcento()), 
	DBA(new QuinzeOuVinteCincoPorcento()), 
	TESTER(new QuinzeOuVinteCincoPorcento());

	Cargo(CalculaSalarioFuncionario calculadora) {
		this.calculadora = calculadora;
	}

	private CalculaSalarioFuncionario calculadora;

	public CalculaSalarioFuncionario getCalculadora() {
		return calculadora;
	}

}
