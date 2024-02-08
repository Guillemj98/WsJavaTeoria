package clases;

import java.util.Scanner;

public class _01_String {

	public static void main(String[] args) {
		// Las cadenas en java no son tipos primitivos, son clases llamadas "String"
		// internamente un String en java s un array de caracteres "char"
		
		// Las clases en Java por convención empiezan por MAYÚSCULA
		// los primitivos empiezan por minúscula
		int numero = 0;
		String cadena = "Pepe Viyuela";
		// Internamente Java creará algo así:
		char[]cadenaCaracteres={'S','t','e','v','e',};
		
		// Los objetos en Java tiene como lo que se conoce como métodos
		// Un método es una función asociada al objeto en cuestión.
		// y se acceden a ellos a través de la variable y con "." (que realmente se llaman referencias)
		// Ejemplo, la clase Scanner tiene métodos asociados, para recoger datos del usuario.
		// para recoger un entero usamos el método "nextInt();"
		
		// Aqui estamos creando un objeto de la clase Scanner
		// los objetos generalmente se crean con la palabra "new"
		Scanner sc = new Scanner(System.in);
		// Usamo el método "nextInt" para recoger  un entero por teclado
		//int numero1 = sc.nextInt();
		
		// De igual manera la clase String tiene mucho métodos asociados.
		
		// Método toUpperCase() -> Este método devuelve la cadena en mayúsculas.
		String cadenaMayusculas = cadena.toUpperCase();
		System.out.println(cadenaMayusculas);
		// OJOOOOOO el método NO cambia la cadena original
		System.out.println(cadena);
		
		// Método to.lowerCase() -> Este método devuelve la cadena en minúscula
		
		System.out.println(cadenaMayusculas.toLowerCase());
		// OJOOO NO CAMBIA LA CADENA ORIGINAL
		// Nota; las cadena originales nunca cambiaran para ningún método de 
		// la clase String
		System.out.println(cadenaMayusculas);
		
		// Método cgarAt(POSICION) -> DEVUELVE EL  el caracter en la posición que le pasemos
		System.out.println(cadena.charAt(0));
		System.out.println(cadena.charAt(1));
		System.out.println(cadena.charAt(2));
		System.out.println(cadena.charAt(3));
		System.out.println(cadena.charAt(4));
		System.out.println(cadena.charAt(5));
		
		// Método indexOf(CHAR)este método devuielve la posición del primer 
		// Caracter que coincida con el.
		int posicion = cadena.indexOf('P');
		System.out.println("La posición es la: " + posicion);
		
		// Si el caracter no existe devuelve -1
		System.out.println(cadena.indexOf( 'x'));
		System.out.println(cadena.charAt(cadena.indexOf('e')));
		
		// Método length() -> Este método devuleve el tamaño del String
		System.out.println("Este es el tamaño de mi cadena: " + cadena.length());
		
		// Para imprimir todas las letras de una cadena 
		System.out.println("Imprimir todos loa caracteres");
		for(int i = 0; i<cadena.length();i++) {
			System.out.print(cadena.charAt(i));
			// Aqui lo que hacemos es imprimir un guión entre cada letra pero no lo ponemos en la ultima
			if(i != cadena.length()-1) {
				System.out.print("-");
			}
		}
		System.out.println();
		
		// No se deben comparar String con "==" porque no funciona siempre
		String cadena2 = sc.nextLine();
		if (cadena == cadena2) {
			System.out.println("'=='- Cadena y cadena2 tiene el mismo valor");
		}else {
			System.out.println("'=='- Cadena y cadena2 no tienen el mismo valor");
		}
		
		// Las cadena en Java se deben comparar con el método equals()
		
		if (cadena.equals(cadena2)) {
			System.out.println("equals(); - Cadena y cadena2 riene el mismo valor");
		}else {
			System.out.println("equals() - cadena y cadena2 no tiene el mismo valor");
		}
		
		// Existe otro método para comparar dos cadenas sin tener en cuenta
		// mayusculas y minusculas el método "equalsIgnoreCase()"
		
		if (cadena.equalsIgnoreCase(cadena2)) {
			System.out.println("equals(); - Cadena y cadena2 riene el mismo valor");
		}else {
			System.out.println("equals() - cadena y cadena2 no tiene el mismo valor");
		}
		
		// El método split, parte una cadena en X partes de apartir de una caracter
		// te devuelve un array con cada una de las partes 
		String frase = "  En un lugar de la Mancha";
		System.out.println(frase);
		String[]fraseDividida = frase.split(" ");
		System.out.println(fraseDividida[0]);
		System.out.println(fraseDividida[2]);
		System.out.println("------");
		for(String s: fraseDividida) {
			System.out.println(s);
		}
		
		String[]fraseDividida2 = frase.split("e");
		System.out.println(fraseDividida2.length);
		for(String s: fraseDividida2) {
			System.out.println(s);
		}
		String[]fraseDividida3 = frase.split("n");
		System.out.println(fraseDividida3.length);
		for(String s: fraseDividida3) {
			System.out.println(s);
		}
		frase = "En-un-lugar-de-la-mancha";
		String[]fraseDividida4 = frase.split("-");
		System.out.println(fraseDividida4.length);
		for(String s: fraseDividida4) {
			System.out.println(s);
		}
		
		// Siempre que queramos saber como funciona un método es importante
		// consultar la documentación, poniendo el cursor encima después del punto
		
		// Método trim(); quita los espacios en blanco de los extremos de la cadena
		// realmente devuelve una cadena, porque la clase String es inmutable
		
		String cadenaConEspacios = "      cadena con espacios a los extremos            ";
		System.out.println(cadenaConEspacios);
		String cadeanaSinEspacios = cadenaConEspacios.trim();
		System.out.println("Cadena sin espacios: " + cadeanaSinEspacios + "Fin: ");
		
		
		// El método subString(inicio, segunda dato que ponga  -1);
		String subCadena = frase.substring(3, 6);
		System.out.println("'" + subCadena + "'");
		subCadena = frase.substring(5, frase.length());
		System.out.println(subCadena);
		subCadena = frase.substring(1,9);
		System.out.println(subCadena);
		
		// Returns a string th at is a substring of this string. 
		//Thesubstring begins at the specified beginIndex andextends to the character at index endIndex - 
		//1.Thus the length of the substring is endIndex-beginIndex. 
		/*Examples: 
		 "hamburger".substring(4, 8) returns "urge"
		 "smiles".substring(1, 5) returns "mile"	 
		Parameters:beginIndex the beginning index, inclusive.
		*/
		
		subCadena = frase.substring(10); // Este se ejecuta desde la posicion que pongamos hasta el final
		System.out.println(subCadena);
		
		// Método contaisn(cadena); devuelve true si la cadena pasada por 
		// parámetro es contenida en la cadena que invoca el método
		
		System.out.println(frase.contains("de-"));
		
		
		// Método replace(charABuscar, charARemplazar);
		frase = "Mi moto alpina derrapante";
		String fraseRemplazada = frase.replace('a','e');
		System.out.println(fraseRemplazada);
		
		// Método valueOf(primitivo) devuelve un primitivo a formato String
		// Este método es estático, se accede a través de la clase
		
		String enteroAString = String.valueOf(6);
		System.out.println("Numero en String: " + enteroAString);
		
		// Un objeto de la clase String también se puede crear a 
		// partir del contructor de clase
		
		String frase2 = new String("de cuyo nombre no quiero acordarme");
		// Generalmente esta manera no se usa 
		// Cuando recogemos una cadena con la clase Scanner se crean
		// los String de esta manera
				
		

	}

}
