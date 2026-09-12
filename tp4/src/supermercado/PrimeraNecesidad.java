
public class PrimeraNecesidad extends Producto {
	
	public PrimeraNecesidad (String nombre, Double precio, Boolean precioCuidado) {
		super(nombre, precio, precioCuidado);
	}
	
	public PrimeraNecesidad (String nombre, Double precio) {
		super(nombre, precio);
	}
	
	@Override
	public Double getPrecio() {
		return getPrecio() * 0.9;
	}
}
