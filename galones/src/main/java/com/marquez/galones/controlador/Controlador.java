package com.marquez.galones.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controlador {

	// Con Path Variable
	@GetMapping("/galones/{galones}")
	public String calcularGalones(@PathVariable Double galones) {
		Double resultado = (galones * (3.78541));
		return "Ud necesita " + resultado + " litros de gasolina";
		// Invocar en el browser: http://localhost:8080/api/galones/5
	}

	// RequestParam
	@GetMapping("/galones")
	public String calcularGalonesRP(@RequestParam Double galones) {
		Double resultado = (galones * (3.78541));
		return "Ud necesita " + resultado + " litros de gasolina";
		// Se ejecuta así en el browser: http://localhost:8080/api/galones?galones=5

	}

}
