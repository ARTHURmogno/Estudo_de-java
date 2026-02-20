package Modelo;

import java.util.Objects;

public class Produto {

    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome não pode ser vazio nem nulo.");
        }
        if (preco <= 0) {
            throw new IllegalArgumentException("Preco não pode ser 0.");
        }
        if (estoque < 0) {
            throw new IllegalArgumentException("Estoque não pode ser menor que 0.");
        }
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; 
        if (!(o instanceof Produto)) return false;

        Produto produto = (Produto) o;

        return nome.equals(produto.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
