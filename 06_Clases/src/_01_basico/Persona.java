package _01_basico;
// Una clase es un molde para la creación de objetos. Podemos entenderla
// como molde, planos esquema

// Las clases tienen unos atributos comunes a todos los objetos , es decir, 
// cuando creamos un atributo todos los objetos de dicha clase tendrán 
// dicho atributo, OJO, podran tener distintos valores

// Java es un lenguje tipado, por lo que los atributos tendrán un tipo
// Esta clase será usada por otras clases, no se puede arrancar porque 
// no tiene el método main.

// Las clases en java tienen notación UpperCamelCase
public class Persona {
	// Los atributos se declaran dentro de la clase y FUERA de las funciones
	// Normalmente se declaran al principio.
	
	// El ciclo de vida de los atributos es igual al ciclo de vida de un
	// objeto.
	// Los atributos siguen la notacion lowerCamelCase
	String nombre;
	int edad;
	double peso;
	boolean estaCasado;

}
