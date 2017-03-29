package org.comIT.proyecto.entities;

public abstract class Animal {
	
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
	
	public String emitirSonidoConDuenno() {
		String sonido = nombre + " dice" + emitirSonido();
		if (this.getDuenno() != null) {
			sonido += " Mi dueño es " + this.getDuenno().getName();
		}
		return sonido;
	}
}
