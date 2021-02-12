package br.com.service;

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
	public void planoOri11Dest16() {
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
	public void planoOri16Dest11() {
		Tarifa calculaTarifa = new Tarifa();
		Integer origem = 16;
		Integer destino = 11;
		Plano plano = Plano.FALEMAIS30;
		Integer tempo = 40;
		
		calculaTarifa = tarifaServiceImpl.calculaTarifa(origem, destino, plano, tempo);
		assertTrue(calculaTarifa.getComFaleMais() == 31.9);
		assertTrue(calculaTarifa.getSemFaleMais() == 116);
	}
	
	@Test
	public void planoOri11Dest17() {
		Tarifa calculaTarifa = new Tarifa();
		Integer origem = 11;
		Integer destino = 17;
		Plano plano = Plano.FALEMAIS60;
		Integer tempo = 80;
		
		calculaTarifa = tarifaServiceImpl.calculaTarifa(origem, destino, plano, tempo);
		assertTrue(calculaTarifa.getComFaleMais() == 37.4);
		assertTrue(calculaTarifa.getSemFaleMais() == 136);
	}
	
	@Test
	public void planoOri17Dest11() {
		Tarifa calculaTarifa = new Tarifa();
		Integer origem = 17;
		Integer destino = 11;
		Plano plano = Plano.FALEMAIS60;
		Integer tempo = 120;
		
		calculaTarifa = tarifaServiceImpl.calculaTarifa(origem, destino, plano, tempo);
		assertTrue(calculaTarifa.getComFaleMais() == 178.2);
		assertTrue(calculaTarifa.getSemFaleMais() == 324);
	}
	
	@Test
	public void planoOri11Dest18() {
		Tarifa calculaTarifa = new Tarifa();
		Integer origem = 11;
		Integer destino = 18;
		Plano plano = Plano.FALEMAIS60;
		Integer tempo = 80;
		
		calculaTarifa = tarifaServiceImpl.calculaTarifa(origem, destino, plano, tempo);
		assertTrue(calculaTarifa.getComFaleMais() == 19.8);
		assertTrue(calculaTarifa.getSemFaleMais() == 72);
	}
	
	@Test
	public void planoOri18Dest11() {
		Tarifa calculaTarifa = new Tarifa();
		Integer origem = 18;
		Integer destino = 11;
		Plano plano = Plano.FALEMAIS120;
		Integer tempo = 200;
		
		calculaTarifa = tarifaServiceImpl.calculaTarifa(origem, destino, plano, tempo);
		assertTrue(calculaTarifa.getComFaleMais() == 167.2);
		assertTrue(calculaTarifa.getSemFaleMais() == 380);
	}

}
