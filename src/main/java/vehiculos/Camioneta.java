package vehiculos;

import java.util.*;

public class Camioneta extends Vehiculo  {

	private boolean volco;
	private static ArrayList<Camioneta> listado = new ArrayList<Camioneta>();
	
	public Camioneta(String placa, int puertas,String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
		
		super(placa, puertas, 90, nombre, precio, peso, "4x4", fabricante);
		this.volco = volco;
		listado.add(this);
	}
	
	public boolean isVolco() {
		return volco;
	}
	
	public void setVolco(boolean volco) {
		this.volco = volco;
	}
	
	//Método que retorna la cantidad de objetos tipo Camioneta creados
	public static int cantidadCamionetas() {
		return Camioneta.listado.size();
	}
}
