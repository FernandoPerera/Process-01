import utils.Metodos;

import java.io.IOException;

public class Main {
    public static void main(String[] args){

        int lanzamientos = 5;
        int contador = 0;

        Metodos metodos = new Metodos();


        metodos.lanzarProceso("cmd.exe", ("/C"),"notepad", 5);
        contador++;


    }
}
