
public class _03_Variables {

	public static void main(String[] args) {
		// Las variables son cajas donde vamos a guardar información
		// que podrá ser cambiada en el tiempo

		// Las variables son "cajas" donde vamos a guardar información
		// que podrá ser cambiada en el tiempo

		/*
		 * Todo programa de ordenador persigue ofrecer una funcionalidad determinada
		 * para la que, por regla general, necesitará almacenar y manipular información.
		 * Dicha información, que son los datos sobre los que operaremos, deben
		 * almacenarse temporalmente en la memoria del ordenador.
		 * 
		 * Para poder almacenar y recuperar fácilmente información en la memoria de un
		 * ordenador los lenguajes de programación ofrecen el concepto de variables
		 */

		/*
		 * En Java, una variable es un espacio en la memoria que se utiliza para
		 * almacenar un valor específico (generalmente un literal). Las variables tienen
		 * un nombre, un tipo y un valor.
		 * 
		 * El nombre de una variable es un identificador único que se utiliza para hacer
		 * referencia al valor almacenado en esa variable. El tipo de una variable
		 * especifica qué tipo de valores pueden almacenarse en ella y el valor es el
		 * dato que se guarda.
		 * 
		 * Java es un lenguaje de tipado estático, lo que significa que el tipo de una
		 * variable debe ser especificado al momento de declararla.
		 */
		// Llamamos "declaración de una variable" cuando creamos una varaible por
		// primera vez
		// para usarla durante su ciclo de vida
		// Para declarar un varaiable en java primero
		// especificamos el tipo, luego el nombre
		// y lo igualamos a un valor
		// TIPO_VARIABLE NOMBRE_VARIABLE=VALOR_VARIABLE

		// Ejemplo de variable entera
		int numero1 = 1;
		
		//Una vez declarada una variable no podemos volver a declararla
		//mientras exista
		//int numero1 = 5;// esto da error, la variable ya ha sido "creada"
		
		//Lo que si podemos hacer es cambiar el valor de las variables
		numero1 = 5;
		//POdemos imprimir por pantalla valores de variables 
		//llamandolas por su nombre
		System.out.println(numero1); //java imprimeme el valor de la variable
		
		numero1 = 20;
		System.out.println(numero1);//notese que ahora el valor del numero1 ha cambiado
		
		numero1 = 2130;
		System.out.println(numero1);
		
		//Podemos crear varaibles de distintos tipos
		//Variables booleanas
		boolean variableBooleana = true;
		System.out.println(variableBooleana);
		
		variableBooleana = false;
		System.out.println(variableBooleana);//Notese que el nombre de las variables en java van lowerCamelCase
		
		//OJO!!! el nombre de las variables es sensible a 
		//mayuculas y minusculas
		int estoEsUnaVariable = 0;
		int ESTOESUNAVARIABLE = 0;// SON VARIABLES DIFERENTES
		
		//Las varables en java no pueden emepezar por numero
		//int 1numero = 0; esto da ERROR
		//Las variables en java deben empezar caracter 
		//1. alfabetico
		//2. guion bajo
		//3. Simblo del "$"
		//int %numero = 0;// esto da ERROR
		
		//Variables de tipo double
		double variableDouble = 12.34;
		
		//Variables de tipo long
		long variableLong = 2212121212121L;// OJOOOOO L al final
		variableLong = 3_000_000_000L; //Si ponemos la L daria erro por el literal
		System.out.println(variableLong);
		
		//Variables de tipo float
		float variableFloat = 23.56f;
		
		//Existen otros tipos de variables menos usados, como por ejemplo
		// byte, que es para numero muy pqequeños, entre -128 y 127
		byte variableByte = 127;
		//byte variableByte = 128; // esto da error porque supera los limites
		
		//Variable tipo char
		char variableChar = 'c';
		
		//Variable tipo string o cadena OJOOO en este caso se capitaliza la primera palabra
		String variableCadena = "Esto es una variable de cadena";
		System.out.println(variableCadena);
		variableCadena = "He cambiado el valor de la cadena";
		System.out.println(variableCadena);

	}
}
