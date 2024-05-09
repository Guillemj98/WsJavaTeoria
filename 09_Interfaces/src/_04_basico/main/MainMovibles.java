package _04_basico.main;

import java.util.ArrayList;
import java.util.List;

import _04_basico.interfaz.Movible;
import _04_basicoAnimales.Animal;
import _04_basicoAnimales.Cangrejo;
import _04_basicoAnimales.Leon;
import _04_basicoAnimales.Sexo;
import _04_basicoAnimales.Tiburon;
import _04_basicoAnimales.Trucha;
import _04_basicoVehiculos.Camion;
import _04_basicoVehiculos.Coche;
import _04_basicoVehiculos.Moto;
import _04_basicoVehiculos.VehiculoTerrestre;

public class MainMovibles {

	public static void main(String[] args) {
		Animal t = new Trucha();
		t.setNombre("Robustiana");
		t.setPeso(2.2);
		t.setSexo(Sexo.NO_BINARIO);
		t.setEdad(1);
		Trucha trucha = (Trucha)t;
		trucha.setNumeroAletas(2);
		
		Cangrejo c = new Cangrejo();
		c.setNombre("Sebastian");
		c.setEdad(4);
		c.setNumeroAletas(0);
		c.setPeso(0.2);
		c.setSexo(Sexo.HERMAFRODITA);
		
		Leon l = new Leon();
		l.setNombre("Simba");
		l.setEdad(5);
		l.setPeso(180);
		l.setSexo(Sexo.MASCULINO);
		
		Tiburon tiburon = new Tiburon();
		tiburon.setNombre("Lorenzo");
		tiburon.setPeso(480);
		tiburon.setEdad(3);
		tiburon.setSexo(Sexo.FLUIDO);
		
		VehiculoTerrestre vh1 = new Camion();
		vh1.setPeso(2500);
		VehiculoTerrestre vh2 = new Coche();
		vh2.setPeso(1000);
		VehiculoTerrestre vh3 = new Moto();
		vh3.setPeso(300);
		
		List<Movible>listaMovibles = new ArrayList<>();
		listaMovibles.add(vh3);
		listaMovibles.add(vh2);
		listaMovibles.add(vh1);
		listaMovibles.add(t);
		listaMovibles.add(tiburon);
		listaMovibles.add(l);
		listaMovibles.add(c);
		
		System.out.println("Moviendo lento a los objetos movibles");
		listaMovibles.forEach(v ->v.moverseLento());
		System.out.println("Moviendo rapido los objetos moviles");
		listaMovibles.forEach(v ->v.moverseRapido());
		
		// Las Interfaces no se pueden instanciar
		// Movible m1 = new Movible();
		// Pero si podemos crear clases anonimas.
		Movible m1 = new Movible() {
			// Podemos crear atributos, pero es muy dificil
			// acceder a ellos desde fuera
			
			// Suponemos el objeto movible es un barco
			@Override
			public void moverseRapido() {
				System.out.println("Soy un barco y me muevo a 345");
				
			}
			
			@Override
			public void moverseLento() {
				System.out.println("Soy un barco y me muevo a 230");
				
			}
		};
		
		listaMovibles.add(m1);
		

	}

}

