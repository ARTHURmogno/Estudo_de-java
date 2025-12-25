package Exercícios.IfElse;

import java.util.Scanner;

public class DescontoNaCompra2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Imforme o Valor da Venda: ");
        double venda = scanner.nextInt();

        double desconto = 0;

        if (venda >= 500) {
            desconto = 10.0;
        } else if (venda >=200 && venda <= 500) {
            desconto = 5.0;
        } else {
            desconto = 0.0;
        }

        double valorDesconto = venda * (desconto / 100.0);
        double valorFinal = venda - valorDesconto;

        System.out.println("Valor Sem Desconto: " + venda);
        System.out.println("Valor do Desconto: " + valorDesconto);
        System.out.println("Valor Com Desconto: " + valorFinal);

        scanner.close();


    }
    
}
