package org.comIT.proyecto.services;

import java.sql.SQLException;
import org.comIT.proyecto.entities.Animal;
import org.comIT.proyecto.connections.VeterinariaDAO;

public class GuarderiaService {
	
	private final VeterinariaDAO dao = new VeterinariaDAO();

		public Animal getAnimal(int idAnimal) throws SQLException {	
	 		Animal animal;
	 		animal = dao.getAnimal(idAnimal);
	 		return animal;
	 	}
	 	
	 	public void saveAnimal(Animal animal) throws SQLException {
	 		dao.save(animal);
	 	}
}

