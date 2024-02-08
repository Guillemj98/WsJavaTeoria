package _07_relaciones;

import java.util.Arrays;

public class Persona {	
	String nombre;
	Direccion direccion; // Relación 1 a 1 en BBDD
	CuentaBancaria[]cuentasBancarias; // Relación 1 a N en BBDD
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", direccion=" + direccion + ", cuentasBancarias="
				+ Arrays.toString(cuentasBancarias) + "]";
	}
	
	// String direccion;
	// Trabajar con direcciones de tipo String es complicado
	// y engorroso ya que la información de dentro no esta
	// normalizada y nos cuesta mucho extraer la infromación.
	
	

	
}
