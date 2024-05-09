package _04_basicoVehiculos;

public class Moto extends VehiculoTerrestre {

	@Override
	public void moverseLento() {
		double movimiento = 300 - (0.10 * this.getPeso());
		System.out.println("Soy un moto y me muevo " + movimiento   );
		
	}

	@Override
	public void moverseRapido() {
		double movimiento = 400 - (0.10 * this.getPeso());
		System.out.println("Soy un moto y me muevo " + movimiento   );
		
	}

}
