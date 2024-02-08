package clases;

import java.util.Date;

public class _04_Date {

	public static void main(String[] args) {
		// La manera mas básica de trabjar con fechas en java 
		// es con la clase date
		
		// La clase DATE toma como referencia de la hora la del sistema
		// Operativo, cuando instaciamos la clase Date obtendremos la 
		// hora del sistema donde estemos ejecutando el programa.
		
		// La clase DAte que normalmente usaremos la del paquete java.util
		Date fecha = new Date(); 
		System.out.println(fecha);
		
		// Internamente la clase Date lo que guarda es el número de 
		// milisegundos que han pasado desde el 01/01/1970 00:00:00
		// también llamada hora UNIX. Se guarda en una variable de 
		// tipo long
		// Podemos acceder a ella
		System.out.println(fecha.getTime());
		
		// Si queremos manejar fechas dbemos de basarnos en otras clases
		// Las clase Date tiene casi todos sus métodos OBSOLETOS (deprecated)
		// Los métodos obsoletos se mantiene para hacer retrocompatibilidad
		// entre versiones superiores de hava frente a las inferiores, pero
		// nos dicen que hay otras maneras mejores de hacer la funcionalidad
		System.out.println(fecha.getDay()); // Los dias van desde el 0 hasta el 6.
		System.out.println(fecha.getMonth());// Los meses van desde el 0 hasta el 11.
		System.out.println(fecha.getYear()); // Es el año actual menos 1900.
		
		// Hay una manera mas fácil de obtener el número de milisegundos
		System.out.println(System.currentTimeMillis());
		long tiempo = System.currentTimeMillis() - fecha.getTime();
		System.out.println("Tiempo transcurrido: " + tiempo);

	}

}
