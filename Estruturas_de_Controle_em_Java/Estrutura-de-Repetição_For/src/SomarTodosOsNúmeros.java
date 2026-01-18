//import java.util.Scanner;

public class SomarTodosOsNúmeros {

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        
       /*  System.out.println("Quer Saber um Número Especifico: ");
        int numero = scanner.nextInt();  
        *
        *  utilize for quando você sabe a quantidade de repetições.
        */

        int soma= 0;

        for (int i = 1; i <= 100; i++) {
            soma = soma + i;
            System.out.println("Somando todos os Números: " + soma);
        }

        System.out.println("===========================================");

        for(int linha = 6; linha <= 6; linha--) {
            for(int coluna = 2; coluna <= linha; coluna++) {
                System.out.println("*");
                 System.out.println("*");
            
            }
            System.out.println();
        }

    }
    
}



