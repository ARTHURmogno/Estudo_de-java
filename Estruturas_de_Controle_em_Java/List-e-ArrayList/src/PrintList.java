import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class PrintList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();;


        for(int i = 0; i < 5; i++) {
            System.out.println("Informe um Número. ");
            int contador = scanner.nextInt();
            numeros.add(contador);

        }

        System.out.println("\nNúmeros digitados: ");
        for(int contador : numeros) {
            System.out.println(contador);
        }

        scanner.close();
        
    }
    
}
