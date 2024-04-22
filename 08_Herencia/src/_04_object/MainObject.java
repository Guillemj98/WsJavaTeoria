package _04_object;

import java.util.ArrayList;

public class MainObject {

	public static void main(String[] args) {
		// Con una referencia de tipo Obejct podemos apuntar a CAULQUIER
		// Object. Es la referencia comodín
		Object o = new Persona();
		o = new Alumno();
		o = new ArrayList<Docente>();
		o = new int[5];
		o = 5;
		
		// Esto sería una lista de objetos generica
		// las listas de en java en la version 1.5 eran así
		ArrayList<Object>listaObjetos = new ArrayList<>();
		listaObjetos.add(new Persona());
		listaObjetos.add(new Alumno());
		listaObjetos.add(new ArrayList<Docente>());
		listaObjetos.add(5);
		
		// Algunos métodos de la clase object
		Persona p1 = new Persona();
		p1.setNombre("Antón");
		p1.setEdad(25);
		
		System.out.println(p1.toString());
		o = p1;
		System.out.println(o.toString());// Polimorfismo, siempre se va a ejecutar el metodo
		// del objeto al que estemos apuntando, no importa la referencia es un mero 
		// apuntador.
		
		Persona p2 = new Persona();
		p2.setNombre("Anton");
		p2.setEdad(25);
		if(p1 == p2) {
			System.out.println("Son iguales");
		}else {
			System.out.println("Son diferentes");
		}
		// Para java 2 pbjetos son iguales solamente cuando 
		// ambas referencias apuntan al mismo objeto.
		
		// Para comparar en un momento dado es mediante el valor 
		// de los atributos. Si tenemos muchos atributos se complica
		// mucho la faena
		
		// Para comparar objetos por atributos, se suele sobrescrbir el 
		// método equals y el método hasCode(), ambos van de la mano
	

	}

}
