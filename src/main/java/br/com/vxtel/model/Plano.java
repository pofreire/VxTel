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

	public float retornaTempoMenosDuracao(Integer tempo) {
		float valor = tempo - this.duracao;
		
		if(valor < 0) {
			return 0;
		}else {
			valor += valor * 0.1;
		}
		
		return valor;
	}
	
}
