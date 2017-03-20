function crearPerro() {
	endpoitAnimal("perro");
}

function crearGato() {
	endpoitAnimal("gallo");
}

function crearGallina() {
	endpoitAnimal("gallina");
}

function endpoitAnimal() {
	var xhr = new XMLHttpRequest();
	xhr.open(GET, localhost:8080/comITProyecto/, true);
	xhr.onreadystatechange = function() {
		if (xhr.readyState == 2 && xhr.status == 200) {
			
		}
	}
	xhr.send(null);
}

function crearAnimal() {
	var inputValor = document.getElementById('nombreAnimal').value;

}
