listadoCelulares = [
		{
			"marca": "Motorola",
			"modelo": "G 4 PLAY",
			"sistema_operativo": "Android",
			"pantalla_pulgadas": 5,
			"pantalla_resolucion": "1280x720",
			"camara_resolucion": "8 Mpx",
			"camara_frontal": true,
			"camara_frontal_res": "5 Mpx",
			"memoria_interna": "16 GB"
		},
		{
			"marca": "Motorola",
			"modelo": "G 4 PLAY",
			"sistema_operativo": "Android",
			"pantalla_pulgadas": 5,
			"pantalla_resolucion": "1280x720",
			"camara_resolucion": "8 Mpx",
			"camara_frontal": true,
			"camara_frontal_res": "5 Mpx",
			"memoria_interna": "16 GB"
		},
		{
			"id": 1,
			"marca": "Motorola",
			"modelo": "G 4 PLAY",
			"sistema_operativo": "Android",
			"pantalla_pulgadas": 5,
			"pantalla_resolucion": "1280x720",
			"camara_resolucion": "8 Mpx",
			"camara_frontal": true,
			"camara_frontal_res": "5 Mpx",
			"memoria_interna": "16 GB",
			"flash": true
		},
		{
			"id": 2,
			"marca": "Samsung",
			"modelo": "GALAXY J5 J510",
			"sistema_operativo": "Android",
			"pantalla_pulgadas": 5.2,
			"pantalla_resolucion": "720x1280",
			"camara_resolucion": "13 Mpx",
			"camara_frontal": true,
			"camara_frontal_res": "5 Mpx",
			"memoria_interna": "16 GB",
			"flash": true
		},
		{
			"id": 3,
			"marca": "Samsung",
			"modelo": "GALAXY J7 J710",
			"sistema_operativo": "Android",
			"pantalla_pulgadas": 5.5,
			"pantalla_resolucion": "1280x720",
			"camara_resolucion": "13 Mpx",
			"camara_frontal": true,
			"camara_frontal_res": "5 Mpx",
			"memoria_interna": "16 GB",
			"flash": true
		},
		{
			"id": 4,
			"marca": "Huawei",
			"modelo": "Y360D",
			"sistema_operativo": "Android",
			"pantalla_pulgadas": 4,
			"pantalla_resolucion": "800x480",
			"camara_resolucion": "5 Mpx",
			"camara_frontal": true,
			"camara_frontal_res": "2 Mpx",
			"memoria_interna": "4 GB",
			"flash": true
		},
		{
			"id": 5,
			"marca": "Lenovo",
			"modelo": "VIBE K5",
			"sistema_operativo": "Android",
			"pantalla_pulgadas": 5,
			"pantalla_resolucion": "800x480",
			"camara_resolucion": "13 Mpx",
			"camara_frontal": false,
			"camara_frontal_res": "No posee",
			"memoria_interna": "16 GB",
			"flash": true
		}
	];

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

function listaCelulares(contador) {
	
	var ul = document.createElement("ul");
		ul.className = "ulnuevo";

			propiedadCelular("Marca: ",listadoCelulares[contador].marca,ul);
			propiedadCelular("Modelo: ",listadoCelulares[contador].modelo,ul);
			propiedadCelular("Sistema Operativo: ",listadoCelulares[contador].sistema_operativo,ul);
			propiedadCelular("Pantalla: ",listadoCelulares[contador].pantalla_pulgadas,ul);
			propiedadCelular("Resolucion de Pantalla: ",listadoCelulares[contador].pantalla_resolucion,ul);
			propiedadCelular("Camara: ",listadoCelulares[contador].camara_resolucion,ul);
			propiedadCelularCheckbox("Camara Frontal",listadoCelulares[contador].camara_frontal,ul),
			propiedadCelular("Resolucion de Camara Frontal: ",listadoCelulares[contador].camara_frontal_res,ul);
			propiedadCelular("Memoria Interna: ",listadoCelulares[contador].memoria_interna,ul);
			propiedadCelularCheckbox("Flash",listadoCelulares[contador].flash,ul);
		
	var div = document.getElementById("nuevosElementos");
	div.appendChild(ul);
}

function agregarTodosLosCelulares() {

	eliminarElementos();

	for ( var cont = 0 ; cont < listadoCelulares.length ; cont++) {
		
		listaCelulares(cont)
	}
}

function eliminarElementos() {

	var eliminarTodos = document.getElementById("nuevosElementos");
	
	while (eliminarTodos.hasChildNodes()) {
		eliminarTodos.removeChild(eliminarTodos.firstChild);
	}	
}

function filtrarPorCamaraFrontalOFlash(camaraFlash) {
	
	eliminarElementos();

	for ( var cont = 0 ; cont < listadoCelulares.length ; cont++) {
		
		if (listadoCelulares[cont][camaraFlash]) {

			listaCelulares(cont);
		}	
	}
}

function checkboxCamaraFrontal () {

	var inputCamaraFrontal = document.getElementById("inputCamaraFrontal");
	
	if (inputCamaraFrontal.checked == true) {
		filtrarPorCamaraFrontalOFlash("camara_frontal");
	}
}

function checkboxFlash () {

	var inputFlash = document.getElementById("inputFlash");
	
	if (inputFlash.checked == true) {
		filtrarPorCamaraFrontalOFlash("flash");
	}
}