package EnviarMensagem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Produto produto = new Alimentação("Arroz: ", 100);

        System.out.println("Valor de Prosuto: " + produto.getValorProduto());
        System.out.println("Imposto: " + produto.ValorDoTributo());
        System.out.println("Valor Final: " + produto.valorFinal());

        
    }
}
