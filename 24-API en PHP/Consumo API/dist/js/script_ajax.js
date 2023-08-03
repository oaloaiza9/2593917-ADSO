let waitContent = null;
let contentClients = null;
let formInsertarUsuario = null;
let modalCrearUsuario = null;

window.onload = function(){
	waitContent = document.getElementById("waitContent");
	contentClients = document.getElementById("contentClients");
	formInsertarUsuario = document.getElementById("formInsertarUsuario");
	campo_cedula = document.getElementById("campo_cedula");
	
	options = {
				backdrop: 'static',
  				keyboard: false,
  				focus: false
  			  };
	modalCrearUsuario = new bootstrap.Modal(document.getElementById('modalCrearUsuario'), options);

	formInsertarUsuario.addEventListener("submit", function(event){
		event.preventDefault();
		crearCliente();
	});

	getClientes();
}

function crearCliente(){
	let datos = new FormData(formInsertarUsuario);
	
	let configuracion = 	{
								method: "POST",
								headers: {
									"Accept": "application/json",
								},
								body: datos,
							};

	fetch("http://localhost/ProyectoPHP/Insert.php", configuracion)
	.then( resp => resp.json() )
	.then( data => {

		console.log(" Respuesta API: ");
		console.log(data);

		if (data.status){
			document.getElementById("campo_cedula").value = "";
			document.getElementById("campo_nombres").value = "";
			document.getElementById("campo_apellidos").value = "";
			document.getElementById("campo_telefono").value = "";
			document.getElementById("campo_direccion").value = "";
			document.getElementById("campo_email").value = "";

			document.getElementById("campo_cedula").focus();

			Swal.fire({
						title: 'INSERTADO CON EXITO',
						text: 'El usuario ha sido creado con éxito.',
						icon: 'success',
					});
		}else{
			Swal.fire({
						title: 'NO INSERTADO',
						text: 'No se pudo crear el usuario. Es posible que la cedula ingresada exista de manera previa.',
						icon: 'error',
					});
		}

	});
}

function getClientes(){
	let endpointLocal = "http://localhost/ProyectoPHP/Obtener.php";
	waitContent.style.display = 'block';
	fetch( endpointLocal )
	.then( res => res.json() )
	.then( data => {
		console.log("Datos servidor:");
		console.log(data);

		contentClients.innerHTML = "";
		for (var i = 0; i < data.registros.length; i++) {
			let trHtlm = `	<tr>
								<td class="text-center"> ${ data.registros[i].cedula } </td>
								<td> ${ data.registros[i].nombres } </td>
								<td> ${ data.registros[i].apellidos } </td>
								<td class="text-center"> ${ data.registros[i].telefono } </td>
								<td> ${ data.registros[i].direccion } </td>
								<td> ${ data.registros[i].email } </td>
								<td class="m-0 p-1">
									<button class="col-12 btn btn-outline-success m-0 px-2 py-1" onclick="abrirModalEditar(this)" > EDITAR </button>
								</td>
							</tr>`;
			contentClients.innerHTML += trHtlm;
		}

		waitContent.style.display = 'none';
	});
}

function abrirModalEditar(boton){
	lista_tds = boton.parentNode.parentNode.children;
	console.log(lista_tds);
}