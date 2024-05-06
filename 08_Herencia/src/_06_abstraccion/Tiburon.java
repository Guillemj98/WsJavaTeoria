package _06_abstraccion;

public class Tiburon extends Pez{

	@Override
	public void comer(Object o) {
		// Es una referencia a la clase padre
		//super.comer(o);// Invocando el metodo comer de PEZ
		if (o instanceof Pez) {
			Pez pez = (Pez)o;
			double pesoGanado = pez.getPeso()* 0.30;// Aqui si aplicamos polimorfismo
			this.setPeso(pesoGanado + this.getPeso()); 
			System.out.println("Soy el tiburon " + this.getNombre() + "y me voy a comer"
					+ pez.getNombre());
			
		}else {
			System.out.println("Soy un tiburon  solo como peces");
		}
	}
	

}
