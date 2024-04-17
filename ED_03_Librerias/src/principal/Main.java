package principal;

import aleatorios.ClaseAleatorios;
import sysos.ImprimirPantalla;

public class Main {

	public static void main(String[] args) {
		ImprimirPantalla ip = new ImprimirPantalla();
		ip.imprimir(5);
		ClaseAleatorios ca = new ClaseAleatorios();
		System.out.println(ca.numeroAleatorioEntre2Numeros(2, 200));	
		System.out.println(ca.numeroAleatorio());
	
		
		

	}

}
