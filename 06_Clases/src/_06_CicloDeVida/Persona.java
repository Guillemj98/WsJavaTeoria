package _06_CicloDeVida;

public class Persona {	
	String nombre;
	int edad;
	double peso;
	boolean estaCasado;
	
	@Override // Sobreescritura
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", estaCasado=" + estaCasado + "]";
	}
	
	
}
