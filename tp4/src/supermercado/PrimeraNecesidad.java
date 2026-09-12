
public class PrimeraNecesidad extends Producto {
	private Double descuento;
	
	public PrimeraNecesidad (String nombre, Double precio, int Descuento) {
		super(nombre, precio);
	}
	
	public Double getDescuento() {
		return this.descuento;
	}
	
	@Override
	public Double getPrecio() {
		return getPrecio() * (1 - descuento / 100);
	}
}
