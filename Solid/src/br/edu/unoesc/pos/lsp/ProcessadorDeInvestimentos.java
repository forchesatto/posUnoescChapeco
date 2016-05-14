package br.edu.unoesc.pos.lsp;

import java.util.ArrayList;
import java.util.List;

public class ProcessadorDeInvestimentos {

	public static void main(String[] args) {

        for (ContaComum conta : contasDoBanco()) {
            conta.rende();

            System.out.println("Novo Saldo:");
            System.out.println(conta.getSaldo());
        }
    }
	
	private static List<ContaComum> contasDoBanco(){
		List<ContaComum> contas = new ArrayList<>();
		contas.add(new ContaComum());
		contas.add(new ContaEstudante());
		return contas;
	}
}
