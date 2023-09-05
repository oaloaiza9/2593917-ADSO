
let tbodyPersonas = document.getElementById("tbodyPersonas");
let listaPersonas = null;

function base_url(texto){
	return "http://localhost/25-ProyectoMVC-Origin/index.php/"+texto;
}

function cargarPersonas(){
	fetch( base_url("admin/Usuario/getListaUsuarios") )
	.then( res => res.json() )
	.then( data => {
		
		listaPersonas = data;
		tbodyPersonas.innerHTML = "";
		for (var i = 0; i < data.length; i++) {
			html_tr = `
						<tr>
				            <td>${ data[i].cedula }</td>
				            <td>${ data[i].nombres }</td>
				            <td>${ data[i].apellidos }</td>
				            <td>${ data[i].telefono }</td>
				            <td>${ data[i].direccion }</td>
				            <td>${ data[i].email }</td>
				            <td>
				            	<button class="btn btn-primary" onclick="abrirModalEditar(${i})" >
				            		Editar
				            	</button>
				            	<button class="btn btn-danger" onclick="confirmarEliminacion(${i})">
				            		Eliminar
				            	</button>
				            </td>
				        </tr>
					  `;
			tbodyPersonas.innerHTML += html_tr;
		}

	});
}

function abrirModalEditar(indice){
	console.log( "Abriendo modal para editar a:" );
	console.log( listaPersonas[indice] );
}

function confirmarEliminacion(indice){
	console.log( "Abriendo confirmacion para eliminar a:" );
	console.log( listaPersonas[indice] );
}


cargarPersonas();