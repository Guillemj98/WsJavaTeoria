package _08_visibilidades;

// Con las visibilades establecemos desde donde podemos acceder a 
// nuestos atributos y métodos

// En java tenemos 4 tipos de visibilidad

// 1 . Private: solo tenemos visibilidad dentro de la propia clase.
// 2. (default)--> solo tenemos visibilidad dentro de la proppia clase
// y de las clases dentro del mismo paquete.
// 3. Protected --> solo tenemos visibilidad dentro de la propia clase
// , de las clases dentro del mismo paquete y de las clases que hereden
// de esta.
// 4. Tenemos visibilidad en todas las partes de nuestro proyecto.

// A efectos practicos los atributos normalmente siempre se declaran 
// como privados ( private) y se crean sus métodos accesores y modificadores
public class Estudiante {
	private String nombre;
	int edad ;
	protected double peso ;
	public String dni;
	
	public Estudiante() {
		super();
	}

	public Estudiante(String nombre, int edad, double peso, String dni) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.dni = dni;
		
	}
	// Normalmente si creamos un atributo privado tenemos que darle 
	// métodos modificadores y accesores publicos
	// La ventaja esque en los métodos podemoa aplicar lógica 
	// Mientras que en un atributo no. Es super mega hiper 
	// importante seguir los conceions de JAva para esos métodos
	// Los métodos modificadores empizan por set y luego el nombre del atributo
	public void setNombre (String nombre) {
		if(nombre.length()>1) {	
			this.nombre = nombre;
		}
	}
	//para los métodos accesores, empiezan por la palabra "get" y luego 
	// el nombre del atributo
	public String getNombre() {
		//return this.nombre.toLowerCase();
		if(this.nombre != null) {// con esto evitamos null pointer exception		
			return this.convertirNombreAMinuscula();
		}
		return this.nombre;
	}
	
	private String convertirNombreAMinuscula() {
		return this.nombre.toLowerCase();
	}
	
	
	
	

}
