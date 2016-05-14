package br.edu.unoesc.pos.coesao;

public class Funcionario {

	private Double salarioBase;
	private Cargo cargo;

	public Double getSalarioBase() {
		return salarioBase;
	}
	
	public Double getSalarioLiquido(){
		return this.cargo.getCalculadora().calcula(this);
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

}
