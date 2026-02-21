package Main;

import Modelo.Carrinho;
import Modelo.Usuario;
import Modelo.Produto;

public class Main {
    public static void main(String[] args) {

        Produto p1 = new Produto("Mause Gamer", 150, 10);
        Produto p2 = new Produto("Teclado Mecânico", 300, 5);

        Usuario u1 = new Usuario("Arthur", 19, 12.000);

        Carrinho carrinho = new Carrinho();

        carrinho.adicionarProduto(p1);
        carrinho.adicionarProduto(p2);

        System.out.println("Total do Carrionho: " + carrinho.calculaTotal());


    }
    
}
