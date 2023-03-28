import java.util.Date;

public class TarjetaDebito{

	// Atributos
	private String numero;
	private String titular;
	private String password;
	private int saldo;
	private String [] listaTransacciones;


	// Metodos
	public TarjetaDebito(String numero, String titular, String password, int saldo){
		this.numero = numero;
		this.titular = titular;
		this.password = password;
		this.saldo = saldo;
		this.listaTransacciones = new String[5];
	}

	public boolean disminuirSaldo(int valor){
		if (this.saldo >= valor) {
			this.saldo -= valor;
			// registrar en log de tarjeta
			this.registrarLog("RETIRO", valor,"OK");
			return true;
		}else{
			// registrar en log de la tarjeta
			this.registrarLog("RETIRO",valor,"Error");
			return false;
		}
	}

	public int getSaldo(){
		this.registrarLog("CONSULTA DE SALDO",this.saldo,"OK");
		return this.saldo;
	}

	public String getNumero(){
		return this.numero;
	}

	public boolean verificarPassword(String password){
		return this.password.equals(password);
	}

	public void setPassword(String newPassword){
		this.password = newPassword;
		this.registrarLog("CAMBIO DE CONTRASEÑA",0,"OK");
	}

	public void setSaldo(int valor){
		this.saldo += valor;
	}

	public void registrarLog(String tipo, int valorTotal, String estado){
		Date fecha = new Date();
		String log = fecha.toString()+" || "+tipo+" || "+String.valueOf(valorTotal)+" || "+estado;
		if(listaTransacciones[listaTransacciones.length-1] == null){
			for(int i=0; i<this.listaTransacciones.length; i++){
				if (this.listaTransacciones[i]==null) {
					this.listaTransacciones[i] = log;
					break;
				}
			}
		}else{
			for (int i=0; i<this.listaTransacciones.length-1; i++) {
				this.listaTransacciones[i] = this.listaTransacciones[i+1];
			}
			this.listaTransacciones[this.listaTransacciones.length-1] = log;
		}
	}

	public void imprimirDatosTarjeta(){
		for (int i=0; i<this.listaTransacciones.length; i++) {
			if (this.listaTransacciones[i] != null) {
				System.out.println("     => "+this.listaTransacciones[i]);
			}
		}
	}

}