package br.com.vxtel.service;

import org.springframework.stereotype.Service;

import br.com.vxtel.model.Plano;
import br.com.vxtel.model.Tarifa;

@Service
public class TarifaServiceImpl implements TarifaService{

	@Override
	public Tarifa calculaTarifa(Integer origem, Integer destino, Plano plano, Integer tempo){

		double comFaleMais = 0;
		double semFaleMais = 0;
		double acrescimo = 0;
		int novoTempo = tempo - plano.getDuracao() < 0 ? 0 : plano.getDuracao();
		
		if (novoTempo > 0) {
			acrescimo = 0.1;
		}
				
		if(origem.equals(11) && destino.equals(16)) {
			double valor = novoTempo * 1.9;
			comFaleMais = valor + (valor * acrescimo);
			semFaleMais = (tempo * 1.9);
		}
		
		if(origem.equals(16) && destino.equals(11)) {
			double valor = novoTempo * 2.9;
			comFaleMais = valor + (valor * acrescimo);
			semFaleMais = (tempo * 2.9);
		}
		
		if(origem.equals(11) && destino.equals(17)) {
			double valor = novoTempo * 1.7;
			comFaleMais = valor + (valor * acrescimo);
			semFaleMais = (tempo * 1.7);
		}
		
		if(origem.equals(17) && destino.equals(11)) {
			double valor = novoTempo * 2.7;
			comFaleMais = valor + (valor * acrescimo);
			semFaleMais = (tempo * 2.7);
		}
		
		if(origem.equals(11) && destino.equals(18)) {
			double valor = novoTempo * .9;
			comFaleMais = valor + (valor * acrescimo);
			semFaleMais = (tempo * .9);
		}
		
		if(origem.equals(18) && destino.equals(11)) {
			double valor = novoTempo * 1.9;
			comFaleMais = valor + (valor * acrescimo);
			semFaleMais = (tempo * 1.9);
		}
			
		Tarifa tarifa = new Tarifa(origem, destino, plano, tempo, comFaleMais, semFaleMais);
		return tarifa;
	}
	
}
