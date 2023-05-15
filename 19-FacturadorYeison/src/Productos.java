public class Productos{
    
    private String idProducto;
    private String nombreProducto;
    private int precio;

    public Productos(String idProducto, String nombreProducto, int precio){
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
    }

    public String getIdProducto(){
        return this.idProducto;
    }
    public String getNombreProducto(){
        return this.nombreProducto;
    } 
    public int getPrecio(){
        return this.precio;
    }

}