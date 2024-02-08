package array;

public class _03_ArraysBidimensionales {

	public static void main(String[] args) {
		// Los arrays que hemos trbajado anteriormente son también 
		// conocidos como "Unidimensionales". por ejemplo, podemos 
		// guardar el eje de las X 
		
		// existen también los arrays bidimensionales, para guardar
		// puntos en un eje de coordenadas de X e Y.
		
		int [][] ejeXY = new int [3][3];
		ejeXY[1][1]= 2;
		ejeXY[2][1]= 3;
		ejeXY[0][0]= 1;
		ejeXY[2][2]= 2;
		for(int x= 0; x<ejeXY.length;x++) {
			for(int y=0; y<ejeXY[x].length; y++) {
				System.out.println(ejeXY[x][y]);
			}
		}
		String[][]avengers= new String [3][4];
		avengers[0][0]= "Steve";
		avengers[0][1]= "Rogers";
		avengers[0][2]= "+34123321123";
		avengers[0][3]= "Queens";
		
		avengers[1][0]= "Natasha";
		avengers[1][1]= "Rimanoff";
		avengers[1][2]= "+34123321123";
		avengers[1][3]= "moscu";
		
		avengers[2][0]= "Bruce";
		avengers[2][1]= "banner";
		avengers[2][2]= "+34123321123";
		avengers[2][3]= "manhathan";
		
		for( int x= 0; x< avengers.length; x++) {
			System.out.println("---------DATOS DEL AVENGER-----" + (x+1) + " ----------");
			for(int y =0; y < avengers[x].length; y++) {
				System.out.print(avengers[x][y] + " - ");
				
			}
			System.out.println();
		}

	}

}
