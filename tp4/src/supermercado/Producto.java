package supermercado;
public class Producto {
	private String nombre;
	private Double precio;
	private boolean precioCuidado;
	
	public Producto (String nombre, Double precio, Boolean precioCuidado) {
		this.nombre = nombre;
		this.precio = precio;
		this.precioCuidado = precioCuidado;
	}
	
	public Producto (String nombre, Double precio) {
		this(nombre, precio, false);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public Boolean esPrecioCuidado() {
		return precioCuidado;
	}

	public void aumentarPrecio(double precio) {
		this.precio += precio;
		
	}
	
}
