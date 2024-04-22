package _03_protected;

public class Docente extends Persona {
	
	// Automaticamente la clase alumno tiene todos los atributos
	// de la clase Persona que son la edad y el nombre, y asi como
	// sus métodos, el cual es presentarse().
		
	public double sueldo;
	public double calcularSalarioNeto() {
		double salarioNeto = sueldo * 0.15;
		double salarioTotal = sueldo - salarioNeto;
		return salarioTotal;
	}
}
