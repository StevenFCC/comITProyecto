package org.comIT.proyecto.entities;

public class Perro {
	
	private String nombre;

	public Perro(String nombre) {
		
		this.nombre = nombre;
	}
	
	public String getNombre() {
		
		return nombre;
	}

	public String ladrar() {
		return nombre + " dice Guau";
	}
}
