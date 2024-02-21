package _08_visibilidades;

public class MainVisibilidades {

	public static void main(String[] args) {
		Estudiante e1 = new Estudiante();
		//e1.nombre = "pepe";
		e1.edad = 45;
		e1.peso = 56.67;
		e1.dni = "454545454";
		e1.setNombre("PEPE");
		System.out.println(e1.getNombre());

	}

}
