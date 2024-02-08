package clases;

import java.text.DecimalFormat;
import java.util.Random;

public class _03_Math {

	public static void main(String[] args) {
		// La clase Math nos va servir para realizar operaciones
		// matemáticas
		
		// Esta clase todos sus métodos son estáticos, es decir, no es 
		// necesario crear objetos de la clase Math para invocar sus métodos 
		
		// Ejemplo:
		// Si queremos usar la clase Random tenemos que crear un objeto de 
		// la clase, y eso se hace con la palabra reservada "new".
		Random rd = new Random();
		rd.nextDouble();
		
		// En la clase MATH al ser sus métodos estáticos debemos invocarlos 
		// directamente desde la clase
		// Ejemplo para obtener una potencia
		double potencia = Math.pow(2, 3);
		// Notese como no hago New de la clase MATH
		
		// Podemos obtner el numero PI y el numero E
		final double constantePI = Math.PI;
		System.out.println(Math.PI);
		System.out.println(Math.E);
		
		// Redondea hacia abajo
		Math.floor(constantePI);
		System.out.println(Math.floor(4.99));
		
		// Redondea hacia arriba
		System.out.println(Math.ceil(4.99));
		
		// Returns the closest long to the argument, 
		// with tiesrounding to positive infinity. 
		System.out.println(Math.round(4.99));
		System.out.println(Math.round(4.5));
		System.out.println(Math.round(4.51));
		System.out.println(Math.round(4.01));
		
		// Distancia del valor al 0, o valor absoluto
		System.out.println(Math.abs(3));
		System.out.println(Math.abs(-3));
		
		// Otra manera de calcular aleatorios
		// En este caso te devuelve un numero aleatorio
		// entre el 0 y el 1.
		System.out.println(Math.random());
		// Donde n es el valor máximo. esto nos genera un número aleatorio entre 
		// el 1 y el N
		
		int numeroAleatorio = (int)(Math.random()* 10)  +1;
		System.out.println(numeroAleatorio);
		
		// Raíz cuadrada
		System.out.println(Math.sqrt(49));
		
		// Si queremos quedarnos con un numero de decimales 
		// debemos usar la clase DecimalFormat
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println(df.format(constantePI));
		
		
		// Podemos convertir cadenas a numeros, MUY IMPORTANTE
		// cuando leemos datos de ficheros, bases de datos ...
		int numero = Integer.parseInt("50");
		double numero2 = Double.parseDouble("50.62");
		System.out.println(numero);
		System.out.println(numero2);
	}

}
