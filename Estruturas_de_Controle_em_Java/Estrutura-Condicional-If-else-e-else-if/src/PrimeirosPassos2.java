import java.util.Scanner;

public class PrimeirosPassos2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu Name! ");
        var nome = scanner.next();

        System.out.println("Informe sua idade! ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
        System.out.println("%s, você pode entrar na reunião. " + nome);
        } else {
            System.out.println("Você Não pode entrar na reunião. ");
        }

        System.out.print("Fim do programa! ");

        scanner.close();
    }
        
    }


