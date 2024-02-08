import java.util.Scanner;

public class _07_EntradaSalida {

	public static void main(String[] args) {
		// E muy habitual en las aplicaciones tener entradas
		// de datos del usuarios y salidas de datos 
		// una vez procesada de la infromación
		// tenemos 2 maneras de presentar la información
		
		// Mediante el:
		//1. System.out.println ->  Salida estandar de consola
		// 2. System.err -> Salida de errores de consola.
		
		
		// Una vez que trabajemos con una salida, podemos usar algún 
		// metodo para imprimir por ella
		System.out.println("salida de errores");
		System.err.println("salida de errores");// Syserr + Ctrl y espacio
		System.err.println("salida de errores");
		
		// OJOOO: system.out y system.err trabajan con flujos
		// de salidas, por lo tanto si dos sentencias estan muy juntas
		// pueden que salgan de manea diferente
		
		// En java tenemos una menera de recoger información  
		// a través de la consola mediante System.in
		// Lamnetablemente debemos apoyarnos en otras clases
		// para poder recoger la infromación a partir de este 
		// System.in
		// el caso mas habitual es mediante la clase  Scanner.
		// Para ello debemos crearnos una variable de tipo 
		// Scanner y su correspondiente objeto, diciendole que 
		// lea de System.in 
		// Para usar esta clase debemos de importar el paquete
		// donde se ecuentra.
		// Las importaciones de paquetes se ponen al principio de 
		// de las clases
		// EJ: import java.util.Scanner;
		// El concepto de paquete es muy similar al 
		// concepto de directorio
		
		Scanner sc = new Scanner(System.in);
		// Si ponemos Scan y pulsamo ctrl + espacio nos debe
		// importar automaticamente la clase
		
		// Una vez creada la variaible y el objeto podemos empezar
		// a usar métodos del objeto para capturar la infromación
		// los metodos son funcionalidades que pueden aplicar los objetos.
		// Invocamos un metodo de un objeto mediante el operador "."
		
		// Mediante el metodo nextLine el programa se quedara parado
		// en esa linea hasta que el usuario introduzaca una frase 
		// para leer y pulse ENTER.
		// NOTA: podemos observar como el program sigue en ejcución 
		// porque hay un cuadrado rojo en eclipse en la pantalla
		// de la consola
		
		System.out.println("Introduzca una frase para leer");
		// Normalmente el calor que introduzca el usuario
		// debemos de almacenarla en algun lugar, como puede ser una variable
		// En este caso como queremos leer una frase, vamos a usar 
		// un String
		// El método nextLine devuelve un String, es por ellos que usamos 
		// una variable String para almacenar el resultado.
		
		String frase = sc.nextLine();
		System.out.println("El usuario ha introducido la frase: " + frase);
		
		// Una vez creado el "Scanner" no es necesario crearlo mas
		
		System.out.println("otra frase");
		frase = sc.nextLine();
		System.out.println("La segunda frase es: " + frase);
		
		
		System.out.println("Introduza un numero");
		String s1 = sc.nextLine();
		System.out.println("Introduzca otro numero");
		String s2 = sc.nextLine();
		String s3 = s1 + s2; // Aqui concatena
		System.out.println("La concatenación de s1 y s2 es:" + s3);
		
		// La clase Scanner tiene metodos para recoger distintos tipos 
		// de datos 
		// Si queremos recoger un entero debemos usar nextInt();
		// NO podemos guardar un int en una variable String.
		// String s4 = 4; esto da error
		
		System.out.println("Introduza un numero");		
		int n1 = sc.nextInt();
		System.out.println("Introduza un otro numero");	
		int n2 = sc.nextInt();
		int n3 = n1 + n2; // Aqui suma
		System.out.println("El resultado de la suma de n1 y n2 es :" + n3);
		
		// Otros metodos
		System.out.println("Introduzca un long");
		long l1 = sc.nextLong();
		System.out.println("El numero long es: " + l1);
		
		
		// OJo por teclado se pone el punto flotante por ,
		// pero en java se guarda con .
		double d1 = sc.nextDouble();
		System.out.println("El numero double es: " + d1) ;
		float f1 = sc.nextFloat();
		System.out.println("El numero float es :" + f1);
		
		// Tenemos un metodo para cada uno de los tipos 
		// primitivos
		
		// OJOOOOOOO Si recoges un tipo de dato y lo 
		// guardas en otro diferente puede dar error.
		System.out.println("Introduzca un numero, ojo un número");
		// Si le decis a java que queremos recoger un numero e 
		// introducimos un String daria una excepcion en tiempo
		// de ejecución
		// Puede también ocurrir si poneis un nextInt () y ponemos un double
		int n4 = sc.nextInt(); // Solo podemos poner por teclado un Int
		System.out.println("El numero es : " + n4);
		
		//OJO importante 
		//La clase scanner tiene un pequeño problema siempre 
		// que queramos recoger una cadena despues de haber
		// recogido cualquier dato que no sea caden
		// Ejemplo recogemos un entero y luego una cadena
		// Ejemplo recogemos un double y luego una cadena
		// en este caso debemos de recoger 2 veces la cadena para
		// que no de problemas
		
		System.out.println("Introduzca la cadena a recoger");
		sc.nextLine (); // para evitar que el programa termine copiamos esto arriba
		// Como el ultimo dato que recogimos con scanner es un int
		// ahora debemos hacer 2 nextLine para que funcione
		String cadena = sc.nextLine ();
		System.out.println("La cadena recogida es: " + cadena);
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
