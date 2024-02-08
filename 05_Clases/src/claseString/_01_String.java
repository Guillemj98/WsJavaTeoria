package claseString;

import java.util.Scanner;

public class _01_String {

	public static void main(String[] args) {
		// Las cadenas en java no son tipos primitivos, son clases llamadas "String"
		// internamente un String en java s un array de caracteres "char"
		
		// Las clases en Java por convención empiezan por MAYÚSCULA
		// los primitivos empiezan por minúscula
		int numero = 0;
		String cadena = "Pepe Viyuela";
		// Internamente Java creará algo así:
		char[]cadenaCaracteres={'S','t','e','v','e',};
		
		// Los objetos en Java tiene como lo que se conoce como métodos
		// Un método es una función asociada al objeto en cuestión.
		// y se acceden a ellos a través de la variable y con "." (que realmente se llaman referencias)
		// Ejemplo, la clase Scanner tiene métodos asociados, para recoger datos del usuario.
		// para recoger un entero usamos el método "nextInt();"
		
		// Aqui estamos creando un objeto de la clase Scanner
		// los objetos generalmente se crean con la palabra "new"
		Scanner sc = new Scanner(System.in);
		// Usamo el método "nextInt" para recoger  un entero por teclado
		//int numero1 = sc.nextInt();
		
		// De igual manera la clase String tiene mucho métodos asociados.
		
		// Método toUpperCase() -> Este método devuelve la cadena en mayúsculas.
		String cadenaMayusculas = cadena.toUpperCase();
		System.out.println(cadenaMayusculas);
		// OJOOOOOO el método NO cambia la cadena original
		System.out.println(cadena);
		
		// Método to.lowerCase() -> Este método devuelve la cadena en minúscula
		
		System.out.println(cadenaMayusculas.toLowerCase());
		// OJOOO NO CAMBIA LA CADENA ORIGINAL
		// Nota; las cadena originales nunca cambiaran para ningún método de 
		// la clase String
		System.out.println(cadenaMayusculas);
		
		// Método cgarAt(POSICION) -> DEVUELVE EL  el caracter en la posición que le pasemos
		System.out.println(cadena.charAt(0));
		System.out.println(cadena.charAt(1));
		System.out.println(cadena.charAt(2));
		System.out.println(cadena.charAt(3));
		System.out.println(cadena.charAt(4));
		System.out.println(cadena.charAt(5));
		
		// Método length() -> Este método devuleve el tamaño del String
		System.out.println("Este es el tamaño de mi cadena: " + cadena.length());
		
		// Para imprimir todas las letras de una cadena 
		System.out.println("Imprimir todos loa caracteres");
		for(int i = 0; i<cadena.length();i++) {
			System.out.print(cadena.charAt(i));
			// Aqui lo que hacemos es imprimir un guión entre cada letra pero no lo ponemos en la ultima
			if(i != cadena.length()-1) {
				System.out.print("-");
			}
		}
		System.out.println();
		
		// No se deben comparar String con "==" porque no funciona siempre
		String cadena2 = sc.nextLine();
		if (cadena == cadena2) {
			System.out.println("'=='- Cadena y cadena2 tiene el mismo valor");
		}else {
			System.out.println("'=='- Cadena y cadena2 no tienen el mismo valor");
		}
		
		// Las cadena en Java se deben comparar con el método equals()
		
		if (cadena.equals(cadena2)) {
			System.out.println("equals(); - Cadena y cadena2 riene el mismo valor");
		}else {
			System.out.println("equals() - cadena y cadena2 no tiene el mismo valor");
		}
		
		// Existe otro método para comparar dos cadenas sin tener en cuenta
		// mayusculas y minusculas el método "equalsIgnoreCase()"
		
		if (cadena.equalsIgnoreCase(cadena2)) {
			System.out.println("equals(); - Cadena y cadena2 riene el mismo valor");
		}else {
			System.out.println("equals() - cadena y cadena2 no tiene el mismo valor");
		}
		

	}

}
