public class Contador {

    private static final Contador instancia = new Contador();

    private int cuenta = 0;

    private Contador() {}

    public static Contador getInstancia() {
        return instancia;
    }

    public void incrementar() {
        cuenta++;
    }

    public void mostrar() {
        System.out.println("Cuenta: " + cuenta);
    }
}
