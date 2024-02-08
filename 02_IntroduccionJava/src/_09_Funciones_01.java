import javax.swing.plaf.synth.SynthOptionPaneUI;

public class _09_Funciones_01 {

	// Una función o método es un bloque de código que realiza
	// alguna operación

	// En programación orientada a objetos ( POO o OOP en inglés)
	// a las funciones se les llaman métodos

	// Los obejtivos de las funciones son basicamente 2
	// 1. Reutilizar código
	// 2. Ordenar el código

	// Los métodos o funciones pueden tener parametros de entrada
	// y parámetros de salida, pero no es obligatorio
	public static void main(String[] args) {
		System.out.println("Bienvenidos a ls funciones o método en java");
		System.out.println("-----------------------");
		System.out.println("------------------------");
		System.out.println("Autor: Felix de Pablo Lobo");

		System.out.println("Bienvenidos a ls funciones o método en java");
		System.out.println("-----------------------");
		System.out.println("------------------------");
		System.out.println("Autor: Felix de Pablo Lobo");

		System.out.println("Bienvenidos a ls funciones o método en java");
		System.out.println("-----------------------");
		System.out.println("------------------------");
		System.out.println("Autor: Felix de Pablo Lobo");

		// Para invoncar una función o método lo haremos a través de su nombre
		bienvenida();
		bienvenida();

		dameElNombreDelAutor();
		// Normalmente cuando invocamos una función o método que devuelve
		// un valor, tenemos que hacer algo con él
		System.out.println(dameElNombreDelAutor());
		// Notese que tenemos la varible "caden" tanto en el método "main"
		// con el método "dameElNombeDelAutor ()"
		// NO son las misma variable, el ciclo de vida de una variable es
		// desde que se declara hasya el FINAL del bloque donde se creo
		String cadena = dameElNombreDelAutor();
		// String cadena = dameElNombreDelAutor(); esto da error
		System.out.println("El nombre del autor: " + cadena);

		int nunero2 = 67;
		// int numero2 =67; // Esto da error, porque no se puede declarar
		// la variable 2 veces

		{
			int numero = 5; // Aqui nace
			// Esta variable morira cuando salga del bloque
		} // Aqui muere

		int numero = 5; // como la variable ya ha muerto ya podemos volver a declarla
		// con el mismo nombre

		int numero3 = 76;
		{
			// int numero3 = 100; no se puede porque la variable no ha muerto todavía
			// no ha terminado
			System.out.println(numero3);// sigue existiendo la variable numero3
			// En este caso SI podemos usar la varible numero 3 porque sigue viva
			
		}
		// Invocamos método imprimirNombreAutor
		imprimirNombreAutor ("Félix de Pablo Lobo");
		imprimirNombreAutor ("Luis de Pablo Mariano De Todos Los Santos Du Silva");
		String autor = "Federico García Lorca";
		imprimirNombreAutor(autor);
		
		int potencia = calcularPotenciaCuadrada(6);
		System.out.println("La potencia es: " + potencia);
		potencia = calcularPotenciaCuadrada(12);
		System.out.println("La potencia es: " + potencia);
		System.out.println("La potencia directamente es: " + calcularPotenciaCuadrada(9));
		
		String nombreFinal = concatenarNombreYApellidos("Gabriel", "García");
		System.out.println("El nombre final es: " + nombreFinal );
		
		//Cada vez que quiera imprimrir, en vez de usar syso puede usar "im"
		im ("Esto es lo que quiero imprimir");
		im ("Esto es otra impresión");
		
		// Las funciones o métodos en java las podemos declarar dentro de una clase
		// Pero OJO Fuera del metodo main es decir no podemos declarar métodos
		// O funciones dentro de funciones o métodos

	}// Fin del método MAIN

	// Las funciones para declararla tienen que tener un nombre
	// de función o método

	// En lo lenguajes compilados podemos poner las funciones o métodos
	// en cualquier parte de nuestro código, pero siempre dentro de una clase
	// En lenguajes no compilados como JAVAScript tenemos que declarar antes
	// un método para poder usarlo.

	// En este caso vamos a declarar el método bienvenida
	// Este método no tendra parametros de entradas. Los parametros de
	// de etrada van entre los parentesis y separados por "," y son equivalentes
	// a las variables

	// Este método no tendra parámetros de salida y se especifica con la palabra
	// void justo antes del nombre del método. Que una función o método no tenga
	// parametros de salida quiere decir que no devuelve nada.
	public static void bienvenida() { // Llave de apertura del método bienvenida
		System.out.println("Bienvenidos a ls funciones o método en java");
		System.out.println("-----------------------");
		System.out.println("------------------------");
		System.out.println("Autor: Felix de Pablo Lobo");

	}// Esta es la llave de cierre del método bienvenida

	// En este caso vamos a hacer una función que devuelva una cadena de texto
	// Para ello debemos de poner el tipo de dato que devuelve justo antes
	// del nombre de la función o método, sustituyendo la palabra "VOID".
	public static String dameElNombreDelAutor() {
		// NOtación LowerCamelCase, la misma que las variables
		// Cuando una función devuelve algún dato debe tener en algún
		// momento la palabra return con el tpo de dato que queremos
		// devolver
		// Cuando se ejecute el return se acabará la función
		// return "Felix De Pablo Lobo";

		// Esto es equivalente a lo anterior
		// La variable "cadena" nacerá en la linea siguiente
		// Y morirá cuando salga del bloque, en este caso
		// en el final del método
		String cadena = "Felix De Pablo Lobo";
		return cadena;

	}
	// Método con un parametro de entrada y ningún parámetro
	// de salida
	
	public static void imprimirNombreAutor(String nombre) {
		// Los parametro de entrada morirám cuando acaben la
		// función
		System.out.println("El nombre del autor: " + nombre);
		
	}
	
	// Método con un parametro de entrada y otro de salida
	
	public static int calcularPotenciaCuadrada (int numero){
		int potencia = numero * numero ;
		return potencia;
		
	
	}
	// Método con 2 parametros de entrada y 1 de salida
	// NOTA: los parámetros de entrada van de 0 a ..N
	// los parámetros de salida van de 0 a 1
	// Es decir parmetros de entrada los que quieras de salida o 1 o 0
	
	public static String concatenarNombreYApellidos (String nombre, String apellido) {
		//String nombre = "Felix" no se admite porque ya tienes la variable arriba
		// Vamos a poner un espacio en blanco para que no salga todo junto
		String nombreCompuesto = nombre + " " + apellido;
		return nombreCompuesto;
		
	}
	
	public static void im(String cadena) {
		System.out.println("--------------");
		System.out.println("Salida: " + cadena);
		System.out.println("---------------");
		
	}
	
	
	
	
	
	
	
	
	
	
}// Fin de la clase
