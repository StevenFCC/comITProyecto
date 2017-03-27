package org.comIT.proyecto.entities;

public class Gato extends Animales {
	
	public Gato(String nombre) {
		this.nombre = nombre;
	}
		
	@Override
	
	public String emitirSonido() {
		String sonido = nombre + " dice Miau.";
		if (this.getDuenno() != null) {
			sonido += "Mi dueño es " + this.getDuenno();
		}
		return sonido;
	}
}
