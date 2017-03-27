function establecerEndpoitAnimal(tipoDeAnimal) {
	var nombreDelAnimal = tomarYDarNombreDeAnimal();
	if (nombreDelAnimal == null) {
		alert("Dar nombre al animal");
		return;
	}

	var xhr = new XMLHttpRequest();
		xhr.onreadystatechange = function() {
			if (xhr.readyState == 4 && xhr.status == 200) {
				crearSonidoAnimal(xhr.responseText);
			}
		}
	
	var endpoint = "/comITProyecto/ws/guarderia" + tipoDeAnimal + "?nombre=" + nombreDelAnimal;

	var selectGetPost = document.getElementsByTagName("select")[0];
	
	if (selectGetPost.value == "GET") {
		xhr.open("GET", endpoint, true);
		xhr.send(null);
	
	} else {
		
		var nombreDelDuenno = tomarYDarNombreDeDuenno();
		if (nombreDuenno == null) {
			alert("Dar nombre del dueño");
			return;
		}
		xhr.open("POST", endpoint, true);
		xhr.setRequestHeader("Content-Type", "application/json");
		xhr.send(JSON.stringify({name: nombreDelDuenno}));
	}

}

function tomarYDarNombreDeDuenno() {
	var inputNombreDelDuenno = document.getElementById("nombreDelDuenno");
	var nombreDelDuenno = inputNombreDelDuenno.value;
	if(nombreDelDuenno.lenght == 0) {
		return null;
	}
	return nombreDelDuenno;
}

function tomarYDarNombreDeAnimal() {
	var inputNombreDelAnimal = document.getElementById("nombreDelAnimal");
	var nombreDelAnimal = inputNombreDelAnimal.value
	if(nombreDelAnimal.lenght == 0) {
		return null;
	}
	return nombreDelAnimal;
}

function mostrarNombreDelDuenno() {
	var selectGetPost = document.getElementsByTagName("select")[0];
	var divNombreDelDuenno = document.getElementById("divDeNombreDeDuenno");
	
	if (selectGetPost.value == "POST") {
		divNombreDelDuenno.className = "mostrar";
	} else {
		divNombreDelDuenno.className = "ocultar";
	}
}

function crearSonidoAnimal(sonidoDeAnimal) {
	var tomarDivHtml = document.getElementById("agregarAnimal");
	var p = document.createElement("p");
	var texto = document.createTextNode(sonidoDeAnimal);
	p.appendChild(texto)
	tomarDivHtml.appendChild(p);
}
