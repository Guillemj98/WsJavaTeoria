package _02_Constructores;

// Siempre que queramos contruir un objeto ncesitamos de la 
// ayuda de lo que se conoce como "Constructor"

// Un constructor en POO es un método especial el cual se usa para la creación
// de los objetos. Es imperativo usar siempre algún constructor para crear un 
// objeto

// En java se permite crear mas de un constructor. El contructor de un 
// objeto en Java sigue la misma refla que los métoos, es decir, la firma 
// de un método o función se puede extrapolar al constructor, pero no podemos cambiar 
// el nombre del contructor. El nombre del constructor SIEMPRE tendrá que ser 
// el nombre de la clase. Los constructores cuando se crean no devuelven nada
// ni siquiera "Void".
public class Persona {
	
	String nombre;
	int edad;
	double peso;
	boolean estaCasado;
	
	// En  java si no creamos un constructor la JVM de Java nos proporcionará
	// el llamado "contructor" por defecto, que es un contructor sin parámetros
	// de entrada.
	
	// El constructor por defecto es el siguiente:
	public Persona() {
		// Este sería el constructor por defeecto que crea java automáticamente
		// Un constructor vacío.
		// siempre y cuando no creemos mas constructores. Dicho de otra manera
		// si nosotros no creamos constructor Java creará el contructor por defecto.
		// En cuanto creeemos un contructor java NO creará ningún contructor por defecto.
		
		// El constructor podemos alterar el comportamiento de un constructor
		System.out.println("Objeto creado");
		
		// Normalmente podemos alterar el comportamiento de un constructor 
		// cuando queremos que todos los valores de los objetos empiecen
		// igual
		
		edad=18;// De esta manera todos los objetos tendran la edad de 18
		// cuando invoquemos este contructor.
		
		this.edad= 18;	
	}
	// Podemos tener todos los constructores que queramos, es decir, los contructores
	// se pueden sobrecargar.
	public Persona (String nombre,int edad, double peso, boolean estaCasado) {
		// Aquí tenemos un problema, cuando seclaramos una variable dentri
		// de un constructor, con el mismo nombre que el atributo, tapamos
		// la visibilidad del atributo. En este ejemplo de aqui no estamos accediendo 
		// al atributo nombre, estamos accediendo al parametro de entrada nombre.
		//nombre= "Felix";
		//edad = 18;
		
		// Para romper esta problematica podemos usar la palabra reservada "this".
		// This es una referencia al propio objeto
		// De momento vamos a usar This para acceder a los atributos de un objeto
		
		this.nombre = nombre;
		
		// El primer nombre es el atributo, el segundo nombre es el parámetros
		// de entrada
		
		// Se considera de buena práctica de progrmación referirse a los
		// atributos con this
		this.edad= edad;
		this.estaCasado = estaCasado;
		this.peso = peso;
	}
	// Este sería un constructor solo con el nombre
	public Persona (String nombre) {
		this.nombre = nombre;
	}
}
