package Produto.app;

import Produto.Modelo.Produto;

public class Main {
    public static void main(String[] args) {

        Produto p1 = new Produto("Mause ", 250);

        p1.aumentarPreco(50);
        p1.aplicarDesconto(10);

        System.out.println("Produto Nome: " + p1.getNome());
        System.out.println("Produto Valor: " + p1.getPreco());
        
    }
    
}
