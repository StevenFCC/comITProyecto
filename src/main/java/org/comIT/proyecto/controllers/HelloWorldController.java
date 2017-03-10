package org.comIT.proyecto.controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.comIT.proyecto.entities.Perro;
import org.comIT.proyecto.entities.Gato;
import org.comIT.proyecto.entities.Gallo;

//import org.apache.log4j.Logger;

@Path("hello")
public class HelloWorldController {
	//private static final Logger logger = Logger.getLogger(HelloWorldController.class);

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayhello() {
		//logger.debug("sample debug message");
		
		Perro teo = new Perro("Teo");
		Perro garnet = new Perro("Garnet");
		Gato jimmy = new Gato("Jimmy");
		Gallo claudio = new Gallo("Claudio");
		
		String nombreDeLosAnimales = "Animales creados: " + teo.getNombre() + " " + garnet.getNombre() + " " +jimmy.getNombre() + " " + claudio.getNombre();
		return nombreDeLosAnimales + " " + teo.ladrar() + " " + garnet.ladrar() + " " + jimmy.maullar() + " " + claudio.cacarear();
	}

}
