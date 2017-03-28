package org.comIT.proyecto.entities;

public abstract class Animales {
	
	protected String nombre;
	protected User duenno;
	protected String ruido;
	
	
	public String getNombre() {
		return nombre;
	}
	
	public User getDuenno() {
		return duenno;
	}

	public String getRuido() {
		return ruido;
	}
	
	public void setDuenno(User duenno) {
		this.duenno = duenno;
	}

	public abstract String emitirSonido();
	
	public String emitirSonidoConDuenno() {
		String sonido = nombre + " dice" + ruido;
		if (this.getDuenno() != null) {
			sonido += " Mi dueño es " + this.getDuenno().getName();
		}
		return sonido;
	}
}
