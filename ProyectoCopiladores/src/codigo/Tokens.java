
// Definición del paquete en el que se encuentra el código
package codigo;

//Enumeracion que define los diferentes tipos de tokens que se pueden encontrar en un análiss léxico
public enum Tokens {
    Reservadas, //Palabras reservadas del lenguaje com "if, else, for",etc
    ParentesisAbierto, // Simbolo '(' Utilizamos para delimitar argumentos de una funcion o condicion
    ParentesisCerrado, // Simbolo ')' Utilizamos para cerrar argumentos de una funcion o condicion
    CorchetesAbierto, // Simbolo '[' Utilizamos para denotar arreglos o matrices
    CorchetesCerrado, // Simbolo ']' Utilizamos para cerrar denotaciones de arreglos o matrices 
    LlavesAbierto, // Simbolo '{' Utilizamos para delimitar bloques de codigo
    LLavesCerrado, // Simbolo '}' Utilizamos para cerrar bloques de codigo
    Igual, // Simbolo '=' Utilizamos para asignaciones de valores a variables
    Suma, // Simbolo '+' Utilizamos para sumas de valores
    Resta, // Simbolo '-' Utilizamos para restas de valores
    Multiplicacion, // Simbolo '*' Utilizamos para multiplicaciones de valores
    Division, // Simbolo '/' Utilizamos para divisiones de valores
    Identificador, // Token utilizado para identificar variables definidas por el usuario 
    Numero, // Token utilizado para identificar valores numericos
    ERROR // Token utilizado para identificar errores en el analisi lexico 
}
