package _03_protected;

public class Alumno extends Persona {
	public String curso;

	public boolean esCiencias() {
		if (curso.equals("DAM")) {
			return true;

		}
		return false;
	}

	@Override
	public void presentarse() {
		// Como el nombre es private accedemos mediante el metodo accesor o el
		// metodo modificador
		System.out.println("Hola soy el alumno muñon de nombre: " + this.getNombre());
		// Como el atributo es protected no necesitamos el metodo accesor podemos
		// acceder directamente a el
		System.out.println("Y la edad es: " + this.edad);
	}

}
