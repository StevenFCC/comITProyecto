package org.comIT.proyecto.entities;

public class Gato extends Animal {
	
	public Gato(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String emitirSonido() {
		return nombre + " dice miau.";
	}

	@Override
	public TipoAnimal getTipoAnimal() {
		return TipoAnimal.GATO;
	}
}
