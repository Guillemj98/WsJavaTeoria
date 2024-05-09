package _01_basico;

import java.util.ArrayList;
import java.util.List;

public class MainZoologico {

	public static void main(String[] args) {
		//Animal animal = new Animal();// No se puede hacer porque la clase
		// es abstracta y no se puede instanciar.
		Animal trucha = new Trucha();
		trucha.setNombre("Ciri");
		trucha.setPeso(2.2);
		trucha.setSexo(Sexo.NO_BINARIO);
		trucha.setEdad(1);
		// Normalmente cuando creamos un objeto usaremos
		// una referencia de su propio tipo, ya que si no
		// debemos de hacer un casting
		// trucha.setNumeroAletas();
		
		Trucha trucha1 = new Trucha();
		trucha1.setNumeroAletas(4);
		
		Cangrejo cangrejo = new Cangrejo();
		cangrejo.setNombre("Sebastian");
		cangrejo.setEdad(4);
		cangrejo.setNumeroAletas(0);
		cangrejo.setPeso(0.2);
		cangrejo.setSexo(Sexo.FLUIDO);
		
		Leon l = new Leon();
		l.setNombre("Simaba");
		l.setEdad(5);
		l.setPeso(200);
		l.setSexo(Sexo.MASCULINO);
		
		Tiburon t = new Tiburon();
		t.setNombre("Llados");
		t.setEdad(6);
		t.setPeso(1000);
		t.setSexo(Sexo.FEMENINO);
		
		// Siempre es mejor usar referencias de interfaces
		// para apuntar a objetos.
		List<Animal>listaAnimales = new ArrayList<Animal>();
		listaAnimales.add(trucha);
		listaAnimales.add(cangrejo);
		listaAnimales.add(l);
		listaAnimales.add(t);
		
		// Vamos a dar de comer a los animales mediante el polimorfismo
		
		Animal alimento = new Leon();
		alimento.setPeso(1);
		alimento.setNombre("Truchita");
		
		for( Animal animal : listaAnimales) {
			// aplicamos polimorfismo,, cada objeto llamara a 
			// su objeto comer
			animal.comer(alimento);
			System.out.println("Mi nuevo peso es: " + animal.getPeso());
		}
		
		Alga alga = new Alga();
		alga.setPeso(0.8);
		listaAnimales.forEach(v-> {
			v.comer(alga);
			System.out.println("Mi nuevo peso es: "  + v.getPeso());
		});	
		
		System.out.println("---------------------");
		l.comer(l);
		t.comer(t);
		
		// Clase anonimas
		// ----------------
		
		// Son aquellas clases que se instancias a partir de una clase
		// abstracta o una interfaz y se crean al mismo tiempo una 
		// clase que extiende de la clase abstracta y el objeto.
		
		// Este tipo de clases se usan solo cuando se va a crear
		// un objeto de este tipo de clase
		
		// La clase anonima se crea a partir de la abstracta
		Animal pinguino = new Animal() {
			
			// Estamos creando una clase y un objeto al mismo tiempo
			// y la clase no tiene nombre es anonima.
			@Override
			public void comer(Object o) {
				if(o instanceof Trucha) {
					System.out.println("Me como la trucha");
				}else {
					System.out.println("Solo como truchas");
				}
				
			}
			// Es una clase de usar y tirar
		};
		listaAnimales.add(pinguino);
		Alga alga1 = new Alga();
		alga.setPeso(0.8);
		listaAnimales.forEach(v-> {
			v.comer(alga);
			System.out.println("Mi nuevo peso es: "  + v.getPeso());
		});	
	}

}
