public class Principal{
	public static void main(String[] args) {
		
		// Pruebas
		CajeroElectronico cj_01 = new CajeroElectronico(3, 250000000, 1500000, 50, 50, 0, 0, "BancoSena", "andres9649", "12345");
		
		cj_01.actualizarTotalCajero("andres9649", "12345", 20000000, 200, 200, 200, 40);
		// cj_01.imprimirDatosCajero();

		TarjetaDebito tj_01 = new TarjetaDebito("1111222233334444", "Oscar Loaiza", "54321", 500000);
		// cj_01.consultarSaldoTarjeta(tj_01,"54321");
		// cj_01.retirarDineroTarjeta(tj_01, "54321", 50000);
		cj_01.cambiarClave(tj_01,"54321","23554");
		// cj_01.transferirDineroTarjeta(tj_01,5,3,5,6);
		cj_01.verHistorialTarjeta(tj_01,"23354");
		// cj_01.imprimirDatosCajero();
	}
}