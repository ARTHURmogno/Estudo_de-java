package Exercícios.IfElse;

import java.util.Scanner;

public class ParOuImpar1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digité um Número(Par ou Impar) ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O Número é Par: " + numero);
        } else {
            System.out.println("O Número é Impar: " + numero);
        }
    }

}