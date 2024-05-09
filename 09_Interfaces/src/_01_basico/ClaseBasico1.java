package _01_basico;

/**
 * Para que una clase implemente una interfaz debemos 
 * usar la palabra reservada "implements"
 */
public class ClaseBasico1 implements InterfazBasica {

	@Override
	public void metodo1() {
		System.out.println("Esto seria el metodo ONE");
		
	}

	@Override
	/**
	 * Implementamos la operacion suma.
	 */
	public int operacion(int a, int b) {
		int resultado = a + b;
		return resultado;
	}

	@Override
	public String metodo3(Object o) {
		String cadena = "Esto seria el metodo 2 invocando el metodo toString" 
				+ o.toString();
		return cadena;
	}

}
