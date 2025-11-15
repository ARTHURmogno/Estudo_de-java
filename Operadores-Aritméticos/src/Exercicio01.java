import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um Número: ");
    int numero1 = scanner.nextInt();
    System.out.println("Digite outro Número: ");
    int numero2 = scanner.nextInt();

    int resultado = numero1 * numero2;

    System.out.println("O resultado é " + resultado);

    scanner.close();

    }
    
}
