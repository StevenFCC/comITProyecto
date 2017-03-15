package org.comIT.proyecto.entities;

public abstract class Animales {
	
	protected String nombre;
	
	
	public String getNombre() {
		return nombre;
	}
	
	public abstract String emitirSonido();
}
