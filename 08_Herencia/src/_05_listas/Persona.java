package _05_listas;

import java.util.List;

import _02_Basico.Coche;

public class Persona {
	private String nombre;
	// Si ponemos el tipo de atributo como la interfaz ,dejamos 
	// abierto a que los programadores puedan poner el tipo
	// lista que quieran, y no permitimos solo un tipo.
	// Es muy buena practica de programcion usar interfaces en vez
	// de usar implementaciones concretas.
	// Con esto hacemos que la clase persona tenga una dependencia 
	// debil con LIST.
	private List<Coche>listaCoches;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Coche> getListaCoches() {
		return listaCoches;
	}
	public void setListaCoches(List<Coche> listaCoches) {
		this.listaCoches = listaCoches;
	}
}
