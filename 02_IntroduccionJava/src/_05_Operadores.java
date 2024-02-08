
public class _05_Operadores {

	public static void main(String[] args) {
		/*
		 * Operadores ---------- Los operadores son símbolos especiales que por lo común
		 * se utilizan en expresiones.
		 * 
		 * Según su naturaleza pueden representar multiples objetivos.
		 * 
		 * Expresión --------- Una expresión es una combinación de variables, operadores
		 * o llamadas a métodos.
		 * 
		 * El tipo de dato del valor regresado por una expresión depende de los
		 * elementos usados en la expresión.
		 */

		// Operadores ariteméticos

		// OPeradores aritmeticos
		System.out.println(5 + 7);// Suma
		System.out.println(5 - 7);// Resta
		System.out.println(5 * 7);// Multiplicación

		// Si dividimos 2 numeros enteros, el resultado
		// sera un numero entero, es decir, sin decimales
		System.out.println(11 / 2);
		// Si en la division usamos algun numero double, entonces
		// el resultado seta un numero decimal o double
		System.out.println(11.0 / 2);
		// El simbolo % se conoce como el resto de la división, o modulo de la división
		System.out.println(10 % 2);// 0
		System.out.println(11 % 2);// 1
		System.out.println(12 % 2);// 0

		// Operadores de asignación
		// -------------------------
		// '=', se usa para asignar valores a variables
		int numero1 = 5;
		numero1 = 10;

		// Podemos usar operadores aritmeticos para cambiar el valor
		// de las variables

		// '+=', se usa para incrementar un valor a una variable
		// de manera mas rapida
		int numero2 = 10;
		// en la siguiente expresión estamos asignando un nuevo valor
		// a la variable 'numero2'. Estamos cogiendo el antiguo
		// valor de la variable 'numero2' (10) y le estamos
		// sumando el valor 5, es decir, cuando ejecutamos la
		// expresión el nuevo valor que tendra la variable 'numero2' sera '15'
		numero2 = numero2 + 5; // 5 + 10 0 15
		System.out.println(numero2);

		int numero3 = 10;
		numero3 += 5;// eto es equivalente a numero2 = numero2 + 5;

		System.out.println(numero3);

		// De igual manera podemos usar otras expresiones como
		// '-=' este se usa para decrementar una valor a una variable
		// de una manera mas rapida
		int numero4 = 10;
		numero4 -= 4; // Esto es equivalente a 'numer4 = numero4 -4'
		System.out.println(numero4);

		// '*='
		int numero5 = 10;
		numero5 *= 5; // Esto es equivalente a 'numero5 = numero5 *5'
		System.out.println(numero5);
		// '/='
		int numero6 = 10;
		numero6 /= 5; // Esto es equivalente a 'numero6 = numero6 /5'
		System.out.println(numero6);

		// '%='
		int numero7 = 10;
		numero7 %= 5; // Esto es equivalente a 'numero7 = numero7 %5'
		System.out.println(numero7);// 0

		// Operador especial de incremento en 1 unidad
		// El operador '++' incrementa la variable entera en 1
		// sería equivalente a
		int variableIncremental = 0;
		variableIncremental++; // Equivalente a 'variableIncremental=variableIncremental+1'
		System.out.println(variableIncremental);

		// Tenemos el operador especial de decremento en una unidad
		// El operador especial es '--' decremneta la variable entera en uno!
		int variableDecremental = 4;
		variableDecremental--; // Esto es igual a 'variableDecremental=variableDecremental-1'
		System.out.println(variableDecremental);

		// OJO!!! con la precendencia de operadores
		int numero8 = 0;

		System.out.println(numero8++);
		// si ponemos el '++' al final se incrementara el valor despues de imprimirlo
		// por pantalla
		System.out.println(numero8); // Imprimirá 1
		// Imprimira primero 0, pero luego incremnetara el valor en 1
		// En este punto la variable 'numero8' valdrá 1

		// OJOOOO otra vez
		// si ponemos el ++ al principio , se incrementara primero
		int numero9 = 0;
		System.out.println(++numero9);// Imprime ahora 1 en vez de 0
		System.out.println(numero9++);// Imprime 1 pero su valor sera 2,
		// pero no todavia no lo imprime
		System.out.println(numero9);// Aqui ya imprime 2

		// Operadores relacionales
		// Son operadores que comparan valores y devuelven
		// siempre un valor booleano (true,false).
		// Operador ==, compara si 2 valores son iguales
		System.out.println(5 == 5);// te pone por pantalla si es true o false
		System.out.println(5 == 7);// te devuelve false
		// Normalmente este operador no se usa con literales
		// se usa normalmente con variables
		int numero10 = 5;
		int numero11 = 8;
		System.out.println(numero10 == numero11);
		numero10 = 8;
		System.out.println(numero10 == numero11);// Ahora al cambiar la variable me devuelve true

		// Operador '<' compara si un valor es menor que otro
		System.out.println(5 < 5);// me da false obviamente
		System.out.println(5 < 4);// me da false
		System.out.println(4 < 5);// me da true
		// Normalmente se usa con variables
		System.out.println(numero10 < numero11);

		// Operador mayor,>, compara si un valor es mayor que otro
		System.out.println(5 > 5);// false
		System.out.println(5 > 4);// true

		// Operador '>=' compara si un valor si es mayor o gual que otro
		System.out.println(5 >= 5);// da true
		System.out.println(5 >= 4);// da true
		System.out.println(3 >= 6);// da false

		// Operador '<=' compara si un valor es menor o igual que otro
		System.out.println(5 <= 5);// true
		System.out.println(10 <= 11);// true
		System.out.println(numero10 <= numero11);

		// Operador '!=' compara si un valor es didtinto de otro
		System.out.println(5 != 4);
		System.out.println(numero10 != numero11);

		// Podemos utilizar generalmente otros tipos de datos
		System.out.println(false == false);
		System.out.println(true != false);
		System.out.println(34.56 <= 34.57);
		// A veces que no siempre podemos comparar entre diferentes tipos
		System.out.println(456L < 234.56);
		// System.out.println(false< 10);aqui al comparar da error porque no tiene
		// sentido

		// Operador especial de agrupación, '()'
		// Hay que tener claro que los operadores
		// tiene precedencia para ejecutarse
		// Siguen las mismas reglas que las matematicas
		System.out.println(10 + 2 * 5);// 20
		System.out.println((10 + 2) * 5);// 60

		// Operadores lógicos
		// Los operadores lógicos se usan para combinar 2 valores
		// booleanos y devolver un resultado Booleano
		// verdadero o falso

		// Operador lógico "AND" se representa con los simbolos '&&'
		// Este operador devuelve TRUE solamente cuando los 2 valores
		// booleanos que se comparan son TRUE
		// Tabla "AND"
		// 1- False y false = false
		// 2- false y true = false
		// 3- true y false = false
		// 4- true y true = true
		System.out.println(true && false); // me devuelve false
		boolean bool1 = true;
		boolean bool2 = true;
		System.out.println(bool1 && bool2);// me devuelve true

		// Operador lógico "OR" se representa con los simbolos '||'.
		// El simbolo || se suele llamar "pipe", se escribe con AltGr + 1
		// Este operador devuelve TRUE cuando alguno de los 2 valores
		// booleanos que se comparan sea TRUE
		// Tabla "OR"
		// 1- False y false = false
		// 2- false y true = true
		// 3- true y false = true
		// 4- true y true = true
		System.out.println(true || false);
		System.out.println(bool1 || bool2);// true
		bool1 = false;
		System.out.println(bool1 || bool2);// true
		bool2 = false;
		System.out.println(bool1 || bool2);// false

		// Operador lógico negación, se representa con el simbolo de "!"
		// este operador devuelve TRUE cuando el valor es FALSE y
		// devuelve FALSE cuando el valor er TRUE
		// es decir cambia el valor booleano
		System.out.println(!true);// false
		System.out.println(!false);// true
		System.out.println(!bool1);// true

		// EJEMPLOS
		// Si tenemos muchas condiciones booleanas es mejor
		// usar el operador de agrupción "()"
		System.out.println(true && false || true);// Esto da true
		System.out.println(!bool1 || bool2);// true

		// Operador especial de concatenación de cadenas
		// se representa con el simbolo "+". Notese que es el
		// mismo operador que para la suma aritmetica
		System.out.println("cadena " + "concatenda");
		// Tambien se puede usar para concatenar una cadena con
		// otra de otro tipo
		int numero12 = 5;
		int numero13 = 7;
		int resultado = numero12 + numero13;
		System.out.println("El resultado es: " + resultado);
		numero13 = 12;
		resultado = numero12 + numero13;
		System.out.println("El resultado es: " + resultado);

	}

}
