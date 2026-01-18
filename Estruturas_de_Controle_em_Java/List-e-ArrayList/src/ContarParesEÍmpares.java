import java.util.List;
import java.util.ArrayList;

public class ContarParesEÍmpares {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(List.of(8, 4, 55, 6, 73, 5, 9, 0, 34));

        int pares = 0;
        int impares = 0;

            for(int numero : numeros) {

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            }
        
        System.out.println("Quantidade de Números Pares: " + pares);
        System.out.println("Quantidade de Números Ímpares: " + impares);

        



    }
    
}
