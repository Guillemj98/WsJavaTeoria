package _03_Metodos;

public class _01_MainMetodos {

	public static void main(String[] args) {
		// Vamos a crear objetos y a ejecutar su método presentarse
		
		Persona p1 = new Persona("Tony", 45, 90, false);
		// Para invocar un método normalmente necesitamos una referencia a un objeto
		// y pondremos un punto "." para acceder al método
		p1.presentarse();
		
		p1 = new Persona("Natasha", 35, 70, true);
		p1.presentarse();
		
		p1.ponerEdad(50);
		p1.presentarse();
		
		p1.ponerEdad(-89);
		p1.presentarse();
		
		System.out.println("El peso en libras es: " +p1.obtenerPesoEnLibras());
		p1 = new Persona("Hulk", 40, 635, false);
		System.out.println("El peso en libras es: " +p1.obtenerPesoEnLibras());
		
	}

}
