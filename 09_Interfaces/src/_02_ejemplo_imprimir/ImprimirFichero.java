package _02_ejemplo_imprimir;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ImprimirFichero implements Imprimible{

	@Override
	public void imprimir(String cadena) {
		// Este metodo arroja excepciones que debemos controlar
		// Con esta clase vamos a poder escribir en un fichero de
		// texto cadenas.
		try {
			PrintWriter pw = new PrintWriter("fichero.txt");
			// El objeto tiene un metodo que nos permite escribir 
			// dentro del fichero que se llama igual que le método
			// de la clase "System.out"
			pw.println(cadena);// Llenamos el buffer con la informcion
			pw.flush();// Pasamos la informacion del buffer al fichero
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
