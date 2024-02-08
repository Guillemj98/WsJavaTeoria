package clases;

import java.util.Random;

public class _02_Random {

	public static void main(String[] args) {
		// Con la clase random podemos generar primitivos 
		// aleatorios de manera sencilla
		Random rd = new Random();
		
		int numeroEntero = rd.nextInt(1, 11);
		// Generando entre el numero 1 y el numero 10
		// debido a que esta tipo te incluye el primero
		// pero no el segundo sería como n-1
		// Ver la documentación.
		System.out.println("Numero aleatorios:  " + numeroEntero );
		
		double numeroDouble = rd.nextDouble(1, 100);
		System.out.println("Numeros double aleatorios: " + numeroDouble );
		
		// Son llamados numeros psuedoaleatorios ya que se basan siempre en una
		// semilla inicial
		 Random rdSemilla = new Random(1000);
		 // En este caso como la semilla es igual en el objeto Random
		 // siempre generara los mimos nuemeros aleatorios
		 numeroEntero = rdSemilla.nextInt(1,11);
		 System.out.println("Numero aleatorios:  " + numeroEntero );
		 numeroDouble = rdSemilla.nextDouble(1, 100);
		 System.out.println("Numeros double aleatorios: " + numeroDouble );
		 
		 
		 

	}

}
