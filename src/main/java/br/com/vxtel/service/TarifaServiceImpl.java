package br.com.vxtel.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import br.com.vxtel.model.Plano;
import br.com.vxtel.model.Tarifa;

@Service
public class TarifaServiceImpl implements TarifaService{

	@Override
	public Tarifa calculaTarifa(Integer origem, Integer destino, Plano plano, Integer tempo){

		double comFaleMais = 0;
		double semFaleMais = 0;
		List<Integer> codigos = Arrays.asList(11, 16, 17, 18);
		
		if(!codigos.contains(origem) || !codigos.contains(destino)) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Código informado inválido!");
		}
				
		if(origem.equals(11) && destino.equals(16)) {
			float porcentagem = 1.9f;
			comFaleMais = retornaFaleMais(plano, tempo, porcentagem);
			semFaleMais = retornaSemFaleMais(tempo, porcentagem);
		}
		
		if(origem.equals(16) && destino.equals(11)) {
			float porcentagem = 2.9f;
			comFaleMais = retornaFaleMais(plano, tempo, porcentagem);
			semFaleMais = retornaSemFaleMais(tempo, porcentagem);
		}
		
		if(origem.equals(11) && destino.equals(17)) {
			float porcentagem = 1.7f;
			comFaleMais = retornaFaleMais(plano, tempo, porcentagem);
			semFaleMais = retornaSemFaleMais(tempo, porcentagem);
		}
		
		if(origem.equals(17) && destino.equals(11)) {
			float porcentagem = 2.7f;
			comFaleMais = retornaFaleMais(plano, tempo, porcentagem);
			semFaleMais = retornaSemFaleMais(tempo, porcentagem);
		}
		
		if(origem.equals(11) && destino.equals(18)) {
			float porcentagem = .9f;
			comFaleMais = retornaFaleMais(plano, tempo, porcentagem);
			semFaleMais = retornaSemFaleMais(tempo, porcentagem);
		}
		
		if(origem.equals(18) && destino.equals(11)) {
			float porcentagem = 1.9f;
			comFaleMais = retornaFaleMais(plano, tempo, porcentagem);
			semFaleMais = retornaSemFaleMais(tempo, porcentagem);
		}
			
		Tarifa tarifa = new Tarifa(origem, destino, plano, tempo, comFaleMais, semFaleMais);
		return tarifa;
	}
	
	private double retornaFaleMais(Plano plano, Integer tempo, float porcentagem) {
		return Math.round(plano.retornaTempoMenosDuracao(tempo) * porcentagem * 10) / 10.0;
	}
	
	private double retornaSemFaleMais(Integer tempo, float porcentagem) {
		return Math.round((tempo * porcentagem) * 10) / 10.0;
	}
	
}
