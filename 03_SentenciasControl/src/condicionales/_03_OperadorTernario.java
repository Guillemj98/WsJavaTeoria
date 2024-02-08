package condicionales;

public class _03_OperadorTernario {

	public static void main(String[] args) {
		// Este es el menos usado de todos los condicionales
		// OPERADOR TERNARIO
		// --------------
		// Con este operador buscamos a hacer una sentencia "if else"
		// de una manera rápida y en una sola linea.
		
		// La estructura es la siguiente 
		// (EXPRESION_BOOLEAN) ? CASO_VERDADERO : CASO_FALSO;
		// El caso será lño que devuelva la expresion, que normalmente
		// lo almacenamos en una variable
		
		// Ejemplo:
		int numero = 6;
		int numero1 = 7;
		String cadena = (numero <= numero1) ? "Menor o igual que 5" : " Mayor que 5 ";
		System.out.println(cadena);
		
		// Equivalente al ternario
		if (numero <=5) {
			System.out.println("Menor o igual que 5");
			
		}else {
			System.out.println(" Mayor que 5 ");
		}
		
		// Otro ejemplo:
		String texto = (numero %2==0) ? "El numero es Par": "El numero es Impar";
		System.out.println(texto);
		
		// Otro ejemplo:
		// Las variables booleanas normalmnte empiezan por "ES" o por "IS"
		// Tambien pueden empezar por "Tiene" o "Has"
		boolean esPar = (numero %2==0) ? true: false;
		// OJOOO no se recommienda llamar a las variables negadas
		// Ej: es menor tomar el nombre "esPar" que llamarla "noesPar"
		if(esPar) {
			System.out.println("La variable es par");
			
		}else {
			System.out.println("La variable es impar");
		}
		
		// Si queremos usar la negación mejor usar el signo "!"
		if(!esPar) {
			System.out.println("La variable es impar");
			
		}else {
			System.out.println("La variable es par");
		}

	}

}
