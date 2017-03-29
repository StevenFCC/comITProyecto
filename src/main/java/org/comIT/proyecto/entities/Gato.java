package org.comIT.proyecto.entities;

public class Gato extends Animal {
	
	public Gato(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String emitirSonido() {
		return " miau.";
	}
}
