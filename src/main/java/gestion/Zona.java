package gestion;

import zooAnimales.Animal;
import java.util.ArrayList;

public class Zona {
	private String nombre;
	protected ArrayList<Animal> animales = new ArrayList<Animal>();
	private Zoologico zoo;
	
	
	/*verificar si public zona() solito afecta el codigo*/
	

	public Zona(String nombre, Zoologico zoo) {
		this.zoo = zoo;
		this.nombre = nombre;
		
	}
	public Zona() {
		
	}
	
	public int cantidadAnimales1() {
		return animales.size();
	}
	
	
	public void agregarAnimales (Animal animal) {
		animales.add(animal);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}
	
	public Zoologico getZoo() {
		return this.zoo;
	}
	
	public ArrayList<Animal> getAnimales() {
		return animales;
	}

	public void setAnimales(ArrayList<Animal> animales) {
		this.animales = animales;
	}
	
	public int cantidadAnimales() {
		return animales.size();
	}	
	
}

