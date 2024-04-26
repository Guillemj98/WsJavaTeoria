package _05_casting;

import java.util.ArrayList;

public class MainCasting {

	public static void main(String[] args) {
		Docente d1 = new Docente();
		d1.sueldo = 2000;
		d1.setNombre("Dr. Bacterio");
		d1.setEdad(99);
		
		Alumno a1 = new Alumno();
		a1.setNombre("Felipe");
		a1.setEdad(21);
		a1.curso = "Entornos de desarrollo";
		
		Persona p1 = d1;
		//System.out.println(p1.sueldo);// Con una referencia de tipo padre no se
		// puede acceder a los metodos de sus hijas
		System.out.println(d1.sueldo);

		
		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
		listaPersonas.add(a1);
		listaPersonas.add(d1);
		listaPersonas.forEach(v -> v.presentarse());
		
		metodoRecibirLista(listaPersonas);

	}
	private static void metodoRecibirLista(ArrayList<Persona>listaPersonas) {
		// Queremos mostrar todos los datos de los objetos
		// Si queremos acceder a todos metodos y atributos de un objeto 
		// debemo usar el mando a distancia del objeto. Para ello aplicamos
		// el casting, que vimos en el TEMA 1.
		// Con el casting cambiamos una referencia de tipo.S
		Persona p1 = listaPersonas.get(0);
		Alumno a1 = (Alumno)p1;
		
		System.out.println(a1.curso);
		
		// Problema java no sabe en tiempo de ejecucion a que objeto estas
		// apuntando, por lo que queda a nuestra responsabilidad hacer el 
		// casting bien
		// En este caso java te deja en tiempo de compilacion hacer un casting
		// a una referencia de tipo docente, lo que ocurre que al ser un 
		// objeto de tipo alumno no podemos usar una referencia de tipo
		// docente para apuntar, en este caso dara un error "ClassCastException".
		//Docente d1 = (Docente)p1;
		
		// Para saber la clase de un objeto y evitar "ClassCastException"
		// podemos usar la palabra reservada "instance of"
		if(p1 instanceof Alumno) {
			//System.out.println(p1.curso);// NO
			Alumno a2 = (Alumno)p1;// Esto nunca va a dar el error
			System.out.println(a2.curso);
		}
		
		// Dicho de otra manera podemos recorrer el array preguntando de 
		// que tipo es cada objeto.
		System.out.println("Entrando en forEach");
		for(Persona p : listaPersonas) {
			// Mediante el poliformismo, podemos hacer
			p.presentarse();
			if(p instanceof Alumno) {
				Alumno a =(Alumno)p;
				System.out.println(a.curso);
			}
			if(p instanceof Docente) {
				Docente d = (Docente)p;
				System.out.println(d.sueldo);
			}
		}
		
		
		
	}

}
