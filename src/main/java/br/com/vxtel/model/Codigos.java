package br.com.vxtel.model;

import java.util.Arrays;
import java.util.List;

public class Codigos {
	
	private List<Object> origem;
	
	private List<Object> destino;

	public List<Object> getOrigem() {
		origem = Arrays.asList(11, 16, 17, 18);
		return origem;
	}

	public void setOrigem(List<Object> origem) {
		this.origem = origem;
	}

	public List<Object> getDestino() {
		destino = Arrays.asList(11, 16, 17, 18);
		return destino;
	}

	public void setDestino(List<Object> destino) {
		this.destino = destino;
	}
	
}
