package _04_ayuda_eclipse;

public class Persona {	
	String nombre;
	int edad;
	double peso;
	boolean estaCasado;
	
	// Los IDEs en general nos ayudan mucho a la creación de 
	// código. En concreto eclipse nos puede ayudar en la 
	// creación de los contructores.
	
	// Para crear este contructor es : botón derecho donde queremos 
	// crearlo, luego seleccionamos source y luego seleccionamos 
	// generate contructor using fields.
	
	// A continuación seleccionamos los atributos con lo que queremos
	// crear el contructor.
	
	public Persona(String nombre, int edad, double peso, boolean estaCasado) {
		super(); // Esta palabra esta relacionada con la herencia.
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.estaCasado = estaCasado;
	}

	
	// Podemos crear todos los contrutores que queremos
	public Persona() {
		super();
	}


	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}


	
	// Sobreescribimos el método toString()
	/*
	public String toString() {
		return "Me llamo: " + this.nombre;
		
	}
	*/
	
	// Eclipse también nos ayuda en sobreescribir el método toString()
	// Para crear este método es : botón derecho donde queremos 
		// crearlo, luego seleccionamos source y luego seleccionamos 
		// generate toString using fields.
	@Override // Sobreescritura
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", estaCasado=" + estaCasado + "]";
	}
	
	



	
	

}
