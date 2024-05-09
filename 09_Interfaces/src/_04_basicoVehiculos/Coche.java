package _04_basicoVehiculos;

public class Coche extends VehiculoTerrestre {

	@Override
	public void moverseLento() {
		double movimiento = 200 - (0.10 * this.getPeso());
		System.out.println("Soy un coche y me muevo " + movimiento   );
		
	}

	@Override
	public void moverseRapido() {
		double movimiento = 300 - (0.10 * this.getPeso());
		System.out.println("Soy un coche y me muevo " + movimiento   );
		
	}
	
	

}
