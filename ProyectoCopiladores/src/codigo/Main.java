
package codigo;

import java.io.File;

//Definimos la clase principal como "Main"
public class Main {
     //Definimos el metodo principal
    public static void main(String[] args) {
        //Definimos la ruta del archivo que contiene el Lexer a generar
        String ruta ="D:/Documentos/NetBeansProjects/ProyectoCopiladores/src/codigo/Lexer.flex";
        //Llamamos al Método
        generarLexer(ruta);
    }
    //Definimos el metodo "generarLexer"
    public static void generarLexer (String ruta){
        //Definimos un objeto "File" e inicializamos con la ruta pasada como argumento
        File archivo = new File(ruta);
        //Llamamos al metodo "generate" de la clase "JFlex.Main" y le pasamos el objeto "archivo" como argumento
        JFlex.Main.generate(archivo);
    }
}
