public abstract class Ingressos  {

    private String nomeDoFilme;

    protected double valor;

    private boolean estaDublado;


    public Ingressos(String nomeDoFilme, double valor, boolean estaDublado) {
        this.nomeDoFilme = nomeDoFilme;
        this.valor = valor;
        this.estaDublado = estaDublado;
    }

    public String nomeDoFilme() {
        return nomeDoFilme;
    }

    public boolean estaDublado() {
        return estaDublado;
    }

    public double calcularValorFinal() {
        return valor;
    }

    
}
