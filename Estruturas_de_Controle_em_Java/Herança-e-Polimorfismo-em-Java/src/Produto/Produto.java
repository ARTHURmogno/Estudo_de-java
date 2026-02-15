package Produto;

import java.util.Objects;

public class Produto {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome não pode ser nulo nem Vazio. ");
        }
        if (preco <= 0) {
            throw new IllegalArgumentException("Preco não pode ser (0). ");
        }
        this.nome = nome.toLowerCase();
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto)) return false;

        Produto produto = (Produto) o;

        return nome.equals(produto.nome) &&
            Double.compare(produto.preco, preco) == 0;
               
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, preco);
    }
    
}
