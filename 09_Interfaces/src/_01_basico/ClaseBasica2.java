package _01_basico;

public class ClaseBasica2 implements InterfazBasica {

	@Override
	public void metodo1() {
		System.out.println("Este es el metodo 1 pero de la clasica Basica2");
	}

	@Override
	/**
	 * Implementar la operacion multiplicacion
	 */
	public int operacion(int a, int b) {
		int multiplicacion = a * b;
		return multiplicacion;
	}

	@Override
	public String metodo3(Object o) {
		String cadena = "Este seria el metodo 2 de la clase claseBasica2"
				+ "que invocamos el metodo toString del objeto Object " + o.toString();
		return cadena;
	}

}
