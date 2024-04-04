#Librerias

En este ejemplo vamos a importar las librerias que hemos hcho en el proyecto 
"ED_02_Librerias

Para importar librerias en java podemos hacer los siguientes pasos:

1. Crear un proyecto y crear la carpeta "lib" en la raíz.
2. Copiar el .jar que queramos en la carpeta lib.
3. Debemos modificar el classpath del proyecto java para que se puedan usar las clases que están en el fichero ".jar". 
El classPath es fundamental en todos los proyectos java. Es un fichro donde decimos al proyecto donde tiene que ir a buscar
todod los .class para que puedan ser usados.
4. Modificamos el classpath para ello boton derecho sobre e proyecto y elegimos buildpath-> configure buildpath.
5. Vamos a la pestaña library y pulsamos classpath. Se nos deberia habiliatar el boton add jar
6. Una vez habilitado el botón lo pulsamos y buscamos el fichero ".jar" que queramos añadir a nuestro proyecto--> apply and close.
7. Ya deberiamos poder usar las librerias en nuestro proyecto, podemos crear una clase Main e importar las clases para poder usarlas.
Una vez hecho esto podemos importar este ".jar" en los proyectos que queramos, en este caso 
vamos a continuar con el proyecto "ED_03_Librerias". 