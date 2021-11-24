package zooAnimales;

import java.util.ArrayList;


public class Anfibio {
	private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
	public static int ranas = 0;
	public static int salamandras = 0;
	private String colorPiel;
	private boolean venenoso;


	public Anfibio(String nombre,int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		listado.add(this);
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado.add(this);
	}
	
	public Anfibio() {
		listado.add(this);
	}
	
	
	
	public static int cantidadAnfibios() {
		return listado.size();
	}
	
	public String movimiento () {
		return "saltar";
	}
	
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		ranas++;
		Anfibio rana = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
		return rana;
	}
	
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		salamandras++;
		Anfibio salamandra = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
		return salamandra;
	}
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	
	public String getColorPiel() {
		return this.colorPiel;
	}
	
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	public boolean isVenenoso() {
		return this.venenoso;
	}
}