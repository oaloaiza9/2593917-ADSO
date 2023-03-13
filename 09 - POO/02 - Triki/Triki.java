import java.util.Scanner;

public class Triki{
	private String jugador_1;
	private String jugador_2;
	private int turno;
	private char tablero[][];
	private boolean en_juego;
	private int cant_jugadas;

	public Triki(){
		this.jugador_1 = "";
		this.jugador_2 = "";
		this.turno = 1;
		this.en_juego = true;
		this.cant_jugadas = 0;
		this.tablero = new char [3][3];
		this.limpiarTablero();
	}

	public void limpiarTablero(){
		for (int i=0; i<this.tablero.length; i++ ) {
			for (int j=0; j<this.tablero[i].length; j++) {
				this.tablero[i][j] = '-';
			}
		}
	}

	public void imprimirTablero(){
		for (int i=0; i<this.tablero.length; i++ ) {
			for (int j=0; j<this.tablero[i].length; j++) {
				System.out.print("["+this.tablero[i][j]+"] ");
			}
			System.out.println();
		}
	}

	public String jugadorActual(){
		return (this.turno==1)? jugador_1 : jugador_2 ;
	}

	public boolean validarCasillaVacia(int fila, int columna){
		if (this.tablero[fila][columna] == '-') {
			return true;
		}else{
			return false;
		}
	}

	public char obtenerFichaActual(){
		return (this.turno==1)? 'X' : 'O' ;
	}

	public boolean validarTableroLleno(){
		for (int i=0; i<this.tablero.length; i++) {
			for (int j=0; j<this.tablero[i].length; j++ ) {
				if (this.tablero[i][j]=='-') {
					return false;
				}
			}
		}
		return true;
	}

	public boolean validarGanador(){
		if ( (this.tablero[0][0]==this.tablero[0][1] && this.tablero[0][0]==this.tablero[0][2] && this.tablero[0][0]!='-') || 
			 (this.tablero[1][0]==this.tablero[1][1] && this.tablero[1][0]==this.tablero[1][2] && this.tablero[1][0]!='-') || 
			 (this.tablero[2][0]==this.tablero[2][1] && this.tablero[2][0]==this.tablero[2][2] && this.tablero[2][0]!='-') ||
			 
			 (this.tablero[0][0]==this.tablero[1][0] && this.tablero[0][0]==this.tablero[2][0] && this.tablero[0][0]!='-') || 
			 (this.tablero[0][1]==this.tablero[1][1] && this.tablero[0][1]==this.tablero[2][1] && this.tablero[0][1]!='-') || 
			 (this.tablero[0][2]==this.tablero[1][2] && this.tablero[0][2]==this.tablero[2][2] && this.tablero[0][2]!='-') || 

			 (this.tablero[0][0]==this.tablero[1][1] && this.tablero[0][0]==this.tablero[2][2] && this.tablero[0][0]!='-') || 
			 (this.tablero[2][0]==this.tablero[1][1] && this.tablero[2][0]==this.tablero[0][2] && this.tablero[2][0]!='-') 			 
			) {
			return true;
		}else{
			return false;
		}
	}

	public void start(){
		Scanner entrada_numero = new Scanner(System.in);
		Scanner entrada_texto = new Scanner(System.in);

		System.out.print("=> Ingrese nombre del Jugador 1: ");
		this.jugador_1 = entrada_texto.nextLine();

		System.out.print("=> Ingrese nombre del Jugador 2: ");
		this.jugador_2 = entrada_texto.nextLine();

		do{
			// Imprimir el tablero
			this.imprimirTablero();
			
			// Pedir la posicion al jugador actual
			System.out.print("=> Jugador "+this.jugadorActual()+" ingrese fila: ");
			int fila = entrada_numero.nextInt();

			System.out.print("=> Jugador "+this.jugadorActual()+" ingrese Columna: ");
			int columna = entrada_numero.nextInt();

			// Validar que la pos este vacia
			if ( this.validarCasillaVacia(fila, columna) ) {
				// Si - Marcar la jugada en la pos indicada
				this.tablero[fila][columna] = this.obtenerFichaActual();

				// Validar si la jugada fue ganadora
				if ( this.validarGanador() ) {
					// Si - El juego se termina
					en_juego = false;
					this.imprimirTablero();
					System.out.println(" ==== El jugador "+this.jugadorActual()+" ha ganado. ===");
				}else{
					// No - Validar si hubo empate
					if ( this.validarTableroLleno() ) {
						// Si - Terminar juego
						en_juego = false;
						this.imprimirTablero();
						System.out.println("  ==== EMPATE ====");
					}else{
						// No - Cambiar turno
						this.turno = (turno%2)+1;
					}
				}
			}else{
				// No - Repetir jugada
				System.out.println("==> POSICION INVALIDA - OCUPADA.");
			}

		}while(en_juego);
	}

}