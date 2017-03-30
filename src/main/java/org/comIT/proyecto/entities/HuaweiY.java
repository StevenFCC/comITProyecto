package org.comIT.proyecto.entities;

public class HuaweiY extends Celular {
	
	public HuaweiY() {
		this.marca = "Huawey";
		this.modelo = "Y360D";
		this.sistemaOperativo = "Android";
		this.tamannoPantalla = "4´";
		this.resolucionPantalla = "800 X 480";
		this.resolucionCamara = "5 Mpx";
		this.camaraFrontal = false;
		this.resolucionCamaraFrontal = "2 Mpx";
		this.memoriaInterna = "4 GB";
		this.flash = false;
	}
	
	@Override
	public String datosCelular() {
		return getMarca() + " " + getModelo() + " " + getSistemaOperativo() + " " + getTamannoPantalla() + " " + getResolucionPantalla() + " " + getResolucionCamara() + " " + getResolucionCamaraFrontal() + " " + getMemoriaInterna();
	}
}
