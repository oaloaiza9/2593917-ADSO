public class Principal{
	public static void main(String[] args) {
		
		Persona listaClientes [] = new Persona [100];
		Persona listaVendedores [] = new Persona [10];
		
		listaClientes[0] = new Persona("108800", "Oscar Loaiza", "Calle 20");
		listaClientes[1] = new Persona("108801", "Daniel Garcia", "Calle 19");
		listaClientes[2] = new Persona("108802", "Juan Lopez", "Calle 18");
		listaClientes[3] = new Persona("108803", "Catalina Mendez", "Calle 17");
		listaClientes[4] = new Persona("108804", "Andres Lopez", "Calle 16");


		Facturador inicio = new Facturador(listaClientes, listaVendedores);

	}
}