package br.edu.unoesc.pos;

import java.util.ArrayList;
import java.util.Collection;

public class Cliente {

	private String cpf;
	private String nome;
	private Collection<Conta> contas;
	
	public Cliente(){
		
	}
	
	public Cliente(String cpf, String nome) {
		super();
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public Double getSaldoGeral(){
//		 Double saldo = 0.0;
//		contas.stream().forEach(conta-> saldo += conta.getSaldo());
//		return saldo;
		Double saldo = 0.0;
		for(Conta conta: contas){
			saldo += conta.getSaldo();
		}
		return saldo;
	}
	
	public void addConta(Conta conta){
		if(contas == null){
			contas = new ArrayList<>();
		}
		contas.add(conta);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Collection<Conta> getContas() {
		return contas;
	}

	public void setContas(Collection<Conta> contas) {
		this.contas = contas;
	}

}
