import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class RecebendoValoresAté0 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int pares = 0;

        while(true) {
          System.out.println("Informe um Número. ou 0 Para Encerar o  programa. ");
         int n = sc.nextInt();

        if (n == 0) {
            break;
        }

        numeros.add(n);

        }

        int maior = numeros.get(0);

        for(int n : numeros) {
            soma += n;

            if (n > maior) {
                maior = n;
            }

            if (n % 2 == 0) {
                pares++;
            }
        }

        System.out.println("A soma dos Números é " + soma);
        System.out.println("O maior Número é " + maior);
        System.out.println("Os Números Pares: " + pares);
        System.out.println("Todos os Números. " + numeros.size());
        


    }
    
}
