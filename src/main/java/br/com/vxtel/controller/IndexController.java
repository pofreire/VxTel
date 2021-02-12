package br.com.vxtel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.vxtel.model.Plano;
import br.com.vxtel.model.Tarifa;
import br.com.vxtel.service.TarifaServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "VxTel")
@CrossOrigin(origins = "*")
public class IndexController{

	@Autowired
	private TarifaServiceImpl tarifaService;
	
	@RequestMapping(value = "/calculatarifa", method = RequestMethod.POST)
	@ApiOperation(value = "Calcula Tarifa", notes = "Origens/Destinos[011, 016, 017, 018]")
	public @ResponseBody Tarifa exibeTarifa(@RequestParam(value = "origem", required = true) Integer origem,
		 	  								@RequestParam(value = "destino", required = true) Integer destino,
 	  										@RequestParam(value = "plano", required = true) Plano plano,
 	  										@RequestParam(value = "tempo", required = true) Integer tempo) {
		
		return tarifaService.calculaTarifa(origem, destino, plano, tempo);
	}

}
