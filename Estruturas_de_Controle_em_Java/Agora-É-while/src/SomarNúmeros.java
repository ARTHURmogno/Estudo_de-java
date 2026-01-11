import java.util.Scanner;

public class SomarNúmeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        while(true) {
            System.out.println("Digité o Número: 0 para Sair. ");
            numero = sc.nextInt();
            //numero += numero;

            if (numero == 0) {
                System.out.println("Fim. ");
                break;
            }
            System.out.println("O Número: " + numero);


        }

        sc.close();


    }
    
}
