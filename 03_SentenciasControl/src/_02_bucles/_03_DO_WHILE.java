package _02_bucles;

import java.util.Scanner;

public class _03_DO_WHILE {
	// Existe una variante del bucle while que se llama do while
	
	// La filosofía es la misma que la del bucle while pero 
	// esta vez en vez de ejecutarse 0 y n veces se ejecutara
	// entre 1 y n veces, es decir, al menos el bloque de sentencias
	// se ejecutará 1 vez

	public static void main(String[] args) {
		// Para hacer la sentencias do while tiene el siguiente
		// formato
		// do{
		//   // sentencias a ejecutar
		// }while (EXPRESION_BOOLEANA)
		
		// Vamos a pedirle un numero al usuario hasta que este emtre los valores
		// 1 y 10
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		do {
			System.out.println("Introduca un numero entre el 1 y el 10");
			numero = sc.nextInt();
			if (numero >10) {
				System.out.println("Te pasaste Crack");
			}
			if(numero <1) {
				System.out.println("Te quedaste igual que tu chorra, CORTO");
			}
		}while(numero < 1 || numero >10);
		
		System.out.println("Numero correcto");
		
	

	}

}
