package _01_arrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class _01_ArrayList {

	public static void main(String[] args) {
		// Los array ( normales ) en java tienen un problema y es que 
		// son estáticos, es decir, el tamaño creado una vez creado 
		// el array es inmutable (no puede cambiar nunca), si creamos 
		// array de 5 elementos solo podrá tener 5 elementos.
		
		String[]arrayStrings1 = new String [5];
		// aunque no tenga ningun elemento el array si pregunto
		// por su tamaño, me dice 5
		System.out.println(arrayStrings1.length);
		
		// Normalmente este tipo no se suele usar, en su lugar se usan
		// array dinamicos, es decir, arrays que se amplia el tamaño
		// en tiempo de ejecución.
		// Dicho de otra manera no se llenan nunca.
		
		// La clase arrayList se tiene que parametrizar, esto es 
		// se pone entre mayor y menor el tipo de dato que queramos
		// que contenga el arrayList. A los arraysList yo los llamos
		// listas
		ArrayList<String> listaStrings1 = new ArrayList<String>();
		// Si preguntamos por el tamaño de array
		System.out.println(listaStrings1.size());
		
		// Con array normales siempre tenemos que tener en cuenta
		// la posición del arrau que estamos usando
		arrayStrings1[0] = "Tom Sawyer";
		arrayStrings1[1] = "Scooby Doo";
		
		
		// Con arrayList no necesitamos controlat la ultima posición
		// usada , podemos usar el método add que añade automaticamente
		// a la ultima posición libre del array
		listaStrings1.add("Son Goku");
		listaStrings1.add("Vegeta");
		
		// Para recorrer arrays lo podemos hacer igual, pero vemos 
		// diferencias
		System.out.println("------Imprimiendo array-------");
		for(String s : arrayStrings1) {
			System.out.println(s);
		}
		System.out.println("------Imprimiendo lista------");
		for (String s : listaStrings1) {
			System.out.println(s);
		}
		
		// Accediendo a elementos concretos del array
		System.out.println(arrayStrings1[0]);
		System.out.println(listaStrings1.get(0));
		
		// Estas 2 sentencias dan Excepciones
		// System.out.println(arrayStrings1[5]);
		// System.out.println(listaStrings1.get(2));
		
		// Podemos rellenar posiciones concretas
		listaStrings1.set(1, "Broly");
		
		// Notese la diferencia de imprimir directamente un array y un arrayList
		
		System.out.println(arrayStrings1);
		System.out.println(listaStrings1);
		System.out.println(Arrays.toString(arrayStrings1));
		
		// Podemos añadir un elemento a una posición dada 
		// y desplazaría los demas
		listaStrings1.add(1,"Freezer");//[Son Goku, Freezer, Broly]
		System.out.println(listaStrings1);
		
		ArrayList<String> listaStrings2 = new ArrayList<String>();
		
		// Si queremos usar la parametrización de los arrayList no 
		// admiten primitivos
		// Pero afortunadamente java invento los tipo Wrapper de los 
		// primitivos. Dicho de otra manera todos los primitivos tienen
		// su equivalente a objeto
		
		int numero = 5;
		//Integer numeroObjeto = new Integer (5);
		// Normalmente esya el concepto de auto wrapper que hace 
		// que java convierta directamemte en un priitivo a un objeto
		Integer numeroObjeto = 5; // Esto crea un objeto con el valor 5 internamente
		
		// Los objetos de tipo Wrapper son de tipo inmutable, un objto inmutable 
		// se define como un objeto el cual no se puede cambiar NUNCA el valor 
		// de sus atributos
		numeroObjeto = 6; // Con esto lo que hacemos es crear un nuevo objeto 
						// Y cambiamos la referencia que en vez de apuntar a 5 apunta a 6
		
		// La clase String también es inmutable
		String s = "Sherlock";
		s = "Dr. Wattson";
		
		String s2 = "Sherlock";
		
		// Existen tipos Wrapper para todos los primitivos
		// que se suelen llamar igual que el primitivo pero
		// con la primera letra en Mayuscula
		double d1 = 5.5;
		Double d2 = 5.6;
		Boolean b1 = false;
		Float f1 = 5.5f;
		Character c1 = 'f';
		Byte byte1 = 23;
		
		//ArrayList<int> listaEntero = new ArrayList<>();
		
		ArrayList<Integer> listaEntero = new ArrayList<>();
		// Operador diamante desde la 1.7 y dice que no es necsario crear
		// el objeto con la parametrización automaticamente el de la referencia.
		ArrayList<Double> listaDouble = new ArrayList<Double>();

	}

}
