
public class Producto {
    private int id;
    private  String nombre;
    private double precio;
    private int stock;
    
    public Producto(){} //constructor vacío
    
    public double calcularDescuento(double porcentaje) {
    return this.precio - (this.precio * porcentaje / 100);
}

    public Producto ( int cod, String nombre, 
            double precio, int stock){
        this.id = cod;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        //constructor con todos los atributos        
    }
    public Producto (String nombre, double precio,
            int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    
    public void setId(int x)  {
        this.id = x;
    }
    public  int getId(){
        return this.id;
    }       
    
    public void setNombre(String x){
        this.nombre = x;
    }     
    public String getNombre(){
        return this.nombre;
    }
    public void setPrecio(double x){
        this.precio = x;
    }
    public double getPrecio(){
        return this.precio;
    }
    public void setStock(int x){
        this.stock = x;
    }
    public int getStock(){
        return this.stock;
    }
    @Override
    public String toString(){
        return "Código: "+ this.id + " Nombre: "+
                this.nombre + " precio: " +
                this.precio + " stock: "+
                this.stock;
    }
    
}
