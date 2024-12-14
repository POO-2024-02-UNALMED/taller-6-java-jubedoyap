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
	private static ArrayList<Pais> paises = new ArrayList<String>();
	private static ArrayList<Integer> contadores = new ArrayList<Integer>();
	private static ArrayList<Fabricante> fabricas = new ArrayList<String>();
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
		if(paises.contains(fabricante.getPais())) {
			contadores.set(paises.indexOf(fabricante.getPais()), contadores.get(paises.indexOf(fabricante.getPais())) +1);
		}
		else {
			paises.add(fabricante.getPais());
		    contadores.add(1);
		}
		if(fabricas.contains(fabricante)) {
			contadores2.set(fabricas.indexOf(fabricante), contadores2.get(fabricas.indexOf(fabricante)) +1);
		}
		else {
			fabricas.add(fabricante);
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
	
	public int getVelocidadMaxima() {
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
	
	public static void setCantidadVehiculos(int nuevaCantidad) {
		cantidadVehiculos = nuevaCantidad;
	}
	
	
	public String vehiculosPorTipo() {
		return "Automoviles: "+ Automovil.cantidadAutomoviles()+ "\n" + 
				"Camionetas: "+ Camioneta.cantidadCamionetas()+ "\n" + 
				"Camiones: "+ Camion.cantidadCamiones();
	}
	
	
	public static ArrayList<Pais> getPaises(){
		return paises;
	}
	
	
	public static ArrayList<Integer> getContadores(){
		return contadores;
	}
	
	
	public static ArrayList<Fabricante> getFabricas(){
		return fabricas;
	}
		
	
	public static ArrayList<Integer> getContadores2(){
		return contadores2;
	}
}
