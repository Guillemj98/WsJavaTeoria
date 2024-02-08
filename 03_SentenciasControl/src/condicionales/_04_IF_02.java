package condicionales;

public class _04_IF_02 {

	public static void main(String[] args) {
		// Es muuy abitual cunado trabajmps con sentencias de 
		// de control el anidamiento (ANIDAR)bloques, se llama
		// anidar cuando ponemos sentencias de control dentro de 
		// otras sentencias de control
		
		// Ejemplo:
		
		int numero1 = 5;
		int numero2 = 10;
		if (numero1 == 5) {
			System.out.println("El numero es igual a: " + numero1);
			// Puedo anidar para dar funcionalidad añadida
			// es decir poner un if dentro de otro if
			if(numero2== 10) {
				System.out.println("El numero2 es igual a " + numero2);
			}
		}
		// Esto no es totalmente equivalente
		// Aqui no sale ninguno si uno de los dos no entran en los entandares
		if (numero1 == 5 && numero2 == 10) {
			System.out.println("El numero es igual a: " + numero1);
			System.out.println("El numero2 es igual a " + numero2);
		}
		
	}

}
