import java.util.Scanner;

public class ContodorInteligente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroPar = 0;
        int numeroImpar = 0;
        int numerosDigitados;
        int total = 0;

        do {
             System.out.println("Digité Números: ou 0 Para Sair. ");
            numerosDigitados = sc.nextInt();
           
            if (numerosDigitados == 0) {
                break;
            } 
            total++;

            if (numerosDigitados % 2 == 0) {
                numeroPar++;
            } else {
                numeroImpar++;
            }
            
        } while(true);

         System.out.println("Números Total Digitádo: " + total);
         System.out.println("Números Pares: " + numeroPar);
         System.out.println("Números Impares: " + numeroImpar);
         System.out.println("Corrige. ");

        sc.close();

    }
    
}
