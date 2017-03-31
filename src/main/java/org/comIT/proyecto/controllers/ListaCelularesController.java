package org.comIT.proyecto.controllers;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.comIT.proyecto.entities.Celular;
import org.comIT.proyecto.entities.GalaxyJ5;
import org.comIT.proyecto.entities.HuaweiY;
import org.comIT.proyecto.entities.MotoG4;
import org.comIT.proyecto.entities.VibeK5;


@Path("celulares")
public class ListaCelularesController {
	
	@GET
	@Path("/listamotog4")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Celular> listaCelularMotoG4() {
		MotoG4 celularCreado = new MotoG4();
		return Arrays.asList(
				celularCreado	
		);
	}
	
	@GET
	@Path("/listagalaxyj5")
	@Produces(MediaType.APPLICATION_JSON)
	public List<String> listaCelularGalaxyJ5() {
		GalaxyJ5 celularCreado = new GalaxyJ5();
		return Arrays.asList(
				celularCreado.getMarca(),
				celularCreado.getModelo(),
				celularCreado.getSistemaOperativo(),
				celularCreado.getTamannoPantalla(),
				celularCreado.getResolucionPantalla(),
				celularCreado.getResolucionCamara(),
				celularCreado.getResolucionCamaraFrontal(),
				celularCreado.getMemoriaInterna()	
		);
	}
	
	@GET
	@Path("/listahuaweiy")
	@Produces(MediaType.APPLICATION_JSON)
	public List<String> listaCelularHuaweiY() {
		HuaweiY celularCreado = new HuaweiY();
		return Arrays.asList(
				celularCreado.getMarca(),
				celularCreado.getModelo(),
				celularCreado.getSistemaOperativo(),
				celularCreado.getTamannoPantalla(),
				celularCreado.getResolucionPantalla(),
				celularCreado.getResolucionCamara(),
				celularCreado.getResolucionCamaraFrontal(),
				celularCreado.getMemoriaInterna()	
		);
	}
	
	@GET
	@Path("/listavibek5")
	@Produces(MediaType.APPLICATION_JSON)
	public List<String> listaCelularVibeK5() {
		VibeK5 celularCreado = new VibeK5();
		return Arrays.asList(
				celularCreado.getMarca(),
				celularCreado.getModelo(),
				celularCreado.getSistemaOperativo(),
				celularCreado.getTamannoPantalla(),
				celularCreado.getResolucionPantalla(),
				celularCreado.getResolucionCamara(),
				celularCreado.getResolucionCamaraFrontal(),
				celularCreado.getMemoriaInterna()	
		);
	}
	
	@GET
	@Path("/prueba")
	@Produces(MediaType.TEXT_PLAIN)
	public String prueba1() {
		return "Prueba\nPrueba 2";
	}
}






