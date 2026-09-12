package impuesto;

public class HorasExtras extends Ingreso {
	private int cantHorasExtra;
	
	public int getCantHorasExtra() {
		return cantHorasExtra;
	}
	
	@Override
	public Double montoImponible() {
		return 0.0;
	}
}
