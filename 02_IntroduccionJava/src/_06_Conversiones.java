
public class _06_Conversiones {

	public static void main(String[] args) {
		long numeroLargo = 1000L;
		int numeroEntero = 0;
		// podemos igualar siempre variables del mismo tipo sin problema

		long numeroLargo2 = numeroLargo;

		// java no puede saber cuando ejecuta el programa
		// el valor de la variable , por lo que
		// no te va dejar igualar un entero a un long
		// int numeroEntero = numeroLargo;
		// pero si funciona al reves
		// Si el tipo de dato que queremos guardar es menor
		// que el tipo de datos de la variable, entoces si que
		// podemos

		byte numeroByte = 100;
		numeroEntero = numeroByte;
		// A la inversa NO PODEMOS!!!!!!!!!!!

		numeroLargo = numeroEntero;

		// Conversion de datos
		// si queremos convertir un tipo de dato a otro
		// debemos usar el llamado 'casting'.
		// Castemaos el numero entero se pone el tipo de dato
		// al que queremos cambiarlo entre parentesisi justo antes del
		// tipo de dato que queremos castear
		// esta tecnica siempre hay que usarla 
		// cuando querremos introducir un tipo de dato
		// mas grande en un tipo de dato mas pequeño
		// Ej: si queremos inroducir un long en un  
		// entero debemos hacer siempre un cast
		// al reves no haría falta
		// Por otro lado valores o tipos de datos o
		// ordenados de mayor a menor de numeros enteros
		//  long > int > char =short > byte
		// Tipos de datos ordenados de mayor a menor 
		// de numeros en punto flotante
		// double > float 
		
		// OJOOO siempre que hagamos un cast de 
		// de un numero punto flotante a un 
		// numero entero siempre vamos a perder
		// la parte decimal
		numeroLargo = 10000L;
		numeroEntero = (int) numeroLargo;// Casting
		System.out.println(numeroEntero);

		numeroLargo = 1_000_000_000_000L;
		numeroEntero = (int) numeroLargo;
		System.out.println(numeroEntero);
		numeroLargo = 2_147_483_648L; // se pasa de rango del numero entero
		numeroEntero = (int) numeroLargo;
		System.out.println(numeroEntero);
		// al imprimir hace lo que puede java
		// y al irse de rango empieza a contr con el negativo
		// OJO!!!! hay que ser responsables con lso casting,
		// porque va a hacer lo posible con el cast
		// pero eso no significa que este bien hecho

		double numeroDoble = 20.55;
		numeroLargo = (long) numeroDoble;
		// te imprime el mmismo numero pero
		// perdemos la parte decimal
		System.out.println(numeroLargo);
		numeroDoble = 30.00;
		numeroLargo = (long) numeroDoble;
		System.out.println(numeroLargo);// pierdo el decimal pero al ser 0 no afecta

		// Boolean
		boolean bool1 = false;
		// numeroByte = (byte)bool1;
		// hay veces que no tiene sentido
		// y por lo tanto no te deja y da
		// error de compilación
		
		// Cadenas
		 String cadenaNumerica = "1";
		// numeroEntero = (int)cadenaNumerica ; // no permite  

	}

}
