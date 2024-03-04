package _09_enumerados;

import java.util.Scanner;

public class MainEnumerados {

	public static void main(String[] args) {
		
		
		
		
		// Para acceder a un enumerado concreto lo haremos
		// a traves de su tipo, con u "." y luego el nombre 
		// del enumerado
		System.out.println(TipoVia.CALLE);
		System.out.println(TipoVia.AVENIDA);

		// Podemos recorrer todos los tipos como un array
		// accediendo al metodo "values"
		
		System.out.println("Accediendo recorriendo el array con un for clasico");
		for (int i = 0 ; i < TipoVia.values().length; i++) {
			System.out.println(TipoVia.values()[i]);
		}
		
		System.out.println("Accediendo recorriendo el array con un for each");
		
		for (TipoVia tv : TipoVia.values()) {
			System.out.println(tv);
		}
		
		// Podemos usar los enumeradoa para mostrarlos al usuario
		Scanner sc = new Scanner(System.in);
		System.out.println("Seleccione el tipo de via que quiere ");
		for (int i = 0 ; i < TipoVia.values().length; i++) {
			System.out.println(i + "-" + TipoVia.values()[i]);
		}
		int seleccion = sc.nextInt();
		TipoVia tv = TipoVia.values()[seleccion];
		System.out.println("Usted ha seleccionado: " + tv);
		//System.out.println(TipoVia.values()[seleccion]);
		
		// Trabajando con enumerados dentro de clases
		
		Direccion d1 = new Direccion();
		Persona p1 = new Persona();
		//p1.getDireccion().setTipoVia(TipoVia.CAÑADA_REAL);Esto daría error
		d1.setTipoVia(TipoVia.AVENIDA);
		p1.setDireccion(d1);
		System.out.println(p1);
		d1.setTipoVia(TipoVia.CAÑADA_REAL);
		System.out.println(p1);
		
	}

}
