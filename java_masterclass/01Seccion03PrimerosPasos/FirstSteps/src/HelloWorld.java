// Creación de la clase

// La palabra clave public es un modificador de acceso: determina el scope del objeto, la forma en que otras partes
// del código (o incluso código de otros programadores) acceden a ese objeto (clase, método...)

// La palabra clave class determina que el objeto es una clase.


public class HelloWorld {

    // Creación del método --> colección de sentencias que realizan una operación.
    // El método main es el que JAVA busca y ejecuta para iniciar un programa.

    // La palabra clave static se explicará más adelante en el curso. De momento saber que es necesaria aquí para
    // que el código del método main se ejecute.

    // La palabra clave void indica que el método no devolverá ninguna información (no tiene return)

    // Los paréntesis detrás de main son obligatorios, pero no tienen por qué incluir ningún argumento.

    public static void main(String[] args){

        System.out.println("Hello World!!");
    }
}
