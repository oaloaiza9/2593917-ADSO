public class Ahorcado{

	private String palabra_secreta;
	private char tablero [];

	public Ahorcado(String palabra){
		this.palabra_secreta = palabra;
		this.tablero = new char [ palabra.length() ];
	}

	public void start(){
		System.out.println(" --- metodo start ---");
	}

}