package Modelo;

import java.util.List;
import java.util.ArrayList;

public class Carrinho {

    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public double calculaTotal() {
        double total = 0;

        for (Produto p : produtos) {
            total += p.getPreco();
        }

        return total;
    }

}
