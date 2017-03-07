celularesVenta = [
	{	
		"id": 1,
		"sistema_operativo": "Android",
		"tamaño_pantalla": "5",
		"resolucion_pantalla": "1220*720",
		"camara": "8 Mpx",
		"camara_frontal": "5 Mpx",
		"memoria_interna": "16 Gb",
	},
	{
		"id": 2,
		"sistema_operativo": "Android",
		"tamaño_pantalla": "5",
		"resolucion_pantalla": "1220*720",
		"camara": "8 Mpx",
		"camara_frontal": "5 Mpx",
		"memoria_interna": "16 Gb",
	},
	{
		"id": 3,
		"sistema_operativo": "Android",
		"tamaño_pantalla": "5",
		"resolucion_pantalla": "1220*720",
		"camara": "8 Mpx",
		"camara_frontal": "5 Mpx",
		"memoria_interna": "16 Gb",
	},
	{
		"id": 4,
		"sistema_operativo": "Android",
		"tamaño_pantalla": "5",
		"resolucion_pantalla": "1220*720",
		"camara": "8 Mpx",
		"camara_frontal": "5 Mpx",
		"memoria_interna": "16 Gb",
	},
]

function celularesCompra() {

	for (var cont = 0; cont < celularesVenta.length; cont++) {
		
		var div1 = document.createElement("div");
		div1.className = "ulnuevo1";
			
			var img = document.createElement("img");
			img.setAttribute("src", "imagenes/Moto-G4-Play-1024x768.jpg");
			img.setAttribute("width", "400");
			img.setAttribute("heigth", "400");
			img.className = "imgubicacion";
			div1.appendChild(img);
			var li = document.createElement("li");
			li.className = "liubicacion";
			div1.appendChild(li);
			var texto = document.createTextNode("Sistema Operativo: " + celularesVenta[cont].sistema_operativo);
			div1.appendChild(texto);

			var li2 = document.createElement("li");
			div1.appendChild(li2);
			var texto2 = document.createTextNode("Tamaño de Pantalla: " + celularesVenta[cont].tamaño_pantalla);
			div1.appendChild(texto2);

			var li3 = document.createElement("li");
			div1.appendChild(li3);
			var texto3 = document.createTextNode("Resolucion de Pantalla: " + celularesVenta[cont].resolucion_pantalla);
			div1.appendChild(texto3);

			var li4 = document.createElement("li");
			div1.appendChild(li4);
			var texto = document.createTextNode("Camara: " + celularesVenta[cont].camara);
			div1.appendChild(texto);

			var li5 = document.createElement("li");
			div1.appendChild(li5);
			var texto = document.createTextNode("Camara Frontal: " + celularesVenta[cont].camara_frontal);
			div1.appendChild(texto);

			var li5 = document.createElement("li");
			div1.appendChild(li5);
			var texto5 = document.createTextNode("Memoria Interna: " + celularesVenta[cont].memoria_interna);
			div1.appendChild(texto5);

		var div = document.getElementById("celularesjs");
		div.appendChild(div1);

		var br = document.createElement("br");
		div1.appendChild(br);

		var p = document.createElement("p");
		div1.appendChild(p);
		var parrafo = document.createTextNode("Selccionar Color: ");
		p.appendChild(parrafo);

		var select = document.createElement("select");
		div1.appendChild(select);
		var option = document.createElement("option");
		select.appendChild(option);
		var textooption = document.createTextNode("Negro");
		option.appendChild(textooption);
		var option1 = document.createElement("option");
		select.appendChild(option1);
		var textooption1 = document.createTextNode("Blanco");
		option1.appendChild(textooption1);
	};
}
