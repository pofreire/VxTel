package br.com.vxtel.model;

public enum Plano {
	
	FALEMAIS30(30),
	FALEMAIS60(60),
	FALEMAIS120(120);
	
	private Integer duracao;
	
	private Plano(Integer duracao) {
		this.duracao = duracao;
	}

	public Integer getDuracao() {
		return duracao;
	}
	
}
