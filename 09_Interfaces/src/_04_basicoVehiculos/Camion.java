package _04_basicoVehiculos;

public class Camion extends VehiculoTerrestre {

	@Override
	public void moverseLento() {
		double movimiento = 100 - (0.10 * this.getPeso());
		System.out.println("Soy un camion y me muevo " + movimiento   );
		
	}

	@Override
	public void moverseRapido() {
		double movimiento = 200 - (0.10 * this.getPeso());
		System.out.println("Soy un camion y me muevo " + movimiento   );
		
	}
	
}