package org.comIT.proyecto.entities;

public class Gato {

	private String nombre;
	
	public Gato(String nombre) {
		
		this.nombre = nombre;
	}
		
	public String getNombre() {
		return nombre;
	}

	public String maullar() {
		return "Miau";
	}
}
