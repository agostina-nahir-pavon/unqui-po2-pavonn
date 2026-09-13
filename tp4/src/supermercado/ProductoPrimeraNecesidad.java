package supermercado;

public class ProductoPrimeraNecesidad extends Producto {
	private double descuento;
	
	public ProductoPrimeraNecesidad (String nombre,double precio, boolean b, double descuento) {
		super(nombre, precio, b);
		this.descuento = descuento;
	}
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean b) {
		this(nombre, precio, b, 10);
	}

	public double getDescuento() {
		return this.descuento;
	}
	
	@Override
	public double getPrecio() {
		return super.getPrecio() * (1 - descuento/100);
	}
}
