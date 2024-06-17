package com.marquez.consultadetalleplatos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DetallePlatos {

	private int num;
	private String nombre;
	private double precio;
	private String detalle;

	public DetallePlatos(int num, String nombre, double precio, String detalle) {
		this.num = num;
		this.nombre = nombre;
		this.precio = precio;
		this.detalle = detalle;
	}

	public DetallePlatos() {
	}

}
