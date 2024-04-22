package _02_Basico;

public class Barco extends Vehiculo{
	private boolean esPirata;

	public boolean isEsPirata() {
		return esPirata;
	}

	public void setEsPirata(boolean esPirata) {
		this.esPirata = esPirata;
	}
	/*
	 * Como la clase barco tiene métodos especificos vamos a sobrescribir
	 * el metodo toString para que también se incluyan los atributos propios
	 * del barco.
	 */

	@Override
	public String toString() {
		return "Barco [esPirata=" + esPirata + ", getMarca()=" + getMarca() + ", getPeso()=" + getPeso()
				+ ", getVelocidad()=" + getVelocidad() + ", getFechaFabricacion()=" + getFechaFabricacion()
				+ ", esAntiguo()=" + esAntiguo() + ", toString()=" + super.toString() + "]";
	}

	
	
	
}
