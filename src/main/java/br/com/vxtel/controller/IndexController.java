package br.com.vxtel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.vxtel.model.Plano;
import br.com.vxtel.model.Tarifa;
import br.com.vxtel.service.TarifaServiceImpl;

@Controller
public class IndexController{

	@Autowired
	private TarifaServiceImpl tarifaService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public Plano[] tarifas() {
		
		Plano[] planos;
		return planos = Plano.values();
	}
	
	@RequestMapping(value = "/calculatarifa", method = RequestMethod.POST)
	public @ResponseBody Tarifa exibeTarifa() {
		
//    	@RequestParam(value = "origem", required = false) Integer origem,
//	 	  @RequestParam(value = "destino", required = false) Integer destino,
//	 	  @RequestParam(value = "plano", required = false) Plano plano,
//	 	  @RequestParam(value = "tempo", required = false) Integer tempo
		Tarifa calculaTarifa = tarifaService.calculaTarifa(11, 16, Plano.FALEMAIS30, 20);
		System.out.println(calculaTarifa);
		
		return calculaTarifa;
	}
	

}
