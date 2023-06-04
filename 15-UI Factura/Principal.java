public class Principal{
	public static void main(String[] args) {
		
		Persona listaClientes [] = new Persona [100];
		Persona listaVendedores [] = new Persona [10];
		Producto listaProductos [] = new Producto [10];
		
		listaClientes[0] = new Persona("108800", "Oscar Loaiza", "Calle 20");
		listaClientes[1] = new Persona("108801", "Daniel Garcia", "Calle 19");
		listaClientes[2] = new Persona("108802", "Juan Lopez", "Calle 18");
		listaClientes[3] = new Persona("108803", "Catalina Mendez", "Calle 17");
		listaClientes[4] = new Persona("108804", "Andres Lopez", "Calle 16");

		listaVendedores[0] = new Persona("109900", "Juan Castillo", "Calle 20");
		listaVendedores[1] = new Persona("109901", "Ana Segura", "Calle 19");
		listaVendedores[2] = new Persona("109902", "Julian Perez", "Calle 18");
		listaVendedores[3] = new Persona("109903", "Carolina Tobon", "Calle 17");
		listaVendedores[4] = new Persona("109904", "Carlos Perez", "Calle 16");

		listaProductos[0] = new Producto(1010, "Leche", 3800);
		listaProductos[1] = new Producto(1011, "Carne 1Kg", 25600);
		listaProductos[2] = new Producto(1012, "Carne 1Lb", 12800);
		listaProductos[3] = new Producto(1013, "Jabon Barra", 2500);
		listaProductos[4] = new Producto(1014, "Detergente 1Kg", 15000);
		
		Facturador inicio = new Facturador(listaClientes, listaVendedores, listaProductos);

	}
}