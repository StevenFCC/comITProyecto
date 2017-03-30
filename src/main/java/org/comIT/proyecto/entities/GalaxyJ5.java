package org.comIT.proyecto.entities;

public class GalaxyJ5 extends Celular {
	
	public GalaxyJ5() {
		this.marca = "Samsung";
		this.modelo = "Galaxy J5 J510";
		this.sistemaOperativo = "Android";
		this.tamannoPantalla = "5.2´";
		this.resolucionPantalla = "1280 X 720";
		this.resolucionCamara = "13 Mpx";
		this.camaraFrontal = true;
		this.resolucionCamaraFrontal = "5 Mpx";
		this.memoriaInterna = "16 GB";
		this.flash = true;
	}
	
	@Override
	public String datosCelular() {
		return getMarca() + " " + getModelo() + " " + getSistemaOperativo() + " " + getTamannoPantalla() + " " + getResolucionPantalla() + " " + getResolucionCamara() + " " + getResolucionCamaraFrontal() + " " + getMemoriaInterna();
	}
}
