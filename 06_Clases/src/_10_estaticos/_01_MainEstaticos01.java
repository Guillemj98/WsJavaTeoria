package _10_estaticos;

public class _01_MainEstaticos01 {
	
	private int atributo1;
	private static int atributo2;

	public static void main(String[] args) {
		presentarse();
		// presentarseDinamicamente(); NO se puede invocar de esta manera
		// debemos crear el objeto
		// Lo creamos de esta manera. EL objeto es _01_MainEstaicos01
		_01_MainEstaticos01 me = new _01_MainEstaticos01();
		me.presentarseDinamicamente();
		me.atributo1 = 9;
		atributo2 = 10;
		
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		
		Persona.numeroPersona = 2;
		
		p1.edad = 45;
		p2.edad = 54;
		p1.imprimirEdadDinamicos();
		p2.imprimirEdadDinamicos();
		Persona.immprimirEdadEstatico(p1);
		Persona.immprimirEdadEstatico(p2);
		
	}
	
	public static void presentarse () {
		atributo2 = 89;
		System.out.println("Hola parate estatica");
	}
	public void presentarseDinamicamente () {
		this.atributo1 = 9;
		
		atributo2 = 23;
		_01_MainEstaticos01.atributo2 = 23;
		System.out.println("Hola parte dinamica");
	}

}
