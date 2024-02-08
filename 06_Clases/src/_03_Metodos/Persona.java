package _03_Metodos;

// Dentro de una clase, ademas de atributos, ùeden realizar funcionalidades
// que se declaran como métodos. En POO a las funciones se le llaman 
// métodos. Siguen las mismas reglas de las funciones que vimos en 
// el ejemplo "02_ IntroducciónJava", no se le pone la palabra static.

// Realmente para crear un método en java se crea igual que una función 
// pero se quita la palabra static. Cuando creamos un método el método 
// esta dentro de un objeto, si cremaos una función ( un método con la
// palabra static, la fuinción estará fuera del objeto).
public class Persona {
	
	String nombre;
	int edad;
	double peso;
	boolean estaCasado;

	public Persona() {
	
	}
	
	public Persona (String nombre,int edad, double peso, boolean estaCasado) {	
		this.nombre = nombre;		
		this.edad= edad;
		this.estaCasado = estaCasado;
		this.peso = peso;
	}
	public Persona (String nombre) {
		this.nombre = nombre;
	}
	
	// Los métodos van dentro de la clase, y normalmente se ponen despues de
	// los atributos y los contructores
	
	public void presentarse() {
		// "This" es la referencia al propio objeto
		System.out.println("Mi nombre es: " +  this.nombre);
		System.out.println("Mi edad es: " +  edad);
		// Podemos poner la edad sin el this siempre y cuando no se 
		// haya declarado una variable o un parámetro de entrada
		// con el nombre "edad".
		System.out.println("Mi peso es: " + this.peso + " kg");
		System.out.println("Estoy casado?: " + this.estaCasado);
		System.out.println("---------------");
	}
	public void ponerEdad(int edad) {
		if(edad<0) {
			this.edad =0;
		}else {
			this.edad =edad;
		}
		
		
	}
	public double obtenerPesoEnLibras() {
		double pesoEnLibras = 0;
		pesoEnLibras = this.peso * 2.205;
		return pesoEnLibras;
	}
}
