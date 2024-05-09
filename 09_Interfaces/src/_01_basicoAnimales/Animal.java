package _01_basicoAnimales;

import java.util.Objects;

/*
 * las clases abrastacas son clases que no se pueden instamciar.
 * Las utilizaremos para que otras clases hereden de ellas y 
 * también podremos usar sus referencias para poder guardar
 * cualquier objeto que extienda de esta clase y además para 
 * aplicar polimorfismo.
 * 
 * Una clase abtracta puede tener o no tener método abstractos
 * pero en cuanto la clase tenga un solo método abstracto, la 
 * clase debe ser abstracta
 */
public abstract class  Animal {
	private Sexo sexo;
	private double peso;
	private int edad;
	private String nombre;
	
	@Override
	public int hashCode() {
		return Objects.hash(edad, nombre, peso, sexo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return edad == other.edad && Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(peso) == Double.doubleToLongBits(other.peso) && sexo == other.sexo;
	}

	@Override
	public String toString() {
		return "Animal [sexo=" + sexo + ", peso=" + peso + ", edad=" + edad + ", nombre=" + nombre + "]";
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Los métodos abstractos son metodos que sabemos <b>QUE</b> todos
	 * los objetos que hereden de esta clase lo tendrán pero el <b>COMO</b> 
	 * lo van a hacer le corresponde a la implementación del método de la 
	 * clase hija.
	 * 
	 *  En este ejemplo sabemos que todos los animales pueden comer, 
	 *  pero todavía no sabemos <b>COMO</b> comen, por lo que corresponderá 
	 *  en las clases hijas implementar dicho método.
	 *  
	 *  <b>A partir de aquí hacemos la documentación</b>
	 *  
	 *  Este método hace que el animal gane peso según la comida que reciba
	 *  por parámetro
	 * @param o representa el objeto que se va a comer el animal. 
	 */
	public abstract void comer(Object o);
		
	// Una clase abstracta puede tener metodo No abstractos

}
