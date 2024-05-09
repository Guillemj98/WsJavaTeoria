package _01_basicoAnimales;

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
	
	

}
