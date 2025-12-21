public class MeiaEmtrada extends Ingresso {

    public MeiaEmtrada(String nomeDoFilme,boolean estaDublado, double valor) {
        super(nomeDoFilme, valor, estaDublado);
    }

    @Override
    public double calcularValorFinal() {
        return valor / 2;
    }

}

