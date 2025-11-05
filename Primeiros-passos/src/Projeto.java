import java.util.Scanner;

public class Projeto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual seu nomé bebé: ");
        String nome = scanner.next();

        System.out.println("Informe sua idade! ");
        int idade = scanner.nextInt();

        System.out.printf("Olá %s sua idade %s é \n", nome, idade );


    }
    
}
