package org.comIT.proyecto.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//import org.comIT.proyecto.entities.Celular;
import org.comIT.proyecto.entities.GalaxyJ5;
import org.comIT.proyecto.entities.HuaweiY;
import org.comIT.proyecto.entities.MotoG4;
import org.comIT.proyecto.entities.VibeK5;

@Path("celulares")
public class ListaCelularesController {
	
	@GET
	@Path("/lista")
	@Produces(MediaType.TEXT_PLAIN)
	public String listaCelulares() {
		MotoG4 motoG4 = new MotoG4();
		String datosMotoG4 =  motoG4.datosCelular();
		
		GalaxyJ5 galaxyJ5 = new GalaxyJ5();
		String datosGalaxyJ5 = galaxyJ5.datosCelular();
		
		HuaweiY huaweiY = new HuaweiY();
		String datosHuaweiY = huaweiY.datosCelular();
		
		VibeK5 vibeK5 = new VibeK5();
		String datosVibeK5 = vibeK5.datosCelular();
				
		
		List<String> listaDeCelulares = new ArrayList <String>();
		listaDeCelulares.add(datosMotoG4);
		listaDeCelulares.add(datosGalaxyJ5);
		listaDeCelulares.add(datosHuaweiY);
		listaDeCelulares.add(datosVibeK5);
		
		return datosMotoG4 + datosGalaxyJ5 + datosHuaweiY + datosVibeK5;
		
	}
}






