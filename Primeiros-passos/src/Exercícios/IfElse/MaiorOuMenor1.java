package Exercícios.IfElse;

import java.util.Scanner;

public class MaiorOuMenor1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual sua idade: ");
        int idade = scanner.nextInt();


        if (idade >= 18) {
            System.out.println("Você é maior de idade: " + idade);
        } else {
            System.out.println("Você é menor de idade: " + idade);
        }

        

    }
    
}
