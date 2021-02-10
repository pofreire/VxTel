package br.com.vxtel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.vxtel.model.Plano;
import br.com.vxtel.model.Tarifa;
import br.com.vxtel.service.TarifaServiceImpl;

@RestController
public class IndexController{

	@Autowired
	private TarifaServiceImpl tarifaService;
	
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Tarifa tarifas(@RequestParam(value = "origem", required = false) Integer origem,
		    		 	  @RequestParam(value = "destino", required = false) Integer destino,
		    		 	  @RequestParam(value = "plano", required = false) Plano plano,
		    		 	  @RequestParam(value = "tempo", required = false) Integer tempo) {
        
    	Tarifa calculaTarifa = tarifaService.calculaTarifa(origem, destino, Plano.FALEMAIS30, 20);
    	System.out.println(calculaTarifa);

        return calculaTarifa;
    }

}
