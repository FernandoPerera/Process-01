package utils;

import java.io.IOException;

public class Metodos {
    public void lanzarProceso(String cmd, String c, String navegador) {
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command(cmd, c, navegador);

        try {
            Process p = processBuilder.start();
            p.waitFor();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
