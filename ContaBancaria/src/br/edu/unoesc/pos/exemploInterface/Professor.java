package br.edu.unoesc.pos.exemploInterface;

public class Professor implements AcessaPortal {

	private String nickname;

	@Override
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
}
