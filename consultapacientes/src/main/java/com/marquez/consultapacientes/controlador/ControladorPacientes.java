package com.marquez.consultapacientes.controlador;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.marquez.consultapacientes.Paciente;

@RestController
public class ControladorPacientes {

	@GetMapping("/consulta/{num_paciente}")
	@ResponseBody
	public Paciente paciente(@PathVariable int num_paciente) {
		List<Paciente> listaPacientes = new ArrayList<Paciente>();
		listaPacientes.add(new Paciente(1L, 1010, "Juan", "Marquez", LocalDate.of(2000, 6, 8)));
		listaPacientes.add(new Paciente(2L, 1020, "Isabel", "Riquelme", LocalDate.of(2010, 4, 8)));
		listaPacientes.add(new Paciente(3L, 1030, "Jhon", "Romero", LocalDate.of(1987, 1, 12)));
		listaPacientes.add(new Paciente(4L, 1040, "Ana", "Torres", LocalDate.of(2015, 4, 30)));
		listaPacientes.add(new Paciente(5L, 1050, "Pedro", "Aguilar", LocalDate.of(2020, 9, 18)));

		// Recorremos la lista Array List
		for (Paciente paciente : listaPacientes) {
			LocalDate hoy = LocalDate.now();
			// calculo período entre fecha de nacimiento del paciente y fecha de hoy
			Period cant_anios = Period.between(paciente.getFechaNacimiento(), hoy);

			if (cant_anios.getYears() < 18) {
				System.out.println("El paciente es menor de edad");
			}

			if (paciente.getId() == num_paciente) {
				return paciente;

			}

			// Ejecutar: localhost:8080/consulta/1
		}

		return null;
	}
}
