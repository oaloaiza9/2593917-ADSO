
public class CajeroElectronico{

	// Atributos
	private int tipo_lectura;				// 1.chip   2.NFC   3.Chip y NFC
	private int capacidad_total;
	private int cant_dinero_disponible;
	private int cant_10;
	private int cant_20;
	private int cant_50;
	private int cant_100;
	private String nombre_banco;
	private String [] lista_transacciones;
	private String user_admin;
	private String clave_admin;

	// Metodos
	public CajeroElectronico(int tipo_lectura, int capacidad_total, int cant_dinero_disponible, int cant_10, int cant_20, int cant_50, int cant_100, String nombre_banco, String user_admin, String clave_admin){
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
		this.lista_transacciones = new String[15];
	}

	public void actualizarTotalCajero(String usuario, String password, int valortotal, int cant_10, int cant_20, int cant_50, int cant_100){
		// Validar el usuario
		if (this.user_admin.equals(usuario) && this.clave_admin.equals(password)) {
			// Validar que el dinero total coincida con las cantidades de billetes 
			int resultado = (10000*cant_10)+(20000*cant_20)+(50000*cant_50)+(100000*cant_100);
			if (resultado==valortotal) {
				this.cant_dinero_disponible = resultado;
				this.cant_10 = cant_10;
				this.cant_20 = cant_20;
				this.cant_50 = cant_50;
				this.cant_100 = cant_100;
				// Registrar el proceso en el log
				System.out.println(" ===== OK - PROCESO REALIZADO CON EXITO =====");
			}else{
				System.out.println(" ===== ERROR - EL TOTAL INGRESADO NO ES CONSISTENTE =====");
				// Registrar el proceso en el log
			}	
		}else{
			System.out.println(" ===== ERROR - USUARIO O PASSWORD INCORRECTO =====");
			// Registrar el proceso en el log
		}
	}

	public void imprimirDatosCajero(){
		System.out.println();
		System.out.println("-----------------------------------------");
		System.out.println("-----------------------------------------");
		System.out.println("-- tipo_lectura: "+this.tipo_lectura);
		System.out.println("-- capacidad_total: "+this.capacidad_total);
		System.out.println("-- cant_dinero_disponible: "+this.cant_dinero_disponible);
		System.out.println("-- cant_10: "+this.cant_10);
		System.out.println("-- cant_20: "+this.cant_20);
		System.out.println("-- cant_50: "+this.cant_50);
		System.out.println("-- cant_100: "+this.cant_100);
		System.out.println("-- nombre_banco: "+this.nombre_banco);
		System.out.println("-- user_admin: "+this.user_admin);
		System.out.println("-- clave_admin: "+this.clave_admin);
		System.out.println("-- lista_transacciones: ");
		for (int i=0; i<this.lista_transacciones.length; i++) {
			System.out.println("     => "+this.lista_transacciones[i]);
		}
		System.out.println("-----------------------------------------\n");
	}

}