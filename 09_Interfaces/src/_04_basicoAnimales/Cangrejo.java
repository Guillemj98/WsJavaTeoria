package _04_basicoAnimales;

public class Cangrejo extends Pez {

	@Override
	public void moverseLento() {
		double movimiento = 10 - getPeso()*0.10;
		System.out.println("Soy un Cangrejo y me muevo " + movimiento   );

		
	}

	@Override
	public void moverseRapido() {
		double movimiento = 20 - getPeso()*0.10;
		System.out.println("Soy un Cangrejo y me muevo " + movimiento   );
		
	}
	

}
