package org.comIT.proyecto.entities;

public class Perro extends Animales {

	public Perro(String nombre, String ruido) {
		this.nombre = nombre;
		this.ruido = ruido;
	}

	@Override
	public String emitirSonido() {
		return nombre + " dice guau.";
	}
}
