package _10_estaticos;

public class Persona {
	// No tendría mucho sentido crear el nombre estático
	// ya que el stributo nombre sería compatido
	// por todos los objetos, con lo que solamente
	// podriamos tener un valor guardado
	public static String nombre;
	public int edad;
	
	// Si tendría sentido el numero de personas
	// como estático ya que así tendriamos localizadas
	// dicho número en un único atributo compartido por 
	// todos lo objetos.
	public static int numeroPersona;
	
	public Persona() {
		super();
	}
	// A los métodos dinamicos se acceden a taves de la referencias
	public boolean esMayorEdad() {
		System.out.println("El numero de personas es: " + numeroPersona);
		if(this.edad > 18) {
			return true;
		
		}else {
			return false;
		}
	}
	// A los métodos estáticos se acceden a traves de la clase
	// Si estamos dentro de la clase podemos omitirla
	public static void imprimirNumeroDePersona () {
		System.out.println(numeroPersona);
		// En los métodos estáticos no eciste "this" debido a que 
		// this es una referencia a un objeto y la parte estática no pertenece
		// al objeto
		// this.edad
		// NO puedes acceder a la edad 
	}
	// Para imprimir un atributo en un método dinamicos
	// No hay problema poque el objeto tiene el propio
	// atributo
	public void imprimirEdadDinamicos() {
		System.out.println(this.edad);
	}
	// Para imprimir un atruibuto dinamico en un método 
	// estático no podemo acceder a él por lo que 
	// debemos de pasarle el objeto que tenga el atributo
	public static void immprimirEdadEstatico(Persona p) {
		System.out.println(p.edad);
	}

}
