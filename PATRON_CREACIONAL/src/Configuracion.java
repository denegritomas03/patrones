
import java.nio.charset.StandardCharsets;
import java.io.*;


public class Configuracion {
    
    private static Configuracion instancia;
    private String lenguaje;

    private Configuracion() {
        lenguaje = "Espanol";
    }

    public static Configuracion getInstancia() {
        if (instancia == null) {
            instancia = new Configuracion();
        }
        return instancia;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }
}