package org.comIT.proyecto.controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.comIT.proyecto.entities.Perro;
import org.comIT.proyecto.entities.Gato;
import org.comIT.proyecto.entities.Gallo;

@Path("guarderia")
public class Guarderia {
	@Path("/perro")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String perro(@QueryParam("nombre") String nombreperro) {
		Perro perro = new Perro(nombreperro);
		return perro.emitirSonido();
	}
	
	@Path("/gato")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String gato(@QueryParam("nombre") String nombregato) {
		Gato gato = new Gato(nombregato);
		return gato.emitirSonido();
	}
	
	@Path("/gallo")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String gallo(@QueryParam("nombre") String nombregallo) {
		Gallo gallo = new Gallo(nombregallo);
		return gallo.emitirSonido();
	}
}



