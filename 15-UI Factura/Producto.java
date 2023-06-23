
public class Producto{

	int id;
	String nombre;
	int precio;

	public Producto(int id, String nombre, int precio){
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
	}

	public int getId(){
		return this.id;
	}

	public String getNombre(){
		return this.nombre;
	}

	public int getPrecio(){
		return this.precio;
	}

	
}