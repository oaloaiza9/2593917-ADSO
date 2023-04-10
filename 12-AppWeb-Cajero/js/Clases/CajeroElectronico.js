class CajeroElectronico{
	
	constructor(tipo_lectura, capacidad_total, cant_dinero_disponible, cant_10, cant_20, cant_50, cant_100, nombre_banco, user_admin, clave_admin){
		this.tipo_lectura = tipo_lectura;
		this.capacidad_total = capacidad_total;
		this.cant_dinero_disponible = cant_dinero_disponible;
		this.cant_10 = cant_10;
		this.cant_20 = cant_20;
		this.cant_50 = cant_50;
		this.cant_100 = cant_100;
		this.nombre_banco = nombre_banco;
		this.user_admin = user_admin;
		this.clave_admin = clave_admin;

		this.lista_transacciones = [];
	}

	retirarDineroTarjeta(tarjeta, clave, valor){
		if(valor%10000 == 0){
			// Verificar clave
			if ( tarjeta.verificarPassword(clave) ) {
				// Verificar si la tarjeta tiene el dinero suficiente
				if (tarjeta.getSaldo() >= valor) {
					// Verificar si el cajero tiene el dinero suficiente
					if ( this.cant_dinero_disponible >= valor ) {
						if ( this.actualizarCantidadBilletes(valor) ) {
							tarjeta.disminuirSaldo(valor);
							this.cant_dinero_disponible -= valor;
							this.registrarLog("RETIRO", tarjeta.getNumero(), valor, "OK:200");
						}else{
							this.registrarLog("RETIRO", tarjeta.getNumero(), valor, "Error:No hay billetes suficientes para el monto solicitado.");
						}
					}else{
						this.registrarLog("RETIRO", tarjeta.getNumero(), valor, "Error: Dinero Cajero Insuficiente");
					}
				}else{
					this.registrarLog("RETIRO", tarjeta.getNumero(), valor, "Error: Saldo Tarjeta Insuficiente");
				}
			}else{
				this.registrarLog("RETIRO", tarjeta.getNumero(), valor, "Error: clave");
			}
		}else{
			this.registrarLog("RETIRO", tarjeta.getNumero(), valor, "Error: Valor debe ser multiplo de 10.000");
		}
	}

	actualizarTotalCajero(usuario, password, valortotal, cant_10, cant_20, cant_50, cant_100){
		// Validar el usuario
		if (this.user_admin===usuario && this.clave_admin===password) {
			// Validar que el dinero total coincida con las cantidades de billetes 
			let resultado = (10000*cant_10)+(20000*cant_20)+(50000*cant_50)+(100000*cant_100);
			if (resultado==valortotal) {
				this.cant_dinero_disponible = resultado;
				this.cant_10 = cant_10;
				this.cant_20 = cant_20;
				this.cant_50 = cant_50;
				this.cant_100 = cant_100;
				this.registrarLog("ABASTECER", "0000000000000000", valortotal, "OK:200");
				console.log(" ===== OK - PROCESO REALIZADO CON EXITO =====");
			}else{
				this.registrarLog("ABASTECER", "0000000000000000", valortotal, "Error:404");
				console.log(" ===== ERROR - EL TOTAL INGRESADO NO ES CONSISTENTE =====");
			}	
		}else{
			this.registrarLog("ABASTECER", "0000000000000000", valortotal, "Error:403");
			console.log(" ===== ERROR - USUARIO O PASSWORD INCORRECTO =====");
		}
	}

	registrarLog(tipo, numero_t, valorTotal, estado){
		let fecha = new Date();
		let log = fecha+" || "+tipo+" || "+numero_t+" || "+ valorTotal +" || "+estado;
		this.lista_transacciones.push(log);
	}

	imprimirDatosCajero(){
		console.log("-----------------------------------------");
		console.log("-----------------------------------------");
		console.log("-- tipo_lectura: "+this.tipo_lectura);
		console.log("-- capacidad_total: "+this.capacidad_total);
		console.log("-- cant_dinero_disponible: "+this.cant_dinero_disponible);
		console.log("-- cant_10: "+this.cant_10);
		console.log("-- cant_20: "+this.cant_20);
		console.log("-- cant_50: "+this.cant_50);
		console.log("-- cant_100: "+this.cant_100);
		console.log("-- nombre_banco: "+this.nombre_banco);
		console.log("-- user_admin: "+this.user_admin);
		console.log("-- clave_admin: "+this.clave_admin);
		console.log("-- lista_transacciones: ");
		/*for (let i=0; i<this.lista_transacciones.length; i++) {
			console.log("     => "+this.lista_transacciones[i]);
		}*/
		this.lista_transacciones.forEach( function(element, index) {
			console.log(element);
		});
		console.log("-----------------------------------------\n");
	}

	actualizarCantidadBilletes(valor){
		let nuevo_valor = 0;

		// Calcular billetes de $100.000
		let temp_100 = valor/100000;
		if (this.cant_100>=temp_100) {
			nuevo_valor = valor - (temp_100*100000);
		}else{
			temp_100 = 0;
		}
		console.log("Billetes de 100: "+temp_100);

		// Calcular billetes de $ 50.000
		let temp_50 = nuevo_valor/50000;
		if(this.cant_50>=temp_50){
			nuevo_valor = nuevo_valor - (temp_50*50000);
		}else{
			temp_50 = 0;
		}
		console.log("Billetes de 50: "+temp_50);

		// Calcular billetes de $ 20.000
		let temp_20 = nuevo_valor/20000;
		if(this.cant_20>=temp_20){
			nuevo_valor = nuevo_valor - (temp_20*20000);
		}else{
			temp_20 = 0;
		}
		console.log("Billetes de 20: "+temp_20);

		// Calcular billetes de $ 10.000
		let temp_10 = nuevo_valor/10000;
		if(this.cant_10>=temp_10){
			nuevo_valor = nuevo_valor - (temp_10*10000);
		}else{
			temp_10 = 0;
		}
		console.log("Billetes de 10: "+temp_10);

		if (nuevo_valor==0) {
			this.cant_100 -= temp_100;
			this.cant_50 -= temp_50;
			this.cant_20 -= temp_20;
			this.cant_10 -= temp_10;
			return true;
		}else{
			return false;
		}
	}
}