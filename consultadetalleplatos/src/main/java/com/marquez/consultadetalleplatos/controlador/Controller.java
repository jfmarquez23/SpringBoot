package com.marquez.consultadetalleplatos.controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.marquez.consultadetalleplatos.DetallePlatos;

@RestController
public class Controller {

	@GetMapping("/platos/{num_plato}")
	@ResponseBody
	public DetallePlatos traerDetallePlatos(@PathVariable int num_plato) {
		List<DetallePlatos> lista = new ArrayList<DetallePlatos>();
		lista.add(new DetallePlatos(1, "Ceviche", 2.00, "Plato exquisito de la costa ecuatoriana"));
		lista.add(new DetallePlatos(2, "Cuy", 20.00, "Plato exquisito serrano"));
		lista.add(new DetallePlatos(3, "Encocado", 6.20, "Plato exquisito esmeraldeño"));
		lista.add(new DetallePlatos(4, "Hornado Pastuzo", 18.00, "Plato exquisito de Tulcan"));
		lista.add(new DetallePlatos(5, "Encebollado", 7.30, "Plato exquisito ecuatoriano"));

		// Recorremos la lista Array List
		for (DetallePlatos detpla : lista) {
			if (detpla.getNum() == num_plato) {
				return detpla;
			}
			
			//Ejecutar: localhost:8080/platos/1
		}

		return null;

	}
}
