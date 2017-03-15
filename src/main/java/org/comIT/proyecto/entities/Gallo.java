package org.comIT.proyecto.entities;

public class Gallo extends Animales {
	
	public Gallo(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String emitirSonido() {
		return nombre + " dice Cocoroco";
	}
}
