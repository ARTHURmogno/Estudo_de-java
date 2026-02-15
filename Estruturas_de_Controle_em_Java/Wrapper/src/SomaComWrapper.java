import java.util.Collections;
import java.util.List;

public class SomaComWrapper {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(2, 3, 40, 45, 9);

        int soma = 0;
        int maior = Collections.max(numeros);
        int menor = Collections.min(numeros);



        for (int n : numeros) {
            soma += n;

        }
        System.out.println("A soma dos Números da Lista: " + soma);
        System.out.println("Maior é: " + maior);
        System.out.println("Menor Número é: " + menor);
    }
    
}
