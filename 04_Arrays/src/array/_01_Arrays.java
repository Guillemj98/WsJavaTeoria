package array;

public class _01_Arrays {

	public static void main(String[] args) {
		// Un array en java es una estructura de datos que nos 
		// permite almacenar una colección de datos de un mismo
		// tipo
		
		// Podemoa entender un array como tener muchas variables de
		// un mismo tipo declaradas en una estructura.
		
		// Ejemplo, si queremos alamcenar 5 numeros enteros en memoria
		// necistariamos 5 variables de tipo INT
		
		int n1 = 0;
		int n2 = 1;
		int n3 = 2;
		int n4 = 3;
		int n5 = 4;
		
		// Si quisieramos imprimirlos tendriamos que ir 1 a 1
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
		
		// Los arrays nos permiten almacenar un numero de variables
		// dentro de una misma variable
		
		// Podemos declarar un array de la siguiente manera
		
		int[]arrayNumero = new int [5];
		// Con crchetes decimos que la variable será de tipo array
		// un array siempre tiene que inicializarse con un tamaño fijo
		// se hace poniendo la palabra reservada "new" luego el tamaño
		// del array entre corchetes [] junto con el tipo
		// En este casi hemos creado un array de enteros de tamaño 5
		// es decir podemos almacenar 5 valores de tipo entero.
		// Podemos acceder a cualquier posición del array, la primera
		// posición siempre va a ser la 0, luego la segunda es la 1, y 
		// asi sucesivamente
		// en cada posición del array podemos almacenar un valor del tipo del
		// array, L primera posición de un array NO es la posición 1 es la 
		// posición 0. en el array anterior la posiciones iriían de la 
		// la posición 0 a la 4.
		
		// Para modificar una posición del array debemos de usar la varible 
		// y dentro de los corchetes pondremos la posición que queremos 
		// modificar.
		// Los array nuemericos se inicializan todas las posiciones a 0
		
		arrayNumero[0] = 1;
		arrayNumero[1] = 3;
		arrayNumero[2] = 4;
		arrayNumero[3] = 5;
		arrayNumero[4] = 6;
		
		// Para acceder  una posición del array se hace de la misma manera
		System.out.println("--------Impresión con array--------");
		System.out.println(arrayNumero[0]);// esta sería la primera posición del array
		System.out.println(arrayNumero[1]);// esta sería la segunda posición del array
		System.out.println(arrayNumero[2]);// esta sería la tercera posición del array
		System.out.println(arrayNumero[3]);// esta sería la cuarta posición del array
		System.out.println(arrayNumero[4]);// esta sería la quinta o ultima posición del array
		
		// OJOOOO si accedemos o modificais una posición que no existe, da error 
		// en tiempo de ejecución, concretamente ArrayIndexOutOfBoundException.
		//arrayNumero [5]= 6;// no da error en tiempo de compilación pero si en tiempo de ejecución
		
		// Una vez creado el array, No se puede modificar el tamaño. es por eso que este
		// tipo de array en java se conoce como array estático
		
		// Podemos conocer la longitud de una array gracias a la propiedad length
		
		System.out.println("El tamaño del array es : " + arrayNumero.length);
		
		// Gracias a que una array es una colección de variables
		// se puede recorrer con bucles
		
		// Ejemplo, guardar los primeros 1000 numeros en variables
		int[] arrayMilNumeros= new int [1000];
		arrayMilNumeros[0]=1;
		arrayMilNumeros[1]=2;
		arrayMilNumeros[2]=3;
		// Esto es inviable..
		// Hay que usar bucles
		for(int i =0; i < 1000; i++) { // Podemos pober que i sea < 1000 o i <=999
			arrayMilNumeros [i] = i + 1;
		}
		System.out.println("Ahora imprimimos el bucle");
		for(int i =0; i<1000;i++) {
			System.out.println(arrayMilNumeros[i]);
		}
		
		// Normalmente para recorrer un array se usa como condición de 
		// parada la propiedad length
		for(int i =0; i < arrayMilNumeros.length;i++) {
			System.out.println(arrayMilNumeros[i]);
		}
		
		// Se pueden hacer arrays de cualquier tipo de dato
		double[]arrayDoubles = new double[5];
		arrayDoubles[0]= 34.56;
		
		boolean[]arrayBoolean = new boolean[3];
		arrayBoolean[2]= false;
		//arrayBoolean[3]= false;// error en tiempo de ejecución
		
		// Podemos declarar arrays e inicializarlos al mismo tiempo
		char[]arrayCaracteres= {'g','e','i','a','b'};
		// el tamaño de este array es 5
		// el numero de posiciones de este array es 5
		// la primera posición del array tiene un valor F
		// la ultima posición 5 del array no existe
		// la posición 4 de este array tiene de valor b
		
		int[]arrayNumerico2 = {2,4,5,6,7,8};
	}

}
