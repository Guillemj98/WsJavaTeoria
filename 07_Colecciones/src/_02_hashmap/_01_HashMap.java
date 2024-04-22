package _02_hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class _01_HashMap {
	public static void main(String[] args) {
		// Tenemos otro tipo de estructuras muy 
		// importantes que son las llamadas estructuras
		// hash, diccionario o arrys asociativos, segçun le lenguaje que
		// estemos usando.
		
		// Este tipo de estructuras se caracterizan por tener una clave 
		// y un valor asociado, es decir, a partir de una clave podemos
		// acceder o modificar un valor.
		
		// Solamente puede haber UNA clave en caso de que se pongan 2 claves 
		// iguales el valor se sobrescribe.
		
		// Para crear una estructura de tipo hash, podemos usar la clase
		// HashMap;
		HashMap<String, Double> hashMapCiudadTemperatura =
				new HashMap<>();
		// Podemos establecer claves y valores con el método PUT (clave ,valor)
		hashMapCiudadTemperatura.put("Madrid", 10.0);
		hashMapCiudadTemperatura.put("Barcelona", 11.0);
		
		// Podemos acceder a los valores con el método get().
		Double temperatura = hashMapCiudadTemperatura.get("Madrid");
		System.out.println(temperatura);
		temperatura = hashMapCiudadTemperatura.get("Barcelona");
		System.out.println(temperatura);
		// Si accedemos a una clave que no existe te devuelve NULL
		temperatura = hashMapCiudadTemperatura.get("Zaragoza");
		System.out.println(temperatura);
		
		// Las claves son caseSensitive, por lo tanto no es lo mismo
		// "Madrid" que "MADRID"
		// Double temperatura = hashMapCiudadTemperatura.get("MADRID");
		// System.out.println(temperatura);
		
		// El objetivo de los hashMap es diferente al de los arrays
		// Sirvenpara hacer busquedas rápidas NO suelen servir 
		// recorrerlos.
		
		// Si se quiere recorrer lo mejor es una funcion Lambda.
		hashMapCiudadTemperatura.forEach((k,v)->{
			System.out.println("clave " + k.toString());
			System.out.println("valor " + v.toString());
		});
		ArrayList<String> listaNombres = new ArrayList<String>();
		listaNombres.add("Piero");
		listaNombres.add("LLega");
		listaNombres.add("tarde");
		// Con funciones
		listaNombres.forEach(v -> System.out.println("Mensaje: " + v));
		
		// Si ponemos la misam clave, se sobrescribe el valor
		hashMapCiudadTemperatura.put("Madrid", 7.9);
		System.out.println(hashMapCiudadTemperatura.get("Madrid"));
		
		// Java soporta la inferencia de tipos 
		// Esta caracteristica permite definir el tipo de la variable
		// en el momento de asiganr el primer valor, pero OJO!!!
		// El tipo de variable SIEMPRE será del tipo del valor,
		// no se puede cambiar, no confundir con JS y demas 
		// lenguajes no tipados.
		var numero1 = 34.0; // El tipo de esta variable será de tipo double.
		// numero1 = true; // NO PUEDES CAMBIAR EL TIPO.
		System.out.println(numero1);
		var numero2 =100; // El tipo será de tipo Integer.
		
		
		// Los tipos inferiores solo para las variables, no se pueden 
		// usar en los atributos de clase.
		
		
		
	}

}
