package vehiculos;

import java.util.*;

public class Pais {
	
	private String nombre;

	
	public Pais(String nombre) {
		
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nuevoNombre) {
		nombre = nuevoNombre; 
	}
	
	//Método para poder obtener el pais que más ventas genera
	public String paisMasVendedor(){
		String paisGanador = "";
		int valorMayor = 0;
		int indexGanador = 0;
		ArrayList<String> paises = Vehiculo.getPaises();
		ArrayList<Integer> contadores = Vehiculo.getContadores();
		for (int i = 0; i<contadores.size(); i++) {
			if (contadores.get(i) >= valorMayor) {
				valorMayor = contadores.get(i);
				indexGanador = i;
			}
		}
		paisGanador = paises.get(indexGanador);
		return paisGanador;
	}
}
