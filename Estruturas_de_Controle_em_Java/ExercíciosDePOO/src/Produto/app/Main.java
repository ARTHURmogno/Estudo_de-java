package Produto.app;

import Produto.Modelo.Produto;
import Produto.Service.Sistema;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sistema sistema = new Sistema();

        boolean rodando = true;

        while(rodando) {
        System.out.println("========/SistemaProduto/==========");
        System.out.println(" 1 - Adicionar produto: ");
        System.out.println(" 2 - Lista produtos: ");
        System.out.println(" 3 - Buscar produto: ");
        System.out.println(" 0 - Para Sair: ");

        int opcao = sc.nextInt();
        sc.nextLine();

        switch(opcao) {
            case 1:

            System.out.println("Informe o nome do produto: ");
            String nome = sc.nextLine();

            System.out.println("Infome o valor do produto: ");
            double preco = sc.nextDouble();
            sc.nextLine();

            sistema.adicionarProduto( new Produto(nome, preco));
            System.out.println("Produto adicionado!");

            break;
            case 2:

                sistema.listaProduto();

            break;
            case 3:

            System.out.println("Informe o nome do Produto: ");
            String nomeProduto = sc.nextLine();

            Produto p = sistema.buscaProdutoPorNome(nomeProduto);

            if (p != null) {
                System.out.printf("Produto %s Nome: %s Valor %.1f\n", p.getNome(), p.getPreco());
            } else {
                System.out.println("Produto não encontrado. ");
            }

            break;
            case 0:
                rodando = false;
                break;

            default:
                System.out.println("Opção Invalida. ");
                break;
        }

        }

       
    }

}
