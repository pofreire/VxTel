package br.com.vxtel.model;

public class Tarifa {

	private Integer origem; 
	private Integer destino; 
	private Plano plano; 
	private Integer tempo;
	double comFaleMais = 0;
	double semFaleMais = 0;
	
	public Tarifa(Integer origem, Integer destino, Plano plano, Integer tempo, double comFaleMais, double semFaleMais) {
		super();
		this.origem = origem;
		this.destino = destino;
		this.plano = plano;
		this.tempo = tempo;
		this.comFaleMais = comFaleMais;
		this.semFaleMais = semFaleMais;
	}
	
	public Integer getOrigem() {
		return origem;
	}
	public void setOrigem(Integer origem) {
		this.origem = origem;
	}
	public Integer getDestino() {
		return destino;
	}
	public void setDestino(Integer destino) {
		this.destino = destino;
	}
	public Plano getPlano() {
		return plano;
	}
	public void setPlano(Plano plano) {
		this.plano = plano;
	}
	public Integer getTempo() {
		return tempo;
	}
	public void setTempo(Integer tempo) {
		this.tempo = tempo;
	}
	public double getComFaleMais() {
		return comFaleMais;
	}
	public void setComFaleMais(double comFaleMais) {
		this.comFaleMais = comFaleMais;
	}
	public double getSemFaleMais() {
		return semFaleMais;
	}
	public void setSemFaleMais(double semFaleMais) {
		this.semFaleMais = semFaleMais;
	}
	
	
}
