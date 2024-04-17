package _01_basico;

public class MainInstituto {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		p1.nombre = "Goku";
		p1.edad = 34;
		p1.presentarse();
		
		Alumno al = new Alumno();
		al.nombre = "Felipe";
		al.edad = 21;
		al.presentarse();
		al.curso = "DAW";
		System.out.println(al.esCiencias());
		
		Docente dc = new Docente();
		dc.nombre = "Antonio";
		dc.edad = 98;
		dc.presentarse();
		dc.sueldo = 50000;
		System.out.println(dc.calcularSalarioNeto());

	}

}
