
import java.util.ArrayList;
import java.util.List;


public class ProductoController {
    private final List<Producto> productos = 
            new ArrayList<>();
    
    //agregar producto
    public void agregarProducto(Producto p){
        productos.add(p);
    }
    
    //imprimir la lista de productos
    public void listarProducto(){
        if (productos.isEmpty()){
            System.out.println("No hay productos");
            return;
        } else {
            System.out.println("Lista de productos");
            for(Producto p : productos){
                System.out.println(p.toString());
            }
        }
    }
    public Producto buscarProductoPorId(int x){
        for(Producto p: productos){
            if(p.getId() == x){
                return p;
            }
        }
        return null;
    }    
}
