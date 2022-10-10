import utils.Metodos;

import java.io.IOException;

public class Main {
    public static void main(String[] args){

        int lanzamientos = 5;
        int contador = 0;

        Metodos metodos = new Metodos();

        while ( contador <  5 ) {
            metodos.lanzarProceso("cmd.exe", ("/C"),"start chrome");
            contador++;
        }

    }
}
