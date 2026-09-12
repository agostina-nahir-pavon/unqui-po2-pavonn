package impuesto;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	private List<Ingreso> ingresos = new ArrayList <Ingreso>();
	
	public Double getImpuestoAPagar() {
		return this.getMontoImponible() * 0.02;
	}

	public Double getMontoImponible() {
		Double total = 0.0;
		for(Ingreso ingreso: ingresos) {
			total += ingreso.montoImponible();
		}
		return total;
	}
	 
	public Double getTotalPercibido() {
		Double total = 0.0;
		for(Ingreso ingreso: ingresos) {
			total += ingreso.getMontoPercibido();
		}
		return total;
	}
}
