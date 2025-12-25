package Exercícios.Switch;

import java.util.Scanner;

public class Jujú {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o seu nome: ");
        String nome = scanner.next();

        System.out.println("Qual sua idade: ");
        int idade = scanner.nextInt();

        System.out.printf("Seu nome é " + nome + " Sua idade é " + idade);

    }
    /* esté programa pede o nome e a idade do usuário */
}