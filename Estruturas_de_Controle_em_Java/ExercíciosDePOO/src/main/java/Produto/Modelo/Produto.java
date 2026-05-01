package Produto.Modelo;

public class Produto {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double desconto() {
        return preco * 0.9;
    }

    public void aumentarPreco(double valor) {
        this.preco += valor;
    }

    public void aplicarDesconto(double porcentagem) {
        this.preco -= getPreco() * (porcentagem / 100);
    }
}
