package _02_Basico;

import java.util.ArrayList;

public class MainVehiculos {

	public static void main(String[] args) {
		Avion avion = new Avion();
		avion.setFechaFabricacion("23/12/2009");
		System.out.println(avion.esAntiguo());
		
		Moto mo = new Moto();
		mo.setFechaFabricacion("23/12/2009");
		System.out.println(mo.esAntiguo());
		
		Barco barco = new Barco();
		barco.setEsPirata(true);
		barco.setFechaFabricacion("23/12/2003");
		barco.setMarca("La sirena feliz");
		barco.setPeso(3500);
		barco.setVelocidad(20);
		
		// La capacidad de que una referencia ejecute un método u otro 
		// dependiendo del objeto que estamos apuntando se define o se
		// llama polimorfismo.
		System.out.println(avion);
		System.out.println(mo);
		System.out.println(barco);
		
		// IMPORTANTE!!!
		// Con una referencia de una clase superior o padre podemos
		// apuntar a cualquier objeto inferior o hijo
		// OJOOO no podemos hacerlo al revés,es decir, con una referencia
		// inferior no podemos apuntar a un objeto superior.
		
		Vehiculo v1 = new Coche();
		// VehiculoTerrestre vt = new Moto();// Si se puede
		
		// Importante aunque con una sola referencia podemos apuntar a objetos
		// inferiores. Solo podemos usar los métodos y atributos que tenga la 
		// referencia.
		
		// Nos podriamos preguntar para que vamos a usar una referencia padre
		// en vez de la hija la respuesta es, aunque no podamos usar todas 
		// los metodos y atributos del objeto hijo ganamos en versatilidad
		// es decir, podemos apuntar (con todo lo que conlleva)y usar todos 
		// los métodos y atributos de la referencia.
		
		ArrayList<Moto>listaMotos = new ArrayList<>();
		listaMotos.add(mo);
		// listaMotos.add(avion); ESTO NO SE PUEDE HACER
		
		ArrayList<Avion>listaAviones = new ArrayList<Avion>();
		listaAviones.add(avion);
		
		ArrayList<Vehiculo>listaVehiculos = new ArrayList<Vehiculo>();
		listaVehiculos.add(barco);
		listaVehiculos.add(mo);
		listaVehiculos.add(avion);
		
		for(Vehiculo v : listaVehiculos) {
			// Mediante el polimorfismo el metodo que se ejecutará 
			// será el del objeto al que estamos apuntando no el 
			// método de la referencia
			// En este ejemplo dependiendo del objeto que estamos
			// apuntando se ejecutara su metodo toString o es antiguo
			System.out.println(v);
			System.out.println(v.esAntiguo());
		}
		
	}

}
