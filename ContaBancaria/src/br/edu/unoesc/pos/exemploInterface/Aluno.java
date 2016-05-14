package br.edu.unoesc.pos.exemploInterface;

public class Aluno implements AcessaPortal {

	private String nickname;
	
	@Override
	public String getNickname() {
		return nickname;
	}

	public void setNickName(String nickName) {
		this.nickname = nickName;
	}
}
