import java.util.Scanner;

public class Exercicio00 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe Seu nome: ");
        String nome = scanner.next();

        System.out.println("Qual sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.printf(String.format("%s tem %s, você e maior de idade. /n", nome, idade));
        } else {
            System.out.println("Menor de idade. ");
        }

        System.out.println("Fim da execução.");

        scanner.close();

        
    }
        
   }   
    

