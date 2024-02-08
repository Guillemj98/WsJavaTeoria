package _02_bucles;

public class _05_Break_Continue {

	public static void main(String[] args) {
		// Hay veces que tenemo que alterar el flujo
		// de ejecución de los bucles, esta practica conviene
		// evitar al principio cuando estamos aprendiendo algoritmos

		// Para alterar el flujo tenemos 2 palabras reservadas:
		// 1-break
		// 2-continue

		// "break"
		// Con esta palabra rompe la ejecución el bucle donde se encuentra
		// es decir sale inmediatamente

		// Imprimir todos los numeros naturales del 1-7
		for (int i = 1; i <= 10; i++) {
			System.out.println("Numero: " + i);
			if (i == 7) {
				break;// Cuando el numero valga 7 dejo de ejecutar el bucle
			}
		}
		// El ejemplo de aqui ariba se puede hacer sin break mejorando
		// la condición de parada del bucle ( i<=7)

		// OJOOOOOOOOOO rompoe la ejecución del bucle donde se ejecuta pero
		// si esta el bucle anidado, NO rompe el bucle exterior

		// Vamos a imprimir la tabla de multiplicar del los 10 pimeros numeros
		// pero solo los resultados del 1 al 5
		for (int i = 1; i <= 10; i++) {
			System.out.println("Tabla de multiplicar del " + i);
			for (int j = 1; j <= 10; j++) {
				System.out.println(j + " x " + i + " es igual " + (i * j));
				if (j == 5) {
					break;// Este break rompe el bucle de la J No rompe el bucle i
				}
			}
		}
		System.out.println("--------------------CONTINUE----------------");

		// "continue" esta palabra se usa cuando queremos dejar de ejecutar
		// el codigo del bucle y queremos pasar a la siguiente iteración,
		// pero OJOOO no rompe completamente le ejecución del bucle

		// IMRPRIMIR TODOS LOS NUMEROS PARES DEL 1 AL 10
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println("Numero par: " + i);
			}

		}
		System.out.println("--------------------CONTINUE----------------");
		for (int i = 0; i <= 10; i++) {
			if (i % 2 != 0) {
				continue; // Saltamos a la siguiente iterción del bucle
							// por lo tanto no se ejecutaría  la linea 61
			}
			System.out.println("Numero par: " + i);

		}
		for (int i = 1; i <= 6; i++) {
			if(i %2!=0) {
				continue;// volveriamos a la linea 64
				
			}
			System.out.println("Tabla de multiplicar del " + i);
			for (int j = 1; j <= 6; j++) {
				if(j %2!=0) {
					continue;// volveriamos a la,linea 69
				}
				System.out.println(j + " x " + i + " es igual " + (i * j));
				
				
			}
		}
	}

}
