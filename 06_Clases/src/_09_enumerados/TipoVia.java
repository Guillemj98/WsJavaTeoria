package _09_enumerados;

// Los enumerados son un tipo especial de clase ne la cual 
// todos sus objetos están predefinidos al arrancar el programa.
// Es la unica manera oficial en java de hacer los objetos 
// nominativos ( que tienen nombre ).
// NO se pueden crear mas objetos que los que predefinamos
// Es decir no podemos hacer NEW con los enumerados.
// En tiempo de ejecución.

// los objetos se definen aqui justo dentro de la clase y se 
// debe usar la notación UPPER_SNEAK_CASE.
// Los objetos irán separados por comas (,).

// Estos objetos estan numerados dentro de un array
public enum TipoVia {
	CALLE, AVENIDA, PLAZA, CAÑADA_REAL, PASEO
	// Calle sera la posición 0 del array
	// Avenida sera la posición 1
	// Plaza sera la posición 2
	// Cañada real sera la posicion 3

}
