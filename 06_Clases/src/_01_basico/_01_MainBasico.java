package _01_basico;

public class _01_MainBasico {

	public static void main(String[] args) {
		// A partir de una clase podremos crear los objetos
		// Un objeto es una instancia de una clase
		// Los objetos se crean en la JVM en un espacion llamado HEAP
		
		// Para crear un objeto en Java usaremos la plabra reservada 
		// NEW.
		// Un programa en JAVA tendrá tantos objetos como NEWS hayamos hechos.
		
		// Normalmente necesitamos una variable para apuntar al objeto
		// creado. Las variables de clase se llaman "referencias".
		// IMPORTANTE:
		// Una varibale contiene el valor
		// Ejemplo: una variable de tipo Int contiene el valor 5
		// Una referencia contiene la posición de memoria de donde se
		// encuentra el objeto
		// Ejemplo: una referencia de tipo String contiene la posición de memoria
		// "0x123EAF" y en esa memoria estará el objeto de tipo String (con su valor)
		
		// las variables se crean en un espacio de memoria llamado STACK
		int numero = 5;
		
		// las referencias se crean también en el "STACK", pero el objeto 
		// Se crea en el "HEAP".
		String cadena = new String("Pepe");
		
		// Cuando creamos un objeto por defecto los primitivos se 
		// inicializan a 0 o a su equivalente (booleanos a false), y las 
		// referencias a null.
		// Null es ausencia de valor.
		Persona p1 =new Persona();
		
		// Podemos acceder a las propiedades de un objeto mediante la referencia 
		// y un "."
		
		System.out.println(p1.nombre);
		System.out.println(p1.edad);
		System.out.println(p1.estaCasado);
		System.out.println(p1.peso);
		
		// Podemos modificar los valores de los atributos de un objeto.
		p1.nombre = "Thor";
		p1.edad = 167;
		p1.peso = 105.6;
		p1.estaCasado = true;
		
		// Se llama "estado de un objeto" al valor de los atributos en un
		// Instante de tiempo
		
		// Si imprimimos la referencia en principio nos da su dirección 
		// de memoria
		System.out.println(p1);
		
		

	}

}
