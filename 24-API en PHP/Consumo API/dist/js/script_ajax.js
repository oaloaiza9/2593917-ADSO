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
									<button class="col-12 btn btn-outline-success m-0 px-2 py-1"> EDITAR </button>
								</td>
							</tr>`;
			contentClients.innerHTML += trHtlm;
		}

		waitContent.style.display = 'none';
	});
}