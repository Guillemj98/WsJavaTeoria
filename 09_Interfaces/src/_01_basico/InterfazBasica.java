package _01_basico;

/**
 * Las interfaces es un tipo especial de clase en la que todos
 * sus metodos son abstractos.
 * 
 * Están pensadas para que sean implementadas por otras clases 
 * 
 * Las interfaces definen el QUE queremos hacer, mientras que 
 * las clases que implementan las interfaces representan el 
 * COMO.
 * 
 * Las interfaces son un contrato que tienen que cumplirse en 
 * las clases que implementan dicha interfaz.
 * 
 * Cuando una clase implementa una interfaz tiene la obligacion 
 * de implementar los metodos de dicha interfaz. Una excepcion
 * seria si la clase que implementa la interface es ABSTRACTA
 * 
 * Las interfaces no son instanciables, debido a que todos sus 
 * metodos son abstractos. Pero OJOOOOO podemos crear clases
 * anonimas a partir de las interfaces.
 * 
 * Una propiedad muy importante de las interfaces es que mediante 
 * una referencia de una interfaz podemos apuntar a cualquier 
 * objeto que implemente dicha interfaz.
 * 
 * Una interfaz puede tener atributos(no suele tenerlos) pero siempre
 * serán CONSTANTES.
 * 
 * Cuando se crea una interfaz suele ser importante buena documentación  
 * de la misma.
 * 
 * Todos los metodos y atributos de una interfaz son public, no importa que 
 * lo pongais explicitamente en el metodo.
 * 
 * Para crear una interfaz en java se hace como una clase pero se usa
 * la palabra "interface". Aunque normalmente se creara mediante Eclipse.
 * 
 * 
 */
public interface InterfazBasica {
	// Esto seria un atributo constante.
	// No suelen tener atributos las interfaces.
	
	int ATRIBUTO_1 = 5;
	//public final int ATRIBUTO_1= 5;// Esto sería equivalente a lo de arriba
	
	// Lo realmente importante de la interfaces son los métodos
	// Siempre son publicos y abstractos
	void metodo1();
	// public abstract void metodo1();// Es lo mismo.
	
	int operacion(int a, int b);
	public abstract String metodo3(Object o );
	
	
	
	
	

}
