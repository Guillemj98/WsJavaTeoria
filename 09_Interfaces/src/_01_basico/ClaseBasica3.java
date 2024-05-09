package _01_basico;

/**
 * En Java no se puede realizar herencia multiple entre clases
 * pero una manera de implementar la herencia multiple en java es mediante interfaces
 * 
 * Mientras que una clase en Java SOLOOO puede extender de una sola clase,
 * puede implementar n interfaces
 * 
 * De hecho puede extender de una clase e implemenar n interfaces
 */
public class ClaseBasica3 extends Object implements InterfazBasica, InterfazBasica2  {

	@Override
	public void metodo4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void metodo5() {
		// TODO Auto-generated method stub
		
	}

	@Override
	// No hay ningun problema que haya 2 metodo iguales 
	// porque no tienen funcionalidad.
	public void metodo1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int operacion(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String metodo3(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
