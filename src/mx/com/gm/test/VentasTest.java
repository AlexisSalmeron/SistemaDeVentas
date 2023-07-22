package mx.com.gm.test;
import mx.com.gm.ventas.*;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Camisa", 50.00);
        Producto producto2 = new Producto("Pantalón", 120.00);
        Producto producto3 = new Producto("Gorra", 500);
        
        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto3);
        orden1.mostrarOrden();
        
    }
}
