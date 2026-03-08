package Produto;

import java.util.Map;
import java.util.HashMap;

public class Maind {
    public static void main(String[] args) {
        Map<Integer, Produto> produtos = new HashMap<>();

        Produto p1 = new Produto(111, "Mause=Gamer", 150.0);
        Produto p2 = new Produto(222, "Teclado-Mecânico", 200.0);

        Produto produto = produtos.get(p1);

        System.out.printf("Nome: %s ID do produto %d " + produto.getNome(), produto.getId()); 


    }
    
}
