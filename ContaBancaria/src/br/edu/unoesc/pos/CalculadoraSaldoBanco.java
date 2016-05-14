package br.edu.unoesc.pos;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraSaldoBanco {

	private List<Conta> contas;

	public CalculadoraSaldoBanco() {
		contas = new ArrayList<>();
	}
	
	public Double calcular(){
		//Java 7
		Double saldoTotal = 0.0;
		for(Conta conta: contas){
			saldoTotal += conta.getSaldo();
		}
		return saldoTotal;
		//
		//Java 8
		//return contas.stream().mapToDouble(conta->conta.getSaldo()).sum();
		//return contas.stream().mapToDouble(Conta::getSaldo).sum();
		//
	}

	public CalculadoraSaldoBanco(List<Conta> contas) {
		this.contas = contas;
	}
	
	public void add(Conta conta){
		contas.add(conta);
	}

}
