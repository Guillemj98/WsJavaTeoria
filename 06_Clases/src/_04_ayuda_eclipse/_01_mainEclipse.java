package _04_ayuda_eclipse;

public class _01_mainEclipse {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		Persona p2 = new Persona("Pepón");
		p2.peso = 123.89;
		Persona p3 = new Persona("Pepín", 15, 50, false);
		
		
		
		// Por defecto los objetos se imprimen con el siguiente formato
		// NOMBRE_COMPLETO_CLASE@CODIGO_HASH
		// Pero, si sobreescribimos el método toString() de la clase podemos
		// darle el formato que queramos.
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
