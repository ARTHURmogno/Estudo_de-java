import java.util.Scanner;

public class ContarLetras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe uma Palavra: ");
        String nome = scanner.next();

        int contador = 0;

        for(int i = 0; i < nome.length(); i++) {
            contador++;
        }

            if(nome.length() <= 3) {
               System.out.println("Nome Invalido: ");
            } else {
                System.out.println("Nome Valido: ");
            }
        

    }
}
    
