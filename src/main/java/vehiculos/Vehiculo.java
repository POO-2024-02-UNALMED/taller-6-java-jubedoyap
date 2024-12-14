package vehiculos;

import java.util.*;

public class Vehiculo {

	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;
	private int precio;
	private int peso;
	private String traccion;
	private Fabricante fabricante;
	private static int cantidadVehiculos;
	private static ArrayList<String> paises = new ArrayList<String>();
	private static ArrayList<Integer> contadores = new ArrayList<Integer>();
	private static ArrayList<String> fabricas = new ArrayList<String>();
	private static ArrayList<Integer> contadores2 = new ArrayList<Integer>();
	
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio; 
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		cantidadVehiculos++;
		if(paises.contains(fabricante.getPais().getNombre())) {//De esta forma se verifica si el pais está en la lista, en caso de que sí se incrementa en 1 el valor de veces que aparece
			contadores.set(paises.indexOf(fabricante.getPais().getNombre()), contadores.get(paises.indexOf(fabricante.getPais().getNombre())) +1);
		}
		else {//Si no está se crea su espacio en paises y en contadores se aumenta en 1
			paises.add(fabricante.getPais().getNombre());
		    contadores.add(1);
		}
		if(fabricas.contains(fabricante.getNombre())) {//De esta forma se verifica si la fábrica está en la lista, en caso de que sí se incrementa en 1 el valor de veces que aparece
			contadores2.set(fabricas.indexOf(fabricante.getNombre()), contadores2.get(fabricas.indexOf(fabricante.getNombre())) +1);
		}
		else {//Si no está se crea su espacio en fabricas y en contadores se aumenta en 1
			fabricas.add(fabricante.getNombre());
		    contadores2.add(1);
		}
		
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String nuevaPlaca) {
		placa = nuevaPlaca;
	}
	
	public int getPuertas() {
		return puertas;
	}
	
	public void setPuertas(int nuevasPuertas) {
		puertas = nuevasPuertas;
	}
	
	public int getVelocidaMaxima() {
		return velocidadMaxima;
	}
	
	public void setVelocidaMaxima(int nuevaVelMax) {
		velocidadMaxima = nuevaVelMax;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nuevoNombre) {
		nombre = nuevoNombre;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public void setPrecio(int nuevoPrecio) {
		precio = nuevoPrecio;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public void setPeso(int nuevoPeso) {
		peso = nuevoPeso;
	}
	
	public String getTraccion() {
		return traccion;
	}
	
	public void setTraccion(String nuevaTraccion) {
		traccion = nuevaTraccion;
	}
	
	public Fabricante getFabricante() {
		return fabricante;
	}
	
	public void setFabricante(Fabricante nuevoFabricante) {
		fabricante = nuevoFabricante;
	}
	
	public static int getCantidadVehiculos() {
		return cantidadVehiculos;
	}
	
	//Metodo vehiculosPorTipo
	public String vehiculosPorTipo() {
		return "Automoviles: "+ Automovil.cantidadAutomoviles()+ "\n" + 
				"Camionetas: "+ Camioneta.cantidadCamionetas()+ "\n" + 
				"Camiones: "+ Camion.cantidadCamiones();
	}
	
	//Metodo para obtener la lista de paises que venden los vehiculos
	public static ArrayList<String> getPaises(){
		return paises;
	}
	
	////Metodo para obtener los contadores de los paises que venden los vehiculos
	public static ArrayList<Integer> getContadores(){
		return contadores;
	}
	
	//Metodo para obtener la lista de fabricas que venden los vehiculos
	public static ArrayList<String> getFabricas(){
		return fabricas;
	}
		
	////Metodo para obtener los contadores de las fabricas que venden los vehiculos
	public static ArrayList<Integer> getContadores2(){
		return contadores2;
	}
}
