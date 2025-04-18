public class Main {
    public static void main(String[] args) {
        Contador c1 = Contador.getInstancia();
        Contador c2 = Contador.getInstancia();

        c1.incrementar();
        c2.incrementar();

        c1.mostrar();  
        c2.mostrar();  
    }
}

