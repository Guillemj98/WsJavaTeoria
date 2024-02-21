package _08_visibilidades.otroPaquete;

import _08_visibilidades.Estudiante;

public class MainVisibilidad2 {

	public static void main(String[] args) {
		Estudiante e1 = new Estudiante();
		/*e1.nombre = "Pepe";
		e1.edad = 45;
		*/
		//e1.peso = 57.67; si hiciese herencia si podria verlo
		e1.dni = "45454";

	}

}
