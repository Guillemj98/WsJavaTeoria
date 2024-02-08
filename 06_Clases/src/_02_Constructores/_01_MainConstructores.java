package _02_Constructores;

public class _01_MainConstructores {

	public static void main(String[] args) {
		// Siempre tendremos que crear un objeto a traves 
		// de un constructor 
		Persona p = new Persona();
		System.out.println(" La edad: "+ p.edad);
		
		Persona p2 = new Persona();
		System.out.println(" La edad: "+ p2.edad);
		
		// Vamos a invocar el constructor con parámetros
		Persona p3 = new Persona("Tony Stark", 45, 90.67, true);
		System.out.println(p3.nombre);
		System.out.println(p3.edad);
		System.out.println(p3.peso);
		System.out.println(p3.estaCasado);
		
		Persona p4 = new Persona("Peter Parker", 23, 75.67, false);
		System.out.println(p4.nombre);
		System.out.println(p4.edad);
		System.out.println(p4.peso);
		System.out.println(p4.estaCasado);
		
		Persona p5 = new Persona("Natasha");
		System.out.println(p5.nombre);
		System.out.println(p5.edad);
		System.out.println(p5.peso);
		System.out.println(p5.estaCasado);
	}

}
