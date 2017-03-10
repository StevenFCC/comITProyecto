package org.comIT.proyecto.entities;

public class Gallo {
	
	private String nombre;
	
	public Gallo(String nombre) {
		
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String cacarear() {
		return "Cocoroco";
	}
}
