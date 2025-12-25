package Exercícios.IfElse;

import java.util.Scanner;

public class PositivoOuNegativo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digité um número(Positivo ou Negativo). ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Número Negativo: ");
        } else if(numero == 0) {
            System.out.println("Número é Zero: ");
        } else {
            System.out.println("Número é Positivo: ");
        }
    }
    
}
