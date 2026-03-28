package Produto.Service;

import Produto.Modelo.Produto;
import java.util.List;
import java.util.ArrayList;

public class Sistema {

    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto p) {
        produtos.add(p);
    }

    public void listaProduto() {
        for (Produto x : produtos) {
            System.out.printf("Produto Nome: %s Preco: %.1f\n", x.getNome(), x.getPreco());
        }
    }

    public Produto buscaProdutoPorNome(String nome) {

        for (Produto o : produtos) {
            if (o.getNome().equals(nome)) {
                return o;
            }
        }

        return null;

    } 

    public Produto buscaMaisCaro() {
        Produto maisCaro = null;

        for (Produto y : produtos) {
            if (maisCaro == null || y.getPreco() > maisCaro.getPreco()) {
                maisCaro = y;
            }

        }

        return maisCaro;
    }

    public void listaProdutoAcimaDe(double valor) {

        for (Produto p : produtos) {

            if (p.getPreco() > valor) {
                System.out.printf("Produto: %s Preco: %.1f\n ", p.getNome(), p.getPreco());
            }
        }
    }

    public double calcularMediaPreco() {

        if (produtos.isEmpty()) {
                return 0;
            }

        double soma = 0;

        for (Produto v : produtos) {
            soma += v.getPreco();
        }
        
        return soma / produtos.size();

    }

    public Produto buscarMaisBarrato() {

        Produto maisBarato = null;

        for (Produto n : produtos) {
            if (maisBarato == null || n.getPreco() < maisBarato.getPreco()) {
                maisBarato = n;
            }
        }

        return maisBarato;
    }

    public boolean existeProdutoCaro() {

        Produto p = buscaMaisCaro();

            if (p == null && p.getPreco() > 5000) {
                return true;
            }
            return false;
        }

    public List<Produto> listaDeProdutosCaros(double valor) {

     List<Produto> produtosCaros = new ArrayList<>();

        for (Produto h : produtos) {
            if (h.getPreco() >= valor) {
                produtosCaros.add(h);
            }
        }

        return produtosCaros;

    }

    public boolean removerProduto(String nome) {

        Produto p = buscaProdutoPorNome(nome);

        if (p != null) {
            produtos.remove(p);
            return true;
        }
        return false;

    }


    
}
