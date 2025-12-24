public class IngressoFamilia extends Ingressos {

    private int quantidadeDePessoas;

    public IngressoFamilia(String nomeDoFilme, boolean estaDublado, double valor, int quantidadeDePessoas) {
        super(nomeDoFilme, valor, estaDublado);
        this.quantidadeDePessoas = quantidadeDePessoas;
    }

    //@Override
    public double calcularValorFinal() {
        double total = valor * quantidadeDePessoas;

        if (quantidadeDePessoas > 3) {
            total = total * 0.95;
        }

        return total;

    }
    
}
