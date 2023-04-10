
public class TarjetaDebito{

	// Atributos
	private String numero;
	private String titular;
	private String password;
	private int saldo;


	// Metodos
	public TarjetaDebito(String numero, String titular, String password, int saldo){
		this.numero = numero;
		this.titular = titular;
		this.password = password;
		this.saldo = saldo;
	}

	public boolean disminuirSaldo(int valor){
		if (this.saldo >= valor) {
			this.saldo -= valor;
			// registrar en log de tarjeta
			return true;
		}else{
			// registrar en log de la tarjeta
			return false;
		}
	}

	public int getSaldo(){
		return this.saldo;
	}

	public String getNumero(){
		return this.numero;
	}
	public void setPassaword(String new_passaword){
		this.password = new_passaword;
	}
	public String getPassaword(){
		return this.password;
	}

	public boolean verificarPassword(String password){
		return this.password.equals(password);
	}
	public void setAumentarTarjeta(int sumavalor){
		this.saldo+=sumavalor;
	}



}