package _03_patron_fabrica;

import _02_ejemplo_imprimir.Imprimible;
import _02_ejemplo_imprimir.ImprimirFichero;
import _02_ejemplo_imprimir.ImprimirImpresora;
import _02_ejemplo_imprimir.ImprimirPantalla;

/**
 * El p<tron fabrica es muy usado en la industria y sirve 
 * como fabrica de objjetos comunes , que normalmente sigun 
 * una interface o una clase abstracta
 * 
 * El objetivo de esta clase es hacer que estos objetos
 * creen otros objetos de tipo Imprimible
 * 
 * Este sería el principio de la inyeccion de dependencias
 */
public class FabricaDeImprimibles {
	
	public Imprimible crearImprimible(String cadena) {
		Imprimible i = null;
		if(cadena.equals("pantalla")) {
			 i = new ImprimirPantalla();
			return i;
		}else if(cadena.equals("fichero")){
			i = new ImprimirFichero();
			return i;
		}else if(cadena.equals("impresora")){
			 i = new ImprimirImpresora();
			return i;
		}
		return null;
	}

}
