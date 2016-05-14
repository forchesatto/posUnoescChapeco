package br.edu.unoesc.pos.coesao;

public class QuinzeOuVinteCincoPorcento implements CalculaSalarioFuncionario {

	@Override
	public double calcula(Funcionario funcionario) {
        if(funcionario.getSalarioBase() > 2000.0) {
            return funcionario.getSalarioBase() * 0.75;
        }
        else {
            return funcionario.getSalarioBase() * 0.85;
        }
    }
}
