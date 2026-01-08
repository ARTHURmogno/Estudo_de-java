import java.util.Scanner;

public class PrimeiraLetraMaiúscula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe uma Letra: ");
        String palavra = scanner.next();

        String maiuscula = palavra.toUpperCase();

        System.out.println("Primeira Letra Em Maiúscula: " + maiuscula.charAt(0));
        
    }
    
}
