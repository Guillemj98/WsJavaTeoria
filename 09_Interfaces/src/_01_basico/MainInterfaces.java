package _01_basico;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainInterfaces {

	public static void main(String[] args) {
		// Una interfaz no se puede instanciar
		
		ClaseBasico1 cb1 = new ClaseBasico1();
		cb1.metodo1();
		String cadena = cb1.metodo3("Soy un objeto de tipo String");
		System.out.println(cadena);
		
		int resultado = cb1.operacion(3, 5);// Esto es una suma da 8
		System.out.println(resultado);
		System.out.println("===========================");
		
		ClaseBasica2 cb2 = new ClaseBasica2();
		cb2.metodo1();
		cadena = cb2.metodo3("Soy otro objeto de tipo String");
		System.out.println(cadena);
		resultado = cb2.operacion(3, 5);// 15 porque es una multi
		System.out.println(resultado);
		
		List<InterfazBasica>listainterfaces = new LinkedList<InterfazBasica>();
		listainterfaces.add(cb1);
		listainterfaces.add(cb2);
		
		int numero1 = 4;
		int numero2 = 6;
		System.out.println("========================");
		for(InterfazBasica ib1 : listainterfaces) {
			// Polimorfismo
			System.out.println(ib1.operacion(numero1, numero2));
		}
		

	}

}
