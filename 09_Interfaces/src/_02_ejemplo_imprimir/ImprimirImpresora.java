package _02_ejemplo_imprimir;

public class ImprimirImpresora implements Imprimible{

	@Override
	public void imprimir(String cadena) {
		String IP = "192.168.56.13";
		// Simulamos la impresion por impresora
		System.out.println("Imprimiendo por la impresora: " + cadena);
		
	}

}
