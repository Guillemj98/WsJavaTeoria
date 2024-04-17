package _02_Basico;

public class MainVehiculos {

	public static void main(String[] args) {
		Avion avion = new Avion();
		avion.setFechaFabricacion("23/12/2009");
		System.out.println(avion.esAntiguo());
		
		Moto mo = new Moto();
		mo.setFechaFabricacion("23/12/2009");
		System.out.println(mo.esAntiguo());
	}

}
