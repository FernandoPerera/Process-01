package utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Metodos {
    public void lanzarProceso(String cmd, String c, String proceso, int numeroProcesos) {

        ArrayList<Process> listaProcesos = new ArrayList<Process>();

        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command(cmd, c, proceso);

        int contador = 0;

        try {
            while ( contador < numeroProcesos) {
                Process p = processBuilder.start();
                listaProcesos.add(p);
                contador++;
            }

            while (!listaProcesos.isEmpty()) {

                for (int i = 0; i < listaProcesos.size(); i++) {

                    if ( !listaProcesos.get(i).isAlive() ) {
                        listaProcesos.remove(i);
                    } else {
                        listaProcesos.get(i).isAlive();
                        listaProcesos.get(i).waitFor();
                    }
                }
            }

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
