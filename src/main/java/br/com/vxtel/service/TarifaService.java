package br.com.vxtel.service;

import br.com.vxtel.model.Plano;
import br.com.vxtel.model.Tarifa;

public interface TarifaService {
	
    Tarifa calculaTarifa(Integer origem, Integer destino, Plano plano, Integer tempo);

}
