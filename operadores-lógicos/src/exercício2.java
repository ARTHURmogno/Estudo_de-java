import java.util.Scanner;

public class exercício2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanto é 2 + 2: ");
        int resultado = scanner.nextInt();
        boolean iswrong = resultado != 4;
        System.out.printf("O resultado é 4, Você acertou (%s) \n" + !iswrong);
    }
    
}
