package _05_listas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import _02_Basico.Coche;

public class MainListas {

	public static void main(String[] args) {
		
		/*
		 * Java ya muchas interfacs predefinidas, una de las mas
		 *  importantes es la interfaz list
		 * 
		 * En esta interfaz se definen los metodos que tiene que implementar todas 
		 * las clases que implementes la interfaz LIST, las mas importantes son:
		 * 
		 * La clase ArrayList y la clase LInkedList
		 * La implementación de ArrayList  es una implementacion muy buena
		 * cuando vamos a recorrer la lista muchas veces pero no vamos a cambiar de
		 * tamaño
		 * 
		 * La implementacion de LinkedList es muy buena cuando la lista
		 * cambia mucho de tamaño pero no la recorremos mucho
		 */
		
		List<Coche>listaArrayCoches = new ArrayList<>();
		listaArrayCoches.add(new Coche());
		
		List<Coche>listaLinkedCoches = new LinkedList<Coche>();
		// como ambas listas implementan la interfaz list tenemos los mismo metodos
		// por lo tanto para nosotros los porgramadores no habra diferencia de como
		// vamos a usar ambas listas.
		listaLinkedCoches.add(new Coche());
		recorrerLista(listaLinkedCoches);
		
		// Creamos la Persona con sus coches
		Persona p = new Persona();
		p.setNombre("Manolo");
		Coche c1 = new Coche();
		Coche c2 = new Coche();
		List<Coche>listaCoches = new LinkedList<Coche>();
		listaCoches.add(c2);
		listaCoches.add(c1);
		p.setListaCoches(listaCoches);
	}
	
	public static void recorrerLista(List<Coche>listaCoches) {
		System.out.println(listaCoches);
	}

}
