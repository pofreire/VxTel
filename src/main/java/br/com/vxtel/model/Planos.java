package br.com.vxtel.model;

public enum Planos {
	
	FALEMAIS30(30),
	FALEMAIS60(60),
	FALEMAIS120(120);
	
	private Integer duracao;
	
	private Planos(Integer duracao) {
		this.duracao = duracao;
	}

	public Integer getDuracao() {
		return duracao;
	}
	
}
