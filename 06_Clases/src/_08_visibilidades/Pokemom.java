package _08_visibilidades;

// Normalmente las clases que representan identidades
// en java siguen la convención JavaBean, ya que muchas aplicaciones
// la exigen para que funcionen

// Esta convención dice:
// 1. atributos privados
// 2. métodos accesores y modificadores (setter y getter)
// 3. contructor por defecto
public class Pokemom {
	private int vida;
	private String nombre;
	private int experiencia;
	
	public Pokemom() {
		super();
	}

	public Pokemom(int vida, String nombre, int experiencia) {
		super();
		this.vida = vida;
		this.nombre = nombre;
		this.experiencia = experiencia;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		if(vida < 0) {
			this.vida = 0;
		}else {
			this.vida = vida;
			
		}
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	
	@Override
	public String toString() {
		return "Pokemom [vida=" + vida + ", nombre=" + nombre + ", experiencia=" + experiencia + "]";
	}
	

}
