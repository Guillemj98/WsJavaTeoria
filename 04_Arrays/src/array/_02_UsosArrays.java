package array;

public class _02_UsosArrays {

	public static void main(String[] args) {
		// SI queremos guardar los siguientes datos de una persona
		// el nombre, apeliidos, el telefono y la dirección.
		String nombre= "Tony ";
		String apellido = "Stark";
		String numeroTelefono = "+34695695695";
		String direccion = "Edificio Avenger";
		
		// POdriamos hacerlos con arrays
		String[]capi = new String[4];
		capi[0]= "Steve";
		capi[1]= "Rogers";
		capi[2]= "+34123321123";
		capi[3]= "Queens";
		
		for (int i = 0; i < capi.length; i++) {
			System.out.println(capi[i]);
		}
		
		// Hemos podido ver que 1 de los usos es almacenar 
		// una colección de variables que podemos recorrer
		// y que tengan relación entre si
		// Nos puede servir también para ordenar información
		
		String[] blackWidow = new String[4];
		blackWidow[0]= "Natasha";
		blackWidow[1]= "Romanoff";
		blackWidow[2]= "+341212121";
		blackWidow[3]= "Rusia";
		

	}

}
