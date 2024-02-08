package array;

public class _04_ForEach {

	public static void main(String[] args) {
		// hay una manera mas sencilla de recorrer arrays sin tener
		// que usar el for normaal, que es el llamado for-each
		
		String[] blackWidow = new String[4];
		blackWidow[0]= "Natasha";
		blackWidow[1]= "Romanoff";
		blackWidow[2]= "+341212121";
		blackWidow[3]= "Rusia";
		
		// La estructura es la siguiente:
		// for(VARIABLE: ARRAY){};
		// VARIABLE: Va a contener el VALOR de cada una de las posiciones del array
		// y debe de ser del mimso tipo que el array para cada una de las iteraciones
		
		
		// Esta manera tiene ventajas e incovenientes
		// Ventajas
		// 1- Es muy sencillo de recorrer completamene un array por todas sus posiciones
		// 2- Es mas rápido de escribir
		// Desventajas
		// 1- No tenemos acceso al índice
		// 2- No podemos alterar la manera de recorrer el array. Por ejemplo acceder solamente a los pares
		
		// Pero podemos usar variables auxiliares para controlar el índice
		int posicion = 1;
		for(String s: blackWidow) {
			System.out.println(posicion + " - " + s);
			posicion++;
		}

	}

}
