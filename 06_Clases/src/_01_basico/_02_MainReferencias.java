package _01_basico;

public class _02_MainReferencias {
	public static void main(String[] args) {
		Persona p1 = new Persona();
		p1.nombre = "Tony";
		p1.edad = 45;
		p1.peso = 90;
		p1.estaCasado = false;// NO haria falta porque se inicializa a false
		
		Persona p2 = new Persona();
		p2.nombre = "Natasha";
		p2.edad = 37;
		p2.peso= 65;
		p2.estaCasado = true;
		
		
		// Un objeto puede estar apuntado por muchas referencias.
		Persona p3 = p2;
		// Con el codigo de arriba estamos diciendo que p3 apunte 
		// al mismo objeto que apunta p2.
		p2.edad = 65;
		System.out.println(p3.edad);
		System.out.println(p2.edad);
		Persona p4 = new Persona();
		p4.edad = 50;
		p4.edad = 30;
		cambiarEdad2(p4);
		System.out.println(p4.edad);
		
		
	}

	private static void cambiarEdad2(Persona p) {
		p = new Persona();
		p.edad = 100;
		
	}

	
}
