package _04_basicoVehiculos;

import java.util.Objects;

import _04_basico.interfaz.Movible;

public abstract class VehiculoTerrestre implements Movible{
	private double peso;
	private int numeroRuedas;
	private String matricula;
	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VehiculoTerrestre other = (VehiculoTerrestre) obj;
		return Objects.equals(matricula, other.matricula);
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getNumeroRuedas() {
		return numeroRuedas;
	}
	public void setNumeroRuedas(int numeroRuedas) {
		this.numeroRuedas = numeroRuedas;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	@Override
	public String toString() {
		return "Vehiculo [peso=" + peso + ", numeroRuedas=" + numeroRuedas + ", matricula=" + matricula + "]";
	}
	

}
