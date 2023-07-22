package mx.com.gm.ventas;

public class Producto {
    private final int idProducto;
    private String name;
    private double cost;
    private static int contadorProductos;

    private Producto() {
        this.idProducto = ++Producto.contadorProductos;
    }

    public Producto(String name, double cost) {
        this();
        this.name = name;
        this.cost = cost;
    }

    public int getIdProducto() {
        return idProducto;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", name=" + name + ", cost=" + cost + '}';
    }
    
    
    
}
