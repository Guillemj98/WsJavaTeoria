package _01_basico;

/**
 * En java para heredar una clase de otra se usa la palabra reservada
 * "extends" después del nombre de la clase, ya continuación el nombre
 * de la clase "Padre"
 */
public class Alumno extends Persona {
	// Automaticamente la clase alumno tiene todos los atributos
	// de la clase Persona que son la edad y el nombre, y asi como
	// sus métodos, el cual es presentarse().
	
	public String curso;
	
	public boolean esCiencias() {
		if(curso.equals("DAM")) {
			return true;
			
		}
		return false;
	}
	/*
	 * Existe un concepto muy importante en la Herencia conocido como 
	 * la "sobreescritura" o "Override" de métodos. 
	 * Para sobreescribir un método debemos de crear un método en la clase
	 * hija con la misma FIRMA que el método "Padre".
	 * 
	 * Cuando sobreescribimos 
	 * un método queremos darlse un comportamiento diferente al de clase 
	 * "Padre".
	 * La anotación Override simplemente es una validación de si estamos
	 * haciendo bien el sobreescribiendo bien el metodo en caso 
	 * contrario da erro en tiempo de compilación.
	 */
	
	@Override
	public void presentarse() {
		System.out.println("Hola soy el alumno muñon de nombre: " + nombre);
	}
	
}
