package _04_object;

/**
 *Todas las clases en JAVA heredan de la clase Object, por 
 * lo tanto todas las clases van a heredar sus métodos.
 * https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html
 */
public class Persona {
	private String nombre;
	private int edad;
	
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public void presentarse() {
		System.out.println("Hola soy una persona y me llamo: " + nombre + " y tengo: " + edad + "años");
	}

}
