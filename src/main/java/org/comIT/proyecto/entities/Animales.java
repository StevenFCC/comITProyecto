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

	public String emitirSonido(String nombre, String loQueDice) {
		String sonido = nombre + loQueDice;	
		if (this.getDuenno() != null) {
			sonido += "Mi dueño es " + this.getDuenno().getName();
		}
		return sonido;
	}
}
