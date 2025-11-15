import java.util.Scanner;

public class AareaDoTerreno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qua largura do terreno: ");
        double largura = scanner.nextDouble();
        System.out.println("Qual o comprimento: ");
        double comprimento = scanner.nextDouble();

        double resultado = largura * comprimento;

        System.out.println("A Área do Quadrado é " + resultado);

        scanner.close();
    }
    
}
