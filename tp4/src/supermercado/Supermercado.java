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
    
	public int getCantidadDeproductos() {
		return productos.size();
	}
	
	public double getPrecioTotal() {
		double total = 0;

        for (Producto producto : productos) {
            total += producto.getPrecio();
        }

        return total;
    }
	}
}
