package _10_estaticos;

public class Persona {
	public static String nombre;
	public int edad;
	
	public static int numeroPersona;
	
	public Persona() {
		super();
	}
	public boolean esMayorEdad() {
		System.out.println("El numero de personas es: " + numeroPersona);
		if(this.edad > 18) {
			return true;
		
		}else {
			return false;
		}
	}
	public static void imprimirNumeroDePersona () {
		System.out.println(numeroPersona);
		// NO puedes acceder a la edad 
	}
	public void imprimirEdadDinamicos() {
		System.out.println(this.edad);
	}
	public static void immprimirEdadEstatico(Persona p) {
		System.out.println(p.edad);
	}

}
