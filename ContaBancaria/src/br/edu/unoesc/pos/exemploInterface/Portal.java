package br.edu.unoesc.pos.exemploInterface;

public class Portal {

	public static void main(String[] args) {
		Professor professor = new Professor();
		professor.setNickname("Professor André");
		
		Aluno aluno = new Aluno();
		aluno.setNickName("Aluno João");
		
		Portal portal = new Portal();
		portal.acessa(professor);
		portal.acessa(aluno);
		
	}
	
	public void acessa(AcessaPortal acessaPortal){
		System.out.println("Bem vindo: "+acessaPortal.getNickname());
	}
}
