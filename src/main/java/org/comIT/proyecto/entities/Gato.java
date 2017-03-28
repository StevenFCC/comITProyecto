package org.comIT.proyecto.entities;

public class Gato extends Animales {
	
	public Gato(String nombre, String ruido) {
		this.nombre = nombre;
		this.ruido = ruido;
	}
	
	@Override
	public String emitirSonido() {
		return nombre + " dice miau.";
	}
}
