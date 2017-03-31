package org.comIT.proyecto.entities;

public class MotoG4 extends Celular {

	public MotoG4() {
		this.marca = "Motorola";
		this.modelo = "MOTO G4";
		this.sistemaOperativo = "Android";
		this.tamannoPantalla = "5´";
		this.resolucionPantalla = "1280 X 720";
		this.resolucionCamara = "8 Mpx";
		this.camaraFrontal = true;
		this.resolucionCamaraFrontal = "5 Mpx";
		this.memoriaInterna = "16 GB";
		this.flash = true;
	}
	
	//@Override
	//public String datosCelular() {
		//return getMarca() + " " + getModelo() + " " + getSistemaOperativo() + " " + getTamannoPantalla() + " " + getResolucionPantalla() + " " + getResolucionCamara() + " " + getResolucionCamaraFrontal() + " " + getMemoriaInterna();
	//}
}
