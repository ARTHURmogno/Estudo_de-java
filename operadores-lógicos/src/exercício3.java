import java.util.Scanner;

public class exercício3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos anos você tem.");
        int idade = scanner.nextInt();
        System.out.println("Você Emancipado? ");
        boolean isEmancipated = scanner.nextBoolean();
        boolean canDrive = idade >= 18 || (isEmancipated && idade >= 16);
        System.out.printf("Você pose Dirigir? \n" + canDrive);
    }
}
