import java.nio.charset.StandardCharsets;
import java.io.*;
public class Main {
    
    public static void main(String[] args) {
        Configuracion conf1 = Configuracion.getInstancia();
        System.out.println(conf1.getLenguaje());

        Configuracion conf2 = Configuracion.getInstancia();
        conf2.setLenguaje("Ingles");

        System.out.println(conf1.getLenguaje());
    }
}
