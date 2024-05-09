package _02_ejemplo_imprimir;

import java.util.ArrayList;
import java.util.List;

public class MainImpresion {

	public static void main(String[] args) {
		// Con una referencia de una interfaz puedo apuntar
		// cualquier objeto que implemente la interfaz
		
		// DE HECHO SE CONSIDERA UNA BUENA PRACTICA DE PROGRAMACIÓN
		// EL ORIENTAR TU CODIFO SIEMPRE QUE SE PUEDA A INTERFACES
		// ASI COMO USAR REFERENCIAS DE LA INTERFAZ.
		// Usar interfaces para apuntar a objetos hacen que las
		// dependencias de tu codigo sean dependencias debiles
		// mientras que usar la sreferencias propias del objeto
		// hacen que sean dependencias fuertes.
		
		Imprimible impPantalla = new ImprimirPantalla();
		Imprimible impFichero = new ImprimirFichero();
		Imprimible impImpresora = new ImprimirImpresora();
		
		String cadena = "Hola interfaz";
		
		List<Imprimible>listaInterfaz = new ArrayList<>();
		listaInterfaz.add(impImpresora);
		listaInterfaz.add(impPantalla);
		listaInterfaz.add(impFichero);
		for(Imprimible i : listaInterfaz) {
			i.imprimir(cadena);
		}
		// Invocamos el metodo con la interfaz
		metodoImprimir(impPantalla);
		metodoImprimir(impFichero);
		metodoImprimir(impImpresora);
	}
	// Aplicando polimorfismo
	public static void metodoImprimir(Imprimible i) {
		i.imprimir("El chivi");
	}

}
