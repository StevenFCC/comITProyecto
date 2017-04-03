function mostrarTodasLasListasDeCelulares(celularAMostrar) {
	var xhr = new XMLHttpRequest();
	
	xhr.onreadystatechange = function() {
		if (xhr.readyState == 4 && xhr.status == 200) {
			mostrarLista(xhr.responseText);
		}
	}

	var celularAMostrar = selectorDeMarca();
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

function selectorDeMarca() {
	var tomarSelectDeHttml = document.getElementsByTagName("select")[0];
	if (tomarSelectDeHttml.value == "Motorola") {
		return "/listamotog4";
	}
	if (tomarSelectDeHttml.value == "Samsung") {
		return "/listagalaxyj5";
	}
	if (tomarSelectDeHttml.value == "Huawei") {
		return "/listahuaweiy";
	}
	if (tomarSelectDeHttml.value == "Lenovo") {
		return "/listavibek5";
	}
}