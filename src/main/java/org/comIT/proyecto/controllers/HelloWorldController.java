package org.comIT.proyecto.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
<<<<<<< HEAD
import org.comIT.proyecto.entities.Perro;
import org.comIT.proyecto.entities.Gato;
import org.comIT.proyecto.entities.Gallo;

@Path("hello")
public class HelloWorldController {
=======

import org.comIT.proyecto.entities.animales.Animal;
import org.comIT.proyecto.entities.animales.Gallo;
import org.comIT.proyecto.entities.animales.Gato;
import org.comIT.proyecto.entities.animales.Perro;

@Path("hello")
public class HelloWorldController {
//	private static final Logger logger = Logger.getLogger(HelloWorldController.class);
>>>>>>> upstream2/master

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayhello() {
<<<<<<< HEAD
			
		Perro teo = new Perro("Teo");
		Perro garnet = new Perro("Garnet");
		Gato jimmy = new Gato("Jimmy");
		Gallo claudio = new Gallo("Claudio");
		
		String nombreDeLosAnimales = "Animales creados: " + teo.getNombre() + " " + garnet.getNombre() + " " +jimmy.getNombre() + " " + claudio.getNombre();
		return nombreDeLosAnimales + " " + teo.emitirSonidoConDuenno() + " " + garnet.emitirSonidoConDuenno() + " " + jimmy.emitirSonidoConDuenno() + " " + claudio.emitirSonidoConDuenno();
=======
		
		Perro jaime;
		int contador;
		Integer contadorInteger;
		
		Animal teo = new Perro("Teo");
		Perro garnet = new Perro("Garnet");		
		Gato donGato = new Gato("Don Gato");
		Gato donGato2 = new Gato("Don Gato");
		
		Gato jimmy = new Gato("Jimmy"); 
		Gallo claudio = new Gallo("Claudio");
		
		List<Animal> animalesVeterinaria = new ArrayList<Animal>();	
		animalesVeterinaria.add(teo);
		animalesVeterinaria.add(garnet);
		animalesVeterinaria.add(donGato);
		animalesVeterinaria.add(jimmy);
		animalesVeterinaria.add(claudio);
		
		StringBuffer nombresAnimales = new StringBuffer();
		StringBuffer sonidosAnimales = new StringBuffer();
		
		for (int i = 0; i < animalesVeterinaria.size(); i++) {
			Animal animalI = animalesVeterinaria.get(i);
			
		}
		
		donGato.equals(animalesVeterinaria);
		
		for (Animal animal : animalesVeterinaria) {
			nombresAnimales.append(animal.getNombre());
			sonidosAnimales.append(animal.emitirSonido());
		    if(animal instanceof Perro) {
		    	Perro perro = (Perro)animal; 
		    	perro.morder();
		    }
		}		

//		garnet.morder();

		//		logger.debug("sample debug message");
		
		String nombresDeLosAnimales = "Animales creados: " + teo.getNombre() + " " + garnet.getNombre() + " " + jimmy.getNombre() + " " + claudio.getNombre();
//		return nombresDeLosAnimales + " " + teo.emitirSonido() + " " + garnet.emitirSonido() + " " + jimmy.emitirSonido() + " " + claudio.emitirSonido();
		return "" +  donGato.equals(donGato2) + " " + (donGato == donGato2);
>>>>>>> upstream2/master
	}
}
