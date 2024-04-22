package _03_protected;

/**
 * Recordemos el alcnce del protected que es:
 * 1 : dentro de la propia clase.
 * 2 : dentro de las clases del propio paquete.
 * 3 : dentro de las clases que heredan de ella.
 */
public class Persona {
	private String nombre;
	protected int edad;
	
	
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
