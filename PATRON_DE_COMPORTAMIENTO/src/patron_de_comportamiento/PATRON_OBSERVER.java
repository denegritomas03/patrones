package patron_de_comportamiento;

interface Observador {
    void actualizar(int valor);
}

class Sensor {
    private Observador observador;
    private int valor;

    public void agregarObservador(Observador o) {
        this.observador = o;
    }

    public void cambiarValor(int nuevoValor) {
        this.valor = nuevoValor;
        notificar();
    }

    private void notificar() {
        if (observador != null) {
            observador.actualizar(valor);
        }
    }
}

class Pantalla implements Observador {
    @Override
    public void actualizar(int valor) {
        System.out.println("Pantalla: el nuevo valor del sensor es " + valor);
    }
}

public class PATRON_OBSERVER {
    public static void main(String[] args) {
        Sensor sensor = new Sensor();
        Pantalla pantalla = new Pantalla();

        sensor.agregarObservador(pantalla);

        sensor.cambiarValor(10);
        sensor.cambiarValor(20);
        sensor.cambiarValor(30);
    }
}
