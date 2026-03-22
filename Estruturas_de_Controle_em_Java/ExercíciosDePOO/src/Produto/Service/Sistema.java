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


    
}
