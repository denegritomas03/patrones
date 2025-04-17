interface EnchufeEuropeo {
    void conectar();
}

class EnchufeAmericano {
    void enchufar() {
        System.out.println("Enchufe americano conectado.");
    }
}

class AdaptadorEnchufe implements EnchufeEuropeo {
    private final EnchufeAmericano americano;

    public AdaptadorEnchufe(EnchufeAmericano americano) {
        this.americano = americano;
    }

    @Override
    public void conectar() {
        americano.enchufar();
    }
}

public class Adapter {
    public static void main(String[] args) {
        EnchufeAmericano americano = new EnchufeAmericano();
        EnchufeEuropeo adaptado = new AdaptadorEnchufe(americano);

        adaptado.conectar();
    }
}
