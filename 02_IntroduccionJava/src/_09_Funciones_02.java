
public class _09_Funciones_02 {

	public static void main(String[] args) {
		imprimirLong(45);
		imprimirSuma(45, 55);
		imprimirCadena("Pepe");
		imprimirCadena("MAria", "Pepe");
		imprimirCadena("Manolo", 34);
		System.out.println("Fin de programa");
		
		// Gracias a la sobrecarga puedo usar la función imprimir
		// y dependiendo del parámetro de entrada, se invocará
		// una función u otra
		
		imprimir(24.5);
		imprimir(2_000_000_000);
		imprimir("Pepe");

	}

	// Las funciones tienen las siguientes partes
	// 1. Visibilidad, desde donde se puede invocar la función.
	// De momento haremos que se pueda invocar desde cualquier parte
	// y lo haremos con la palabra public
	// 2. EL tipo de función que puede dinámica o estática. De momento
	// todas nuestras funciones son estáticas --> static
	// 3. Parámetro de salida, el tipo de valor devuelto por la función.
	// En caso de que no devuelva nada se usa la palabra VOID solo se puede
	// devolver 1 valor y se debe hacer con la palabra return dentro de la
	// función. Cuando se ejecute la palabra "return" se acabará la función
	// 4. El nombre de la función que representa como identificar y
	// como invocar la función, el nombre de la funcuión sigue el mismo
	// reglamento que los nombres de funciones. Ademas se debe usar
	// lowerCamelCase
	// 5. Parámetros de entrada, se ponen entre () las variales que necesita
	// la función para hacer su función. Puede haber varios parámetros de entrada
	// separados por comas ","
	// 6. Las funciones siempre van con un bloque "{}"

	public static double estaEsMiFuncion(int numero1, double numero2, String cadena1) {
		// Operaciones que realiza la función
		return 0;
		// Da error en tiempo de compilación
		// System.out.println("Peter");
		// este código no se va ejecutar nunca porque ya ha terminado la función
	}

	// Podemos invocar funciones dentro de otras funciones y suele ser muy habitual
	public static void imprimirLong(long numero1) {
		System.out.println("--------------");
		System.out.println("Salida: " + numero1);
		System.out.println("---------------");
	}

	public static void imprimirSuma(int n1, int n2) {
		long resultado = n1 + n2;
		imprimirLong(resultado);

	}
	public static void imprimirCadena(String s1) {
		System.out.println("--------------");
		System.out.println("Salida: " + s1);
		System.out.println("---------------");
	}
	// En java existe el concepto de firma de función
	// La firma de una función es lo que hace que java 
	// distinga univocamente una función de otra.
	// Em java la firma de una función desta compuesta de :
	// 1. El nombre de la función
	// 2. El número de parámetros de entrada de una función
	// 3. El tipo de parámetros de entrada de una función.
	// No pertenece el parámetro de salida.
	
	// La siguiente función no vale o da erro porque tiene la 
	// MISMA FIRMA que la función de antes. Para java las 2 funciones son iguales
	// La función de no daría error si cambiamos el nombre
	// Cambiando los parámetros de entrada tambien funciona, por ejemplo
	// le aumento el numero de parámetros.
	/*public static void imprimirCadena(String s1) {
		System.out.println("--------------");
		System.out.println("Salida: " + s1);
		System.out.println("---------------");
	}
	*/
	// Creamos otra función que se llame igual pero cambiamos 
	// el numero de parámetros de entrada por lo tanto la 
	// firma es diferente
	public static void imprimirCadena(String s1, String s2) {
		System.out.println("--------------");
		System.out.println("Salida : " + s1);
		System.out.println("Salida : " + s2);
		System.out.println("---------------");
	}
	// Aqui he cambiado el tipo de parámetros de entrada,y 
	// por lo tanto cambio la firma de la función.
	public static void imprimirCadena(String s1, double d2) {
		System.out.println("--------------");
		System.out.println("Salida : " + s1);
		System.out.println("Salida: " + d2);
		System.out.println("---------------");
	}
	// Concepto de SOBRECARGA de funiones 
	// En java sobrecargamos una función cuando 2 o mas
	// funciones tienen el mismo nombre pero distina 
	// firma, es decir , cambioa el numeor de parámetros
	// o cambia el tipo de parámetros de entrada.
	// Para que una función este sobrecargada debe haber 2 o mas
	// que se llaman igual pero tienen distinto numero o tipo de 
	// parámetros de entrada.
	
	// La función System.out.println esta sobrecargada, según el parámetro
	// de entrada que se pase se invoca a un println o a otro.
	public static void imprimir(long valor) {
		System.out.println("------ long --------");
		System.out.println("Salida: " + valor);
		System.out.println("---------------");
	}
	public static void imprimir(String valor) {
		System.out.println("------ String --------");
		System.out.println("Salida: " + valor);
		System.out.println("---------------");
	}
	public static void imprimir(double valor) {
		System.out.println("------ double --------");
		System.out.println("Salida: " + valor);
		System.out.println("---------------");
	}
	// El parámetro de salida NO pertence a la firma de la 
	// función o método por lo tanto esta funcion  para java es 
	// es igual que la de arriba, por lo tanto da error 
	// de compilación
	/*public static String imprimir(double valor) {
		System.out.println("------ double --------");
		System.out.println("Salida: " + valor);
		System.out.println("---------------");
		return "Manuel no te arrimes ";
	}
	*/
	
	

}
