import java.util.Scanner;

public class SomarTodosOsNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       /*  System.out.println("Quer Saber um Número Especifico: ");
        int numero = scanner.nextInt();  */

        int soma= 0;

        for (int i = 1; i <= 100; i++) {
            soma = soma + i;
            System.out.println("Somando todos os Números: " + soma);
        }

        System.out.println("===========================================");

        for(int linha = 1; linha <= 6; linha++) {
            for(int coluna = 5; coluna >= linha; coluna++) {
                System.out.print("* ");
            
            }
            System.out.println();
        }

    }
    
}
