package condicionales;

import java.util.Scanner;

public class _01_If_01 {

	public static void main(String[] args) {
		// Los programas como hemos visto se jecutan linea a linea
		// hasta que llegan al fin del bloque del metodo main y 
		// entonces se acaba el programa.
		
		// Existen diferentes manera de alterar esta secuencialidad, y 
		// muchas veces es necesaria para crear algoritmos o hacer determinadas
		// funcionalidades.
		
		// UNa manera es mediante CONDICIONALES. Los condicionales 
		// evaluan una epresión BOOLEAN, y en función de si la instrucción
		// es true o false, se tomará una ruta u otra.
		
		// Una manera para hacer condicionales es mediante la palabra reservada
		// "IF". La condición a evaluar irá siempre entre parentesis.
		
		boolean cierto = true;
		if (cierto) // como la variable cierto es true entramos dentro del condicional
			System.out.println("La variable tiene valor true");
		
		cierto = false;
		if (cierto) // como esto es false no entramos dentro del condicional
			System.out.println("La variable tiene valor false(esto no se imprime)");
		
		// Puedo jugar con operadores para alterar la expresión booleana
		if (!cierto)
			System.out.println("La variable tiene valor false");
		
		int numero = 7;
		if(numero > 5)
			System.out.println("La variable numero es mayor que 5");
		
		numero = 3;
		if(numero > 5)
			System.out.println("La variable numero es mayor que 5");
		
		// Notese que solo afecta a la sentencia inmediatamente siguiente
		// si queremos que la condción afecta a mas de una línea, debemos de usar
		// un bloque
		
		numero = 6;
		if (numero > 5) {
			System.out.println("Hurra es mayor que 5");
			System.out.println("El numero es: " + numero);
			
		}
		// IMPORTANTE: se considera buena practica de programación
		// en java hacer siempre bloques en los condicionales ya que 
		// facilita la lectura. Es decir no importa si haceis una linea
		// o varias siempre es conveniente hacer un bloque
		
		// La sentencia If puede contener otra palabra reservada en caso
		// de que no se cumpla la condición. La palabra es else
		
		if (numero > 5) {
			System.out.println("El numero es mayor que 5");
			
		}else {
			System.out.println("EL numero es menor o igual que 5");
		}
		
		// Normalmente las condiciones se basan en entradas de usuarios o 
		// parámetros de entrada 
		Scanner sc = new Scanner(System.in);
		System.out.println("Introzca un numero para saber si es mayor igual o menor  a 5");
		numero = sc.nextInt();
		if (numero > 5) {
			System.out.println("El numero es mayor que 5");
			
		}else {
			System.out.println("EL numero es menor o igual que 5");
		}
		
		// Existe otra variante del If que nos da de poner más condiciones a valorar
		// que es el "else if" . Podemos poner tantos else if como queramos
		
		if (numero > 5) {
			// Si entra por esat condicion no valora el else if
			// y por supuesto tampoco entra por el else
			System.out.println("El numero es mayor que 5");
			
			// si no se cumple la condición del if, valora esta otra opción
			// pero OJOOO se la condición del If se cumple NO se valora esta
			// otra opción
			
		}else if(numero<5) {
			System.out.println("El numero es menor que 5");			
		
		}else if(numero == 5) {
			// Si no cumple el primer ni el segundo if entonces valoramos 
			// esta opción
		System.out.println("El numero es igual que 5");			
		}
		// El else lo podemos usar si lo necesitamos
		// pero en este caso no lo necesitamos
		/*else {
			System.out.println("EL numero es menor o igual que 5");
		}*/
		
		// Podemos ver como los bloques else if y else son totalmente
		// Optativos, los podemos usar o no, además else if se puede repetir
		// mientras que el bloque else solo puede haber 1 como mucho, si lo hay
		
			
	
		System.out.println("Fin de programa");

	}

}
