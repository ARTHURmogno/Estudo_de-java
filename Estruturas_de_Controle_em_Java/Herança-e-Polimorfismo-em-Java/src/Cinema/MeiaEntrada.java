package Cinema;

public class MeiaEntrada extends Ingressos {

    public MeiaEntrada(String nomeDoFilme,boolean estaDublado, double valor) {
        super(nomeDoFilme, valor, estaDublado);
    }

    //@Override
    public double calcularValorFinal() {
        return valor / 2;
    }

}

