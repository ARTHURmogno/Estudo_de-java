import java.util.Scanner;

public class Nome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digité um Nome: ");
        String nome = scanner.next();

        System.out.println(nome.toUpperCase());
        System.out.println("Quantidade de Letras: " + nome.length());
        System.out.println(nome.charAt(0));
        System.out.println(nome.charAt(nome.length() -1 ));

    }
    
}
