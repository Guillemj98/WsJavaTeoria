package _02_bucles;

public class _04_AnidamientoBucles {

	public static void main(String[] args) {
		// Es muuy habitual anidar también bucles al igual que
		// anidabamos bloques IF

		// Se suele usar para recorrer o implementar matrices bi-dimensionales

		// Por ejemplo si se pidiera imprimir por pantalla la tabla
		// de mutiplicar de los 10 primero numeros naturales.

		System.out.println("Tabla de multiplicar del 1");
		for (int i = 1; i <= 10; i++) {
			System.out.println("1 x " + i + " es igual " + (i * 1));
		}
		System.out.println("Tabla de multiplicar del 2");
		for (int i = 1; i <= 10; i++) {
			System.out.println("2 x " + i + " es igual " + (i * 2));
		}
		System.out.println("Tabla de multiplicar del 3");
		for (int i = 1; i <= 10; i++) {
			System.out.println("3 x " + i + " es igual " + (i * 3));
		}
		// De esta manera si nos pidieran las tablas de multiplicar de los
		// 1000 primeros numero tendriamos que repetir esto 1000

		// Mejor aplicar anidamiemto de bucles
		// este bucle va a llevar el control del numero de veces que
		// queremos repetir la tabla de mltiplicar
		// Una ve hecho el algoritmo podemos cambiar el valor y hacer multplicaciones
		// de mas numeros

		for (int i = 1; i <= 10; i++) {
			System.out.println("Tabla de multiplicar del " + i);
			for (int j = 1; j <= 10; j++) {
				System.out.println(j + " x " + i + " es igual " + (i * j));
			}
		}

		// Podemos trabajr con 3 dimensionesç
		System.out.println("------------Coordenadas en 3D----------");

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				for (int k = 1; k <= 10; k++) {
					System.out.println("Estamos en el punto de coordenadas: " + "(" + i + "," + j + "," + k + ")");
				}
			}
		}
		
	}
	
}
