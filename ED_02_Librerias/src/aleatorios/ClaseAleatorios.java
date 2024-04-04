package aleatorios;

import java.util.Random;

/**
 * Clase para generar números aleatorios
 * @author Guillermo
 */
public class ClaseAleatorios {
	
	/**
	 * Método que genera un <b>numero aleatorio</b> entre 2 números pasados
	 * por parámetro.
	 * @param n1 el minimo valor posible del rango (incluido)
	 * @param n2 el maximo valor posible del rango (incluido)
	 * @return el número aleatorio generado
	 */
	public int numeroAleatorioEntre2Numeros (int n1, int n2) {
		Random rn = new Random();
		// Ponemos n2 +1 para incluir el n2
		int nAleatorio = rn.nextInt(n1, n2+1);
		return nAleatorio;
	}
	
	/**
	 * Método que genera un número aleatorio entre el <b>0 y 2^32</b>
	 * @return
	 */
	public int numeroAleatorio() {
		Random rn = new Random();
		int nAleatorio = rn.nextInt();
		return nAleatorio;
	}
	

}
