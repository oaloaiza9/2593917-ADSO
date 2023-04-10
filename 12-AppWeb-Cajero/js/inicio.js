let lista_cajeros = [];
let cajero_seleccionado = null;

window.onload = function(){
	let cj_01 = new CajeroElectronico(3, 250000000,  1500000,  50,  50, 0, 0, "BancoSena", "andres9649", "12345");
	let cj_02 = new CajeroElectronico(3, 250000000, 50000000, 100, 500, 600, 90, "Bancolombia", "juan12345", "12345");		
	let cj_03 = new CajeroElectronico(3, 100000000, 0, 0, 0, 0, 0, "Davivienda", "jose54321", "12345");
	let cj_04 = new CajeroElectronico(3, 100000000, 0, 0, 0, 0, 0, "BBVA", "ana67890", "12345");
	let cj_05 = new CajeroElectronico(3,  90000000, 0, 0, 0, 0, 0, "BancoSena", "pacho23456", "12345");

	lista_cajeros.push(cj_01);
	lista_cajeros.push(cj_02);
	lista_cajeros.push(cj_03);
	lista_cajeros.push(cj_04);
	lista_cajeros.push(cj_05);

	renderizarCajeros();
}

function abrirModalCrearCajero(){
	document.getElementById("input_tipo_lectura").value = "----";
	document.getElementById("input_capacidad_total").value = "";
	document.getElementById("input_cant_dinero_disponible").value = "";
	document.getElementById("input_cant_10").value = "";
	document.getElementById("input_cant_20").value = "";
	document.getElementById("input_cant_50").value = "";
	document.getElementById("input_cant_100").value = "";
	document.getElementById("input_nombre_banco").value = "";
	document.getElementById("input_user_admin").value = "";
	document.getElementById("input_clave_admin").value = "";
	$("#crearCajero").modal("show");
}

function abrirModalCrearTarjeta(){
	$("#crearTarjeta").modal("show");
}

function renderizarCajeros(){
	contenedor = document.getElementById("listaCajeros");
	contenedor.innerHTML = ``;

	html_div = ``;
	for(let i=0; i<lista_cajeros.length; i++){
		html_div += `<div class="col-4 m-0 p-1">
						<div class="border p-2 rounded">
							<h5 id="titulo_h">${ lista_cajeros[i].nombre_banco }</h5>
							<table class="table mb-2">
								<tbody>
									<tr>
										<td class="col-2">Capacidad: </td>
										<td class="col">  ${ lista_cajeros[i].capacidad_total } </td>
									</tr>
									<tr>
										<td class="col-2">Disponible: </td>
										<td class="col">  ${ lista_cajeros[i].cant_dinero_disponible } </td>
									</tr>
								</tbody>
							</table>
							<div class="col-12 row m-0 p-0 pt-2 justify-content-center">
								<div class="col-6 m-0 p-0 mb-1">
									<button class="col-12 btn btn-outline-primary" title="Detalle" onclick="abrirDetalleCajero(${ i })"><i class="fa-solid fa-circle-info"></i> Detalle</button>
								</div>
								<div class="col-6 m-0 p-0 ps-1 mb-1">
									<button class="col-12 btn btn-outline-primary" title="Historial"><i class="fa-solid fa-list"></i> Historial</button>
								</div>
								<div class="col-6 m-0 p-0 mb-1">
									<button class="col-12 btn btn-outline-primary" title="Abastecer"><i class="fa-solid fa-fill"></i> Abastecer</button>
								</div>
								<div class="col-6 m-0 p-0 ps-1 mb-1">
									<button class="col-12 btn btn-outline-success" title="Retirar"><i class="fa-solid fa-money-bill-wave"></i> Retirar</button>
								</div>
								<div class="col-6 m-0 p-0">
									<button class="col-12 btn btn-outline-success" title="Consignar"><i class="fa-solid fa-money-bill-transfer"></i> Consignar</button>
								</div>
								<div class="col-6 m-0 p-0 ps-1">
									<button class="col-12 btn btn-outline-success" title="Saldo"><i class="fa-solid fa-file-invoice-dollar"></i> Saldo</button>
								</div>
							</div>
						</div>
					</div>`;
	}
	contenedor.innerHTML = html_div;
}

function abrirDetalleCajero( posicion ){
	cajero_seleccionado = lista_cajeros[posicion];
	cajero_seleccionado.imprimirDatosCajero();
}

function registrarCajero(){
	tipo_lectura = document.getElementById("input_tipo_lectura").value;
	capacidad_total = document.getElementById("input_capacidad_total").value;
	cant_dinero_disponible = document.getElementById("input_cant_dinero_disponible").value;
	cant_10 = document.getElementById("input_cant_10").value;
	cant_20 = document.getElementById("input_cant_20").value;
	cant_50 = document.getElementById("input_cant_50").value;
	cant_100 = document.getElementById("input_cant_100").value;
	nombre_banco = document.getElementById("input_nombre_banco").value;
	user_admin = document.getElementById("input_user_admin").value;
	clave_admin = document.getElementById("input_clave_admin").value;

	let cajero_temporal = new CajeroElectronico(tipo_lectura, capacidad_total, cant_dinero_disponible, cant_10, cant_20, cant_50, cant_100, nombre_banco, user_admin, clave_admin);
	
	lista_cajeros.push( cajero_temporal );
	renderizarCajeros();
	$("#crearCajero").modal("hide");
}