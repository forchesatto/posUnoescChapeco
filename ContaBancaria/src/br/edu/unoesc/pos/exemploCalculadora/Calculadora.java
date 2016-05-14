package br.edu.unoesc.pos.exemploCalculadora;

public class Calculadora {

	public void mostrarResultado(Operacao operacao, int x, int y){
		System.out.println("Resultado = "+operacao.calcular(x, y));
	}
	
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		calculadora.mostrarResultado(new Soma(), 10, 10);
		
		calculadora.mostrarResultado(new Subtracao(), 10, 5);
	}
}
