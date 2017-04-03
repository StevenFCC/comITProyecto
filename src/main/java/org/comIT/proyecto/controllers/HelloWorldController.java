package org.comIT.proyecto.controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.comIT.proyecto.entities.Perro;
import org.comIT.proyecto.entities.Gato;
import org.comIT.proyecto.entities.Gallo;

@Path("hello")
public class HelloWorldController {
//	private static final Logger logger = Logger.getLogger(HelloWorldController.class);

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayhello() {
			
		Perro teo = new Perro("Teo");
		Perro garnet = new Perro("Garnet");
		Gato jimmy = new Gato("Jimmy");
		Gallo claudio = new Gallo("Claudio");
		
		String nombreDeLosAnimales = "Animales creados: " + teo.getNombre() + " " + garnet.getNombre() + " " +jimmy.getNombre() + " " + claudio.getNombre();
		return nombreDeLosAnimales + " " + teo.emitirSonidoConDuenno() + " " + garnet.emitirSonidoConDuenno() + " " + jimmy.emitirSonidoConDuenno() + " " + claudio.emitirSonidoConDuenno();
	}
}
