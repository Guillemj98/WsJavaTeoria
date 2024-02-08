package condicionales;

import java.util.Scanner;

public class _02_Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// La sentencia switch es equivalente a un "If-Else If -Else"
		// Tiene la siguiente estructura qe podemos hacer poniendo
		// SWI y pulsando el Ctrl + Espacion y eligiendo el statetement

		// Podemos encontrar la siguientes partes
		// PArte switch, entre parentesis, ponemos la variable a
		// valorar
		int numero = 5;
		switch (numero) {
		// Podemos tener de 1 a N case que serán cada uno de los valores
		// que puede tomar la variable del switch.

		case 0:
			System.out.println("El numero es 0");
			break;// Esta palbra reservada hace que dejemos de ejecutar la
		// sentencias switch y no entre por otrs case o por el default

		case 1:
			System.out.println("El numero es 1, no es 0");
			break;
		case 2:
			System.out.println("El numero es 2, no es ni 0 ni 1");
			break;
		default:// Si no cumple ninguno de los casos anteriores entraría por
			// la sentencia default
			System.out.println("El numero no es ni 0, ni 1, ni 2");
			break;
		}

		// Otro ejemplo
		System.out.println("Introduzca un numero del 1 al 7:");
		numero = sc.nextInt();
		switch (numero) {
		case 1:
			System.out.println("El dia es Lunes");

			break;
		case 2:
			System.out.println("El dia es Martes");

			break;
		case 3:
			System.out.println("El dia es Miercoles");

			break;
		case 4:
			System.out.println("El dia es Jueves");

			break;
		case 5:
			System.out.println("El dia es Viernes");

			break;
		case 6:
			System.out.println("El dia es Sábado");

			break;
		case 7:
			System.out.println("El dia es Domingo");

			break;

		default:
			System.out.println("El numero introducido no corresponde a un dia de la semana");
			break;
		}

		// OJOOOO con no poner los break porque la sentencia se sigue ejecutando
		// Aunque no se cumplan los casos
		switch (numero) {
		case 1:
			System.out.println("El dia es Lunes");
		case 2:
			System.out.println("El dia es Martes");
		case 3:
			System.out.println("El dia es Miercoles");
		case 4:
			System.out.println("El dia es Jueves");
		case 5:
			System.out.println("El dia es Viernes");
		case 6:
			System.out.println("El dia es Sábado");
		case 7:
			System.out.println("El dia es Domingo");
		default:
			System.out.println("El numero introducido no corresponde a un dia de la semana");
			break;

		}

		// En que casos puede ser interesante no poner el break
		// Normalmente cuando queremos que varios casos se comporten de la
		// misma manera
		// En este caso vamosa detectar si el numero introducido pertenece
		// a un dia Lectivo o un dia de fin de semana
		switch (numero) {
		case 1:			
		case 2:			
		case 3:			
		case 4:
		case 5:
			// Podemos poner varias sentencia en el case
			// para ejecutar sin necesidad de crear bloque
			System.out.println("El numero introducido es del 1-5");
			System.out.println("El dia es Lectivo");
			break;
		case 6:			
		case 7:
			System.out.println("El dia es Fin de semana");
			break;
		default:
			System.out.println("El numero introducido no corresponde a un dia de la semana");

		}
		System.out.println("Fin del programa");
	}
}
