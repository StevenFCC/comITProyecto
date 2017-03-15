package org.comIT.proyecto.entities;

public class Perro extends Animales {

	public Perro(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String emitirSonido() {
		return nombre + " dice Guau";
	}
}
