package vehiculos;

import java.util.ArrayList;

public class Fabricante {

	private String nombre;
	private Pais pais;
	
	public Fabricante(String nombre, Pais pais) {
		
		this.nombre = nombre;
		this.pais = pais;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nuevoNombre) {
		nombre = nuevoNombre;
	}
	
	public Pais getPais() {
		return pais;
	}
	
	public void setPais(Pais nuevoPais) {
		pais = nuevoPais;
	}
	
	//Método para poder obtener la fábrica que más ventas genera
	public static String fabricaMayorVentas(){
		Fabricante fabricaGanadora = "";
		int valorMayor = 0;
		int indexGanador = 0;
		ArrayList<Fabricante> fabricas = Vehiculo.getFabricas();
		ArrayList<Integer> contadores2 = Vehiculo.getContadores2();
		for (int i = 0; i<contadores2.size(); i++) {
			if (contadores2.get(i) >= valorMayor) {
				valorMayor = contadores2.get(i);
				indexGanador = i;
			}
		}
		fabricaGanadora = fabricas.get(indexGanador);
		return fabricaGanadora;
	}
}
