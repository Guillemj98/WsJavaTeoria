//Esto es un comentario en java.

// Los comentarios son explicaciones que ponemos en nuestro 
//código para aclarar ciertas partes del mismo.

//Son muy útiles para nosotros y para las futuros desarrolladores 
//que lean nuestro código.

//Los comentarios en java empiezan con "//"

//Se reecomienda que las lineas de java no sobrepasen los 80 caracteres.
/*
 * Poniendo los comentarios entre barra y asterisco "/* y  podemos poner comenarios 
 * de varias lineas sin tener que pober "//"
 */
// Para poner el parrafo es /* y fnalizo con */

//Java es un lenguaje de programación orientado a objetos por lo que tenemos que usar clases para poder arrancar nuestro programa.

//Las clases se escriben con notación upperCamelCase. Es muy importante seguir las
// convenciones de códifo en java

//Para hacer un prgrama java sea ejecutable tenemos que crear una clase y dentro de la clase tenmos que poner el método "main"

//Es un mñetodo que tiene que llmarse exactamente igual asi "public static void main(String[] args)"

//Al  crear la xse con el editor de Java podemos seleccionar la casilla
//de crear el metodo main para que nos los cree

//En casoi de que se nos olvide . Podemos escribir la palabra main y
// a continuación pulsamo ctrl + espacio y sale 

//Un programa en java empieza en la línea siguiente al método main y 
//acaba cuado salga de dicho método.

//Notese que los metodos siemopre tienen bloques asociados, 
//los bloques de un método está delimitados "{ }".

//Al final de las llave termina nuestro porgrama de Java

//Si ponemos el cursor en la primera llave nos indica el programa a que otra llave esta asociada.

//Las clases tiene que llamarse igual que el nombre del fichero donde se encuentran

//Los programas en java se ejecutan de manera secuencial
// es decir van linea a linea ejecuntando las sentencias que se van encotrando 
// una sentecia podemos definirlo, como un comando como una orden o 
// intrucción que le damos al programa

public class _01_PrincipiosFundamentales {

	public static void main(String[] args) {
		// La sentencia mas simple que podemos ejecutar en java,
		// es la de imprimir por pantalla
		// OJO!! Las sentencias en java acaban con ";" si no da error de compilación

		System.out.println("Este literal se imprimirá por pantalla cuando lo ejecutamos");
		// Notese que las sentencia de arriba imprime por pantalla y luego hace un salto
		// de linea
		// Si queremos imprimir por pantalla sin hacer salto de línea usaremos la
		// sentencia:
		System.out.print("hola");
		System.out.print("hola");
		System.out.print("hola");

		// Aqui vemos que no hace salto de linea lo imprime seguido
		// Es muy importante ser ordenado a la hora de ralizar el código
		// debemos respetar las tabulaciones lo saltos de lineas...

		// Eclipse tiene una manera de ayudar a manetener el el orden
		// siempre que el código no tenga errores
		
		//Para ello selecionamos todo el codigo que ueremos poner 
		// en orden, con el ratón o tambiénn podemos pulsar ctrl+a
		// click derecho -source-format y nos ordena el código.
		//si tiene errores esta herramienta no funciona bien 
		
		//OJO!! siempre que cambiemos algo de nuestro código debemos guardarlo para 
		// que el compilador de java se de cuenta de dichos cambios
		//para guardar usamos ctrl+s
		
		//Importane si cometemos un error al escribir el código nos dara
		// un error en tiempo de compilación, y probablemente no se permita la 
		// ejecución del programa
		
		//Ponienod el cursor sobre el aviso de error podemos sacar 
		// información del error, asi poder solucionarlo

	}// Fin del método aquí acaba nuestro programa Java
	
//Las sentencias van siempre dentro de metodos si poneis
//sentencias fueras de los metodos no van a  funcionar

}//Fin de la clase 
