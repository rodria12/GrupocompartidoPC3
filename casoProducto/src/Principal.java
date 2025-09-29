
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        
        ProductoController controller = new ProductoController();
        
        Producto p = new Producto(1, "lapiz",2, 25);
        System.out.print(p.toString());
        
        Producto p1 = new Producto(2, "plumón",2.5, 30);
        Producto p2 = new Producto(3, "libreta",5, 27);
        //agregando productos
        controller.agregarProducto(p);
        controller.agregarProducto(p1);
        controller.agregarProducto(p2);
        //listamos productos
        controller.listarProducto();
        //buscar por id
        System.out.print("Ingrese código a buscar");
        Scanner linea = new Scanner(System.in); // captura lo que viene de teclado
        int cod = linea.nextInt(); // pq id es entero
        Producto prodEncontrado = controller.buscarProductoPorId(cod);
        System.out.println("Búsqueda por Id " + cod  );
        if (prodEncontrado != null) {
            System.out.println("Encontrado " +
                    prodEncontrado.toString());
        } else
            {  System.out.println("Producto con id " + cod +
                    " no existe ");
            }
    }
}
