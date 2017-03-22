package org.comIT.proyecto.entities;

public abstract class Animales {
	
	protected String nombre;
	protected User duenno;
	
	
	public String getNombre() {
		return nombre;
	}
	
	public User getDuenno() {
		return duenno;
	}

	public void setDuenno(User duenno) {
		this.duenno = duenno;
	}

	public abstract String emitirSonido();
}
