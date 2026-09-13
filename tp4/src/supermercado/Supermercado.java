package supermercado;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	private String nombre;
	private String direccion;
	private List<Producto> productos = new ArrayList<Producto>();
	
	public Supermercado(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    
	public int cantidadDeProductos() {
		return productos.size();
	}
	
	public double getPrecioTotal() {
		
		return productos.stream().
						 mapToDouble(producto -> producto.getPrecio()).
						 sum();
    }
}
