package _10_estaticos;

import java.util.Scanner;

// Si vamos a usar un objeto dentro de muchos métodos
// estáticos, podemos apoyarnos en un atributo
// estático para poder acceder a él dentro de 
// dichos métodos, en vez de estar pasandolos por 
// parámetros todo el rato

// En este ejemplo en vez de pasar el objeto Scanner 
// a todos los métodos vamos a crear un atributo Estático
// para poder acceder dentro de dichos métodos y así e
// evitar pasar continuamente por parámetros
public class _02_MainEstaticos {
	
	private static Scanner sc;
	
	

	public static void main(String[] args) {
		Scanner scDinamico = new Scanner(System.in);
		sc = new Scanner(System.in);
		int numero = pedirNumeroEntero(scDinamico);
		numero = pedirNumeroEnteroEstatico();
		
	}
	public static int pedirNumeroEntero(Scanner sc) {
		System.out.println("Introduce el numero entero:");
		int numero = sc.nextInt();
		return numero;
	}
	public static double pedirNumeroDouble (Scanner sc) {
		System.out.println("Introduce el numero double:");
		double numeroDouble = sc.nextDouble();
		return numeroDouble;
	}
	public static int pedirNumeroEnteroEstatico() {
		System.out.println("introduce el numero entero de manera estática:");
		int numero = sc.nextInt();
		return numero;
	}

}
