package org.comIT.proyecto.entities;

public class Gallo extends Animal {
	
	public Gallo(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String emitirSonido() {
		return nombre + " dice cocoroco.";
	}

	@Override
	public TipoAnimal getTipoAnimal() {
		return TipoAnimal.GALLO;
	}
	
	
}
