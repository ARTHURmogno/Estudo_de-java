import java.util.Set;
import java.util.HashSet;

public class ContarPares {
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>(Set.of(2, 4, 3, 5, 10, 7, 9, 11, 33)); 

        int contador = 0;

        System.out.println("Números de elementos na lista: ");

        for (int n : numeros) {
            if (n % 2 == 0) {
                contador++;
            }

             System.out.println(n);
        }

         System.out.println("Quantidade de números que são pares:  " + contador);
       
        
    }
    
}
