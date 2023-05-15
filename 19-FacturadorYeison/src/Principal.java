public class Principal{
    public static void main(String[]args){

        Persona listaClientes [] = new Persona[10];
        Persona listaVendedores [] = new Persona[10];
        Productos arrayProductos [] = new Productos[10];

        listaClientes[0] = new Persona("108800", "Oscar Loaiza", "Calle 20");
		listaClientes[1] = new Persona("108801", "Daniel Garcia", "Calle 19");
		listaClientes[2] = new Persona("108802", "Juan Lopez", "Calle 18");
		listaClientes[3] = new Persona("108803", "Catalina Mendez", "Calle 17");
		listaClientes[4] = new Persona("108804", "Andres Lopez", "Calle 16");

        listaVendedores[0] = new Persona("108800", "Oscar Loaiza", "");

        arrayProductos[0] = new Productos("7121100001", "Arroz", 2000);
        arrayProductos[1] = new Productos("7700304607808", "Aceite", 2000);
        arrayProductos[2] = new Productos("7909189205998", "Atun", 2000);
        arrayProductos[3] = new Productos("7700304670574", "Frijoles", 2000);
        
        Factura factura = new Factura(listaClientes, listaVendedores,arrayProductos);
    }
}