package Produto;

import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Set<Produto> produtosNovo = new HashSet<>();

        Produto p1 = new Produto("Laranja", 2.99);
        Produto p2 = new Produto("Laranja", 2.99);
        Produto p3 = new Produto("Maçã", 5.99);
        Produto p4 = new Produto("Batata", 6.99);

        produtosNovo.add(p1);
        produtosNovo.add(p2);
        produtosNovo.add(p3);
        produtosNovo.add(p4);

        for (Produto p : produtosNovo) {
            System.out.println(p.getNome());
        }
        System.out.println("Produtos disponíveis: " + produtosNovo.size());
    }
    
}
