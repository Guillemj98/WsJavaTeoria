package _04_basicoAnimales;

public class Leon extends Animal{

	@Override
	public void comer(Object o) {
		if (this == o) {
			System.out.println("No me puedo comer a mi Mismo");
			return;
		}
		if ( o instanceof Animal) {
			Animal animal = (Animal)o;
			double pesoGanado = animal.getPeso();
			this.setPeso(pesoGanado + this.getPeso());
			System.out.println("Soy el leon " + this.getNombre()+ "y me voy a comer a "
					+ "al tipo de animal" + animal.getClass().getSimpleName()
					+ "al animal que se llama" + animal.getNombre());
			
		}else {
			System.out.println("Na eso es lechuga");
			
		}
		
	}

	@Override
	public void moverseLento() {
		double movimiento = 150 - getPeso()*0.10;
		System.out.println("Soy un Leon y me muevo " + movimiento   );
		
	}

	@Override
	public void moverseRapido() {
		double movimiento = 350 - getPeso()*0.10;
		System.out.println("Soy un Leon y me muevo " + movimiento   );
		
	}
	
	

}
