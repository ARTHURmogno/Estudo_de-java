package EnviarMensagem;

public abstract class Produto implements ValorDoTributo {

    private String nome;

    protected double valorProduto;


    public Produto(String nome, int valorProduto) {
        this.valorProduto = valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public String getNome() {
        return nome;
    }

    public abstract double ValorDoTributo();

    public double valorFinal() {
        return valorProduto + ValorDoTributo();
    }

    
}
