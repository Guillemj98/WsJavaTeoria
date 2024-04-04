package _10_estaticos;

/*
 * La parte estática de java es una pàrte de la memoria de siempre existe
 * mientras que los objetos son dinámico y solo existen cuando se les
 * crea hay una parte llamada static que existe durante todo el ciclo
 * de vida del programa.
 * 
 * Principalmente podemos encontrar partes estáticas dentro de atributos
 * y de métodos. Para ello se declaran con la palabra reservada "static"
 * 
 * Para crear métodos y atributos dinámicos no se utilizan ninguna palabra
 * reservada dicha de otra manera, practicamente con todo lo que hemos 
 * trabajado ahora ha sido dinamico
 * 
 * A grandes rasgos podemos decir que lo dinámico esta relacionado
 * con objetos y lo estático esta relacionado con clases.
 */
public class _01_MainEstaticos01 {
	// Este es un atributo dinámico y solo existe cuando se crea
	// el objeto. Cada objeto tendra este aributo y podrá 
	// almacenar un valor diferente. Dicho de otra manera, todos
	// los objetos tendrán asociado este atributo y cada objeti
	// tendrá un valor diferente.
	// Necesitamos la referencia a su objeto para acceder a el
	private int atributo1;
	
	// Este atributo es estático por lo tanto su ciclo de vida
	// no esta asociado al ciclo de vida del objeto. Este 
	// atributo será compartido por todos los objetos y existirá
	// siempre y estará guardado fuera de los objetos.
	// Para acceder a este necesitamos la clase donde se enceuntra 
	// (a no ser que estemos dentro de la clase)
	private static int atributo2;
	
	// Las constantes del programa se declaran estáticas y públicas
	// y con notación Upper_Sneak_Case
	public static final String NOMBRE_DEL_PROGRAMA = "Estáticos en java";
	// Notese que el metodo main es un método estático
	public static void main(String[] args) {
		
		// Para acceder a un método estático desde un método estático 
		// podemos llamarlo directamente
		presentarse();
		// También podemos llamarle a través de la clase
		_01_MainEstaticos01.presentarse();
		// presentarseDinamicamente(); NO se puede invocar de esta manera
		// debemos crear el objeto
		// Lo creamos de esta manera. EL objeto es _01_MainEstaicos01
		
		// En cambio lo dinámico no podemos llamarlo 
		// directamente desde un método estático porque 
		// lo dinámico solo eciste cuando se crea el objeto
		// Lo mismo con los atributos
		_01_MainEstaticos01 me = new _01_MainEstaticos01();
		me.presentarseDinamicamente();
		me.atributo1 = 9;
		// Desde una referencia podemos acceder a la parte estática
		// pero no se debe. A lo estático se accede de manera estática
		// me.presentarse();
		atributo2 = 10;
		
		// Esto mismo se aplica si queremos trabajar con otras clases
		Persona p1 = new Persona();
		Persona p2 = new Persona();	
		Persona.numeroPersona = 2;
		
		p1.edad = 45;
		p2.edad = 54;
		// Imprimir la edad de manera dinamica, se hace solo 
		// con la referencia de los objetos
		
		// Normalmente es mucho más comodo trbajar de manera dinámica.
		// por ejemplo es estos métodos podems ver como imprimir edades
		p1.imprimirEdadDinamicos();
		p2.imprimirEdadDinamicos();
		
		// Imprimir la edad de manera estática, se hace 
		// invocando a la clase.
		Persona.immprimirEdadEstatico(p1);
		Persona.immprimirEdadEstatico(p2);
		
		
	}
	
	public static void presentarse () {
		atributo2 = 89;
		System.out.println("Hola parate estatica");
	}
	public void presentarseDinamicamente () {
		this.atributo1 = 9;
		
		atributo2 = 23;
		_01_MainEstaticos01.atributo2 = 23;
		System.out.println("Hola parte dinamica");
	}

}
