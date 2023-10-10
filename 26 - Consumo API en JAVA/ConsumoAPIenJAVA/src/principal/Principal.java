package principal;

import java.util.HashMap;
import java.util.Map;

public class Principal {
    public static void main(String[] args) {
        
        InsertarPersona ventana = new InsertarPersona();
        
        ConsumoAPI ejemplo = new ConsumoAPI();
        
        // GET sin datos
        String respuesta = ejemplo.consumoGET("http://localhost/APIenPHP/Obtener.php");
        System.out.println("Consumo GET: " + respuesta);
        
        // GET con Datos
        Map<String, String> getData = new HashMap<>();
        getData.put("cedula", "108805");
        System.out.println("Consumo SELECT: " + ejemplo.consumoGET("http://localhost/APIenPHP/getPersona.php", getData));
        
        // POST con Datos
        Map<String, String> insertData = new HashMap<>();
        insertData.put("cedula", "102200");
        insertData.put("nombres", "Oscar JAVA");
        insertData.put("apellidos", "Loaiza JAVA");
        insertData.put("telefono", "333333333");
        insertData.put("direccion", "Calle 20");
        insertData.put("email", "oscar@mail.com");
        System.out.println("Consumo INSERT: " + ejemplo.consumoPOST("http://localhost/APIenPHP/Insert.php", insertData));
        
        // POST con Datos
        Map<String, String> updateData = new HashMap<>();
        updateData.put("cedula", "102200");
        updateData.put("nombres", "Oscar JAVA UPDATE");
        updateData.put("apellidos", "Loaiza JAVA UPDATE");
        updateData.put("telefono", "333333");
        updateData.put("direccion", "Calle 20");
        updateData.put("email", "oscar@mail.com");
        System.out.println("Consumo UPDATE: " + ejemplo.consumoPOST("http://localhost/APIenPHP/Update.php", updateData));
        
        // POST con Datos
        Map<String, String> deleteData = new HashMap<>();
        deleteData.put("cedula", "102200");
        System.out.println("Consumo DELETE: " + ejemplo.consumoPOST("http://localhost/APIenPHP/Delete.php", deleteData));
        
    }    
}
