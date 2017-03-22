function establecerEndpoitAnimal(tipoDeAnimal) {
	var xhr = new XMLHttpRequest();
	xhr.onreadystatechange = function() {
		if (xhr.readyState == 4 && xhr.status == 200) {
			crearSonidoAnimal(xhr.responseText);
		}
	}
	var tomarInputValorNombreAnimal = document.getElementById("nombreDelAnimal");
	var endpoint = "/comITProyecto/ws/guarderia" + tipoDeAnimal + "?nombre=" + tomarInputValorNombreAnimal.value;
	xhr.open("GET", endpoint, true);
	xhr.send(null);
}

function crearSonidoAnimal(sonidoDeAnimal) {
	var tomarDivHtml = document.getElementById("agregarAnimal");
	var p = document.createElement("p");
	var texto = document.createTextNode(sonidoDeAnimal);
	p.appendChild(texto)
	tomarDivHtml.appendChild(p);
}
