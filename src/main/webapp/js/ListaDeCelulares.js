function mostrarTodasLasListasDeCelulares() {
	var xhr = new XMLHttpRequest();
	
	xhr.onreadystatechange = function() {
		if (xhr.readyState == 4 && xhr.status == 200) {
			//for ( var cont = 0 ; cont < listadoCelulares.length ; cont++) {
				
				//mostrarLista(xhr.responseText);
				//var listadoCelulares = xhr.responseText;
				var listadoCelulares = [{"marca":"020","camaraFrontal":true,"flash":true}]
				agregarTodosLosCelulares(listadoCelulares);		
			//}
		}
	}

	var endpoint = "/comITProyecto/ws/celulares/listacelulares";
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

function propiedadCelular(propiedad,lista,padre) {

		var li = document.createElement("li");
		li.className = "liCelulares"
		padre.appendChild(li);
		var texto = document.createTextNode(propiedad + lista);
		li.appendChild(texto);
}

function propiedadCelularCheckbox(propiedad,lista,padre) {

	var li = document.createElement("li");
	li.className = "liCelulares"
	padre.appendChild(li);
	var texto = document.createTextNode(propiedad);
	li.appendChild(texto);
	var input = document.createElement("input");
	input.setAttribute("type", "checkbox");
	input.checked = lista;
	input.setAttribute("disabled", "true");
	li.appendChild(input);
}

function listaCelulares(contador,lista) {
	
	var listadoCelulares = [lista];

	var ul = document.createElement("ul");
	ul.className = "ulnuevo";

		//imagenDeCelular(ul,listadoCelulares[contador].imagen);
		propiedadCelular("Marca: ",listadoCelulares[contador].marca,ul);
		propiedadCelular("Modelo: ",listadoCelulares[contador].modelo,ul);
		propiedadCelular("Sistema Operativo: ",listadoCelulares[contador].sistemaOperativo,ul);
		propiedadCelular("Pantalla: ",listadoCelulares[contador].tamannoPantalla,ul);
		propiedadCelular("Resolucion de Pantalla: ",listadoCelulares[contador].resolucionPantalla,ul);
		propiedadCelular("Camara: ",listadoCelulares[contador].resolucionCamara,ul);
		propiedadCelularCheckbox("Camara Frontal",listadoCelulares[contador].camaraFrontal,ul),
		propiedadCelular("Resolucion de Camara Frontal: ",listadoCelulares[contador].resolucionCamaraFrontal,ul);
		propiedadCelular("Memoria Interna: ",listadoCelulares[contador].memoriaInterna,ul);
		propiedadCelularCheckbox("Flash",listadoCelulares[contador].flash,ul);
		
	var div = document.getElementById("nuevaListaDeCelulares");
	div.appendChild(ul);
}

function eliminarElementos() {

	var eliminarTodos = document.getElementById("nuevaListaDeCelulares");
	
	while (eliminarTodos.hasChildNodes()) {
		eliminarTodos.removeChild(eliminarTodos.firstChild);
	}	
}

function agregarTodosLosCelulares(xhrResponseText) {

	eliminarElementos();

	//for ( var cont = 0 ; cont < listadoCelulares.length ; cont++) {
		
		listaCelulares(0,xhrResponseText);
	//}
}

function filtrar() {
	var xhr = new XMLHttpRequest();
	
	xhr.onreadystatechange = function() {
		if (xhr.readyState == 4 && xhr.status == 200) {
			//for ( var cont = 0 ; cont < listadoCelulares.length ; cont++) {
				
				//mostrarLista(xhr.responseText);
				//var listadoCelulares = xhr.responseText;
				var listadoCelulares = [{"marca":"020","camaraFrontal":true,"flash":true}];

				eliminarElementos();
				filtrarPorCamaraFrontal(listadoCelulares);
				filtrarPorFlash(listadoCelulares);
				filtrarPorCamaraFrontalConFlash(listadoCelulares);		
			//}
		}
	}

	var endpoint = "/comITProyecto/ws/celulares/listacelulares";
	xhr.open("GET", endpoint, true);
	xhr.send(null);
}

function estadosDeCheckboxs() {

	var inputCamaraFrontal = document.getElementById("inputCamaraFrontal");
	var inputFlash = document.getElementById("inputFlash");
}

function seleccionarCamaraFrontalOFlash(camaraFlash,lista) {

	//for ( var cont = 0 ; cont < lista.length ; cont++) {
		var cont = 0
		if (lista[cont][camaraFlash]) {

			listaCelulares(cont,lista);
		}	
	//}
}

function filtrarPorCamaraFrontal(lista) {

	estadosDeCheckboxs();

	if (inputCamaraFrontal.checked == true && inputFlash.checked == false) {

		seleccionarCamaraFrontalOFlash("camaraFrontal",lista);
	}
}

function filtrarPorFlash(lista) {

	estadosDeCheckboxs();

	if (inputCamaraFrontal.checked == false && inputFlash.checked == true) {

		seleccionarCamaraFrontalOFlash("flash",lista);
	}
}

function filtrarPorCamaraFrontalConFlash(lista) {
	
	estadosDeCheckboxs();

	if (inputCamaraFrontal.checked == true && inputFlash.checked == true) {

		//for ( var cont = 0 ; cont < listadoCelulares.length ; cont++) {
			var cont = 0
			if (lista[cont].camaraFrontal && lista[cont].flash) {

				listaCelulares(cont,lista);	
			}
		//}
	}	
}

//function filtrar () {
//	eliminarElementos();
//	filtrarPorCamaraFrontal();
//	filtrarPorFlash();
//	filtrarPorCamaraFrontalConFlash();
//}


