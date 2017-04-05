package org.comIT.proyecto.entities;

public abstract class Animal {
	
	protected String nombre;
	protected User duenno;
	protected int cantidadPatas;
		
	
	public String getNombre() {
		return nombre;
	}
	
	public User getDuenno() {
		return duenno;
	}

	public void setDuenno(User duenno) {
		this.duenno = duenno;
	}

	public void perderPata() {
		if(cantidadPatas > 0) {
			cantidadPatas --;
		}
	}
	
	public int getCantidadPatas() {
		return cantidadPatas;
	}

	public abstract String emitirSonido();

	public String emitirSonidoConDuenno() {
		String sonido = emitirSonido();
		if (this.getDuenno() != null) {
			sonido += " Mi dueño es " + this.getDuenno().getName();
		}
		return sonido;
	}
	
	public abstract TipoAnimal getTipoAnimal();
}
