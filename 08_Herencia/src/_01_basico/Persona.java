package _01_basico;

/**
 * La herencia es una de las propiedades mas importantes que podemos
 * encontrar en POO. Mediante la herencia podemos hacer que una clase 
 * tenga todos los atributos y métodos de otra. La clase de la cual 
 * heredamos se llama clase "Padre" y la clase que hereda se llama
 * "Hija",es decir, la clase "Hija" tendrá todos lo atributos y métodos de 
 * la clase "Padre".
 */
public class Persona {
	public String nombre;
	public int edad;
	
	public void presentarse() {
		System.out.println("Hola soy una persona y me llamo: " + nombre + " y tengo: " + edad + "años");
	}

}
