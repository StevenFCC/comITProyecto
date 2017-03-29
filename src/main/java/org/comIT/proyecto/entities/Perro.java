package org.comIT.proyecto.entities;

public class Perro extends Animal {

	public Perro(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String emitirSonido() {
		return " guau.";
	}
}
