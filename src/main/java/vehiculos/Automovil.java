package vehiculos;

import java.util.ArrayList;

public class Automovil extends Vehiculo {
	
	private int puestos;
	private static ArrayList<Automovil> listado = new ArrayList<Automovil>();
	
	public Automovil(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante, int puestos) {
		
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.puestos = puestos;
		listado.add(this);
	}
	
	public int getPuestos() {
		return puestos;
	}
	
	public void setPuestos(int nuevosPuestos) {
		puestos = nuevosPuestos;
	}
	
	//Método que retorna la cantidad de objetos tipo Automovil creados
	public static int cantidadAutomoviles() {
		return Automovil.listado.size();
	}
}
