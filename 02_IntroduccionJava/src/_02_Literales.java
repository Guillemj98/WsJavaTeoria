
public class _02_Literales {
//Un proyecto java puede tener varias 
//clases con metodos main
//el main que se ejecutara sera
//sobre aquel fichero que hagamos el "Run us"
	public static void main(String[] args) {
		System.out.println("Literales en java");
		
		//En java como en todos los lenguajes de programación 
		//tenemos lo que llamamos literales
		
		//Una literal es un valor constante formado por una secuencia de caracteres. 
		//Cualquier declaración en Java que defina un valor constante 
		//-un valor que no pueda ser cambiado durante la ejecución del programa- 
		//es una literal.
		
		//tenemos los siguientes tipos de literales
		//en java.
		
		//Literaes de cadena, van entre comillas dobles
		System.out.println("Esto es un literal de cadena de texto");// esto una sentencia 
		
		//Literales de caracter, van entre commillas simples, y solo puede haber 1
		System.out.println('a');
		
		//Literales booleanos, deben de ser de 2 tipos
		//Verdadero(true) o falso (false)
		//para esto se utilizan las palabras reservadas 'true' y 'false'
		System.out.println(true); // van sin comillas
		System.out.println(false);
		
		//Literales de números enteros (int) , son caracteres 
		// van desde –2,147,483,648 a 2,147,483,647
		//No admite mas rango que este si no da error
		System.out.println(2147483647);// los numeros enteros van sin coma y sin punto
		//Podemos usar "_" guioen bajo para separar los numeros y entenderlo mejor
		System.out.println(1000000000);
		System.out.println(1_000_000_000);// de esta manera se lee mejor, es eequivalente al ejemplo de arriba
		
		//Literales de numeros enteros largos que se llaman (long), el rango es mucho mayor
		//se ponen con una L mayuscula o minuscula al final del numero
		System.out.println(2147483648L);// tambien se puede usar el guion bajo para que se lea mejor
		
		//Literales de numeros  decimales grandes (double)
		//la parte entera se separa de la decimal con un punto "." 
		//este tipo de literal es el mas usado para hacer numeros decimales en java
		System.out.println(1200.235);// se pueden usar guiones tambien
		
		//Literales de numeros decimales pequeños que son los (float), que se tratan igual wue los double 
		//pero se pone una "F" mayus o minus al final 
		//la diferencia con los souble el rango es mas pequeño
		//Apenas se usa hoy en dia es mejor usar "double" para los numeros decimales
		System.out.println(1200.235F);
		
		

	}

}