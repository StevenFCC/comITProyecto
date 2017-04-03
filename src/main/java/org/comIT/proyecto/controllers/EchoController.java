package org.comIT.proyecto.controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("echo")
public class EchoController {
	@GET
	@Produces("text/plain")
<<<<<<< HEAD
	public String echo (@QueryParam("parametro") String message, @QueryParam("contador") int cont){
		return "echo: " + message + cont;
=======
	public String echo(@QueryParam("m") String message, @QueryParam("v") String variable2) {
		return "echo: " + message + variable2;
>>>>>>> upstream2/master
	}
}



