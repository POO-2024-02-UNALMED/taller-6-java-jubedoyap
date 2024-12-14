package vehiculos;

import java.util.ArrayList;

public class Camion extends Vehiculo {
	
	private int ejes;
	private static ArrayList<Camion> listado = new ArrayList<Camion>();
	
	public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
		
		super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
		this.ejes = ejes;
		listado.add(this);
	}
	
	public int getEjes() {
		return ejes;
	}
	
	public void setEjes(int nuevosEjes) {
		ejes = nuevosEjes;
	}
	
	public static int cantidadCamiones() {
		return Camion.listado.size()
;	}
}
