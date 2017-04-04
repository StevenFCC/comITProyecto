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
	@Path("/listacelulares")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Celular> listadoDeCelulares() {
		MotoG4 motoG4 = new MotoG4();
		GalaxyJ5 galaxyJ5 = new GalaxyJ5();
		HuaweiY huaweiY = new HuaweiY();
		VibeK5 vibeK5 = new VibeK5();
		return Arrays.asList(
				motoG4,
				galaxyJ5,
				huaweiY,
				vibeK5
		);
	}
}






