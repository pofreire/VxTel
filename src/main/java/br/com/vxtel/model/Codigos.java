package br.com.vxtel.model;

import java.util.Arrays;
import java.util.List;

public class Codigos {
	
	private List<Integer> origem;
	
	private List<Integer> destino;

	public List<Integer> getOrigem() {
		origem = Arrays.asList(11, 16, 17, 18);
		return origem;
	}

	public void setOrigem(List<Integer> origem) {
		this.origem = origem;
	}

	public List<Integer> getDestino() {
		destino = Arrays.asList(11, 16, 17, 18);
		return destino;
	}

	public void setDestino(List<Integer> destino) {
		this.destino = destino;
	}
	
}
