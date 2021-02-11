package br.com.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.vxtel.model.Plano;
import br.com.vxtel.model.Tarifa;
import br.com.vxtel.service.TarifaServiceImpl;

@SpringBootTest(classes = TarifaServiceImpl.class)
class TarifaServiceImplTest {

	@Autowired
	private TarifaServiceImpl tarifaServiceImpl;
	
	@Test
	public void plano1() {
		Tarifa calculaTarifa = new Tarifa();
		Integer origem = 11;
		Integer destino = 16;
		Plano plano = Plano.FALEMAIS30;
		Integer tempo = 20;
		
		calculaTarifa = tarifaServiceImpl.calculaTarifa(origem, destino, plano, tempo);
		
		assertTrue(calculaTarifa.getComFaleMais() == 0);
		assertTrue(calculaTarifa.getSemFaleMais() == 38.0);
	}
	
	@Test
	public void plano2() {
		Tarifa calculaTarifa = new Tarifa();
		Integer origem = 16;
		Integer destino = 11;
		Plano plano = Plano.FALEMAIS60;
		Integer tempo = 80;
		
		calculaTarifa = tarifaServiceImpl.calculaTarifa(origem, destino, plano, tempo);
		assertTrue(calculaTarifa.getComFaleMais() == 191.4);
		assertTrue(calculaTarifa.getSemFaleMais() == 232);
	}
	
	@Test
	public void plano3() {
		Tarifa calculaTarifa = new Tarifa();
		Integer origem = 11;
		Integer destino = 17;
		Plano plano = Plano.FALEMAIS120;
		Integer tempo = 120;
		
		calculaTarifa = tarifaServiceImpl.calculaTarifa(origem, destino, plano, tempo);
		assertTrue(calculaTarifa.getComFaleMais() == 224.4);
		assertTrue(calculaTarifa.getSemFaleMais() == 204);
	}

}
