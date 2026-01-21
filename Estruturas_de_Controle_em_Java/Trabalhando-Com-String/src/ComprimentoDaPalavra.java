import java.util.Scanner;

public class ComprimentoDaPalavra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um Nome: ");
        String nome = sc.nextLine();

        System.out.println("Seu Nome Tém: " + nome.length() + " Letras. ");
        System.out.println("A primeira Letra é " + nome.charAt(0));

    }
    
}
