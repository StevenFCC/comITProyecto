package org.comIT.proyecto.entities;


public abstract class Celular {
	
	protected String marca;
	protected String modelo;
	protected String sistemaOperativo;
	protected String tamannoPantalla;
	protected String resolucionPantalla;
	protected String resolucionCamara;
	protected boolean camaraFrontal;
	protected String resolucionCamaraFrontal;
	protected String memoriaInterna;
	protected boolean flash;
		
	
	public String getMarca() {
		return marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public String getSistemaOperativo() {
		return sistemaOperativo;
	}
	
	public String getTamannoPantalla() {
		return tamannoPantalla;
	}
	
	public String getResolucionPantalla() {
		return resolucionPantalla;
	}
	
	public String getResolucionCamara() {
		return resolucionCamara;
	}
	
	public boolean isCamaraFrontal() {
		return camaraFrontal;
	}
	
	public String getResolucionCamaraFrontal() {
		return resolucionCamaraFrontal;
	}
	
	public String getMemoriaInterna() {
		return memoriaInterna;
	}
	
	public boolean isFlash() {
		return flash;
	}
}
