package _08_visibilidades.relaciones;

public class MainRelaciones {
	public static void main(String[] args) {
		Persona p1 = new Persona();
		//p1.direccion = "Calle Orense 62 Madrid 28224";
		
		Persona p2 = new Persona();
		//p2.direccion = "Orense 05789 PLaza De España 78";
		
		// int cp = 0546; Esto esta en base octal, por eso mejor usar 
		// String para representar codigos postales, o cualquier numero
		// con el cual no se vaya a operar. Por eso si ponemos un 8 en 
		// numero nos da error porque en base octal no existe el 8.Los 
		// Numero que empiezan por 0 en java estan en base octal.
		
		// int hexa = 0x123ABCF;// esto esta en base hexadecimal. Los numeros 
		// que empiezan por 0x estan en base hexa.
		
		// int binario = 0b101; Los numero que empizan por 0b estan en base
		// binaria.
		
		p1.setNombre("Thor");
		//p1.direccion.ciudad = "Madrid";
		//System.out.println(p1.cuentasBancarias.length); Esto da null pointer exception.
		
		Direccion d1 = new Direccion();
		d1.setCiudad("Madrid");
		p1.setDireccion(d1);
		p1.getDireccion().setCiudad("Barcelona");
		System.out.println(d1.getCiudad());
		
		CuentaBancaria [] arrayCb1 = new CuentaBancaria[2];
		p1.setCuentasBancarias(arrayCb1); 
		System.out.println(p1.getCuentasBancarias().length);
		//System.out.println(p1.cuentasBancarias[0].iban); Esto también da null pointer exception
		CuentaBancaria cb1 = new CuentaBancaria();
		cb1.setIban("ES32456789"); 
		p1.getCuentasBancarias()[0]= cb1;
		cb1.setSaldo(5000);
		System.out.println(p1.getCuentasBancarias()[0].getSaldo());
		System.out.println(arrayCb1[0].getSaldo());
		
		cb1 = new CuentaBancaria();
		cb1.setIban("SZ56721");
		arrayCb1[1] = cb1;
		System.out.println(p1.getCuentasBancarias()[0].getIban());
		System.out.println(p1.getCuentasBancarias()[1].getIban());
		
		
		p2.setNombre("Iron Man");
		
		d1 = new Direccion();
		d1.setCiudad("New York"); 
		p2.setDireccion(d1);
		//System.out.println(p2.direccion.ciudad);
		//p1 = null; // Con esto matamos el objeto Thor entero.
		
		p2.getDireccion().setCiudad("Oklahoma");
		System.out.println(d1.getCiudad());
		
		CuentaBancaria cb2 = new CuentaBancaria();
		cb2.setIban("PT56"); 
		p2.setCuentasBancarias(new CuentaBancaria[2]);
		p2.getCuentasBancarias()[0] = cb2;
		
		cb2 = new CuentaBancaria();
		p2.getCuentasBancarias()[1]= cb2;
		cb2.setIban("IT89"); 
		System.out.println(p2.getCuentasBancarias()[1].getIban());
		
		System.out.println(p1);
		System.out.println(p2);
		
	}

}
