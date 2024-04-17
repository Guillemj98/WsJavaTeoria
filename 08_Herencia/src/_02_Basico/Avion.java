package _02_Basico;

public class Avion extends Vehiculo {
	private int numeroAlas;

	public int getNumeroAlas() {
		return numeroAlas;
	}

	public void setNumeroAlas(int numeroAlas) {
		this.numeroAlas = numeroAlas;
	}

	@Override
	public boolean esAntiguo() {
		// Como el atributo es privado necesitamos acceder a el
		// mediante el "get"
		String sAnio = this.getFechaFabricacion().split("/")[2];
		int iAnio = Integer.parseInt(sAnio);
		if (iAnio < 2010) {
			return true;
		}
		return false;
	}
	public boolean puedeVolar() {
		if(this.getPeso() < 100000 && this.numeroAlas <=2) {
			return true;
		}
		return false;
	}
}
