package _06_CicloDeVida;

import java.util.Random;

public class MainCicloDeVida {

	public static void main(String[] args) {
		
		
		// Un objeto nace cuando instanciamos una clase, con la
		// palabra new.
		new Persona();
		new Persona().edad=45;
		
		// Normalmente si queremos guardar información en los atributos
		// de un objeto debemos de crear también una referencia para poder
		// acceder a dicha información, no tiene mucho sentido guardar inftomación que no
		// podemos acceder a ella.
		
		// Si qye puede tener sentido crear un objeto sin referencia para
		// acceder a sus métodos en un  momentos dado, pero hay que tener
		// claro que no podemos volver a acceder a dicho objeto.
		int numero = new Random().nextInt(1,10);
		System.out.println("EL numero aleatorio es: " + numero);
		
		// Cuanto tiempo viven los objetos en el HEAP de memoria.

		// Hay un software dentro de la JVM llamado recolector
		// de basura (GC), su misión es darse una vuelta cada cierto 
		// tiempo buscando objetos que puede eliminar, la condición
		// es que el objeto no tenga referencia.
		
		// En este caso mientras que los 3 objetos creados arriba
		// seran borrados por el GC este objeto no será borrado
		// ya que tiene una referencia apuntadolo.
		Persona p = new Persona();
		p.edad = 35;
		
		// Teoricamente la JVM tiene un método para obligar a pasar
		// el recolector de basura, que se es el método "gc() de la 
		// clase "system".
		
		System.gc();
		
		// En POO existe el concepto de null. Null representa vacio
		// nulo, ausencia de valor y se usa la palabra reservada null.
		// Solamente pueden ser nulos las referencias.
		Persona p2 = null;
		String s = null;
		Random r = null;
		// Solo pueden ser null las referencias
		
		p2 = new Persona();
		p2.edad = 22;
		
		Persona p3 = p2;
		Persona p4 = p3;
		p2 = null;
		p3 = null;
		// Siempre que una referencia este apuntando a null y estemos intentando 
		// acceder a alguno de sus atributos o métodos, nos dará el error 
		// "NULL POINTER EXCEPTION" y se nos parará el programa.
		
		// Aquí si me avisa del error
		//System.out.println(p2.edad);
		
		// Aqui no me avisa del error
		System.out.println(p4.nombre);
		p4 = dameNulo();
		System.out.println(p4.edad);
		
	}
	public static Persona dameNulo() {
		return null;
	}

}
