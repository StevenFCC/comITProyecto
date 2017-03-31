function mostrarTodasLasListasDeCelulares(celularAMostrar) {
	var xhr = new XMLHttpRequest();
	
	xhr.onreadystatechange = function() {
		if (xhr.readyState == 4 && xhr.status == 200) {
			mostrarLista(xhr.responseText);
		}
	}

	var endpoint = "/comITProyecto/ws/celulares" + celularAMostrar;
	xhr.open("GET", endpoint, true);
	xhr.send(null);
}

function mostrarLista(lista) {
	var tomarDivDeHttml = document.getElementById("nuevaListaDeCelulares");
	var crearP = document.createElement("p");
	tomarDivDeHttml.appendChild(crearP);
	var crearNodoTexto = document.createTextNode(lista);
	crearP.appendChild(crearNodoTexto);
}