package _02_Basico;

public class Vehiculo {
	private String marca;
	private double peso;
	private double velocidad;
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public String getFechaFabricacion() {
		return fechaFabricacion;
	}

	public void setFechaFabricacion(String fechaFabricacion) {
		this.fechaFabricacion = fechaFabricacion;
	}

	/**
	 * La fecha formato dd/mm/YYYY
	 */
	private String fechaFabricacion;
	
	/**
	 * Método que devuelve si  el vehiculo es antiguo no 
	 * Un vehiculo es antiguo cuando su año de fabricacion
	 * sea menor 2000
	 * @return true si es antiguo, en caso contrario false.
	 */
	public boolean esAntiguo(){
		String sAnio = fechaFabricacion.split("/")[2];
		int iAnio = Integer.parseInt(sAnio);
		if(iAnio < 2000) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", peso=" + peso + ", velocidad=" + velocidad + ", fechaFabricacion="
				+ fechaFabricacion + "]";
	}
	
	
}
