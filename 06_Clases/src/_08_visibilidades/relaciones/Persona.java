package _08_visibilidades.relaciones;

import java.util.Arrays;

public class Persona {	
	private String nombre;
	private Direccion direccion; // Relación 1 a 1 en BBDD
	private CuentaBancaria[]cuentasBancarias; // Relación 1 a N en BBDD
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public CuentaBancaria[] getCuentasBancarias() {
		return cuentasBancarias;
	}
	public void setCuentasBancarias(CuentaBancaria[] cuentasBancarias) {
		this.cuentasBancarias = cuentasBancarias;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", direccion=" + direccion + ", cuentasBancarias="
				+ Arrays.toString(cuentasBancarias) + "]";
	}
	
	
	

	
}
