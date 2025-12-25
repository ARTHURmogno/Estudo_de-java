package Exercícios.IfElse;

import java.util.Scanner;

public class NotaAluno2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Imforme uma Nota: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Imforme outra Nota: ");
        double nota2 = scanner.nextDouble();

        double resultado = nota1 + nota2;

        if (resultado >= 7) {
            System.out.println("Aprovado: " + resultado);
        } else if(resultado >= 5 && resultado <= 6) {
            System.out.println("Está de Recuperação: " + resultado);
        } else {
            System.out.println("Está Reprovado: " + resultado);
        }
    }
    
}
