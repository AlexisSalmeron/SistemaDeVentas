package mx.com.gm.ventas;

public class Orden {
    //Atributos
    private final int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;
    
    //Constructor vacío
    public Orden(){
        //Iniciar la variable IdOrden
        this.idOrden = ++Orden.contadorOrdenes;
        //Inicializar arreglo
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }
    
    //Método para agregar producto
    public void agregarProducto(Producto producto){
        //Condicional para agregar producto
        if(this.contadorProductos < Orden.MAX_PRODUCTOS){
            //Linea para agregar productos al arreglo
            this.productos[this.contadorProductos++] = producto;
        }else{
            System.out.println("Se ha superado el máximo de productos");
        }
    }
    
    //método para calcular el total
    public double calcularTotal(){
        //Variable local
        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
            Producto producto = this.productos[i];
            total += producto.getCost();
            //total+= this.productos[i].getCost();
        }
        return total;
    }
    
    //Método de Mostrar Orden
    public void mostrarOrden(){
        System.out.println("idOrden: " + this.idOrden);
        double totalOrden = this.calcularTotal();
        System.out.println("El total de la Orden: $" + totalOrden);
        System.out.println("Productos: ");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i]);
        }
    }
}
