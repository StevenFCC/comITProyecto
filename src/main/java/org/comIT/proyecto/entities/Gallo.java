package org.comIT.proyecto.entities;

public class Gallo extends Animales {
	
	public Gallo(String nombre, String ruido) {
		this.nombre = nombre;
		this.ruido = ruido;
	}

	@Override
	public String emitirSonido() {
		return nombre + " dice cocoroco.";
	}
}
