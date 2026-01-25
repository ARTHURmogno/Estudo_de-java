import java.util.List;
import java.util.ArrayList;

public class QuantasSãoVogais {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>(List.of("banana", "igreja", "final", "Abacate", "uva", "Ovo", "Estilo"));

        int contador = 0;
        int contador2 = 0;

        for(String p : palavras) {
            char ultimaLetra = p.toLowerCase().charAt(p.length() - 1);

            if (ultimaLetra == 'a' || ultimaLetra == 'e' || ultimaLetra == 'i' || ultimaLetra == 'o' || ultimaLetra == 'u') {
                contador++;
            }
        }

        for(String p : palavras) {
            char primeiraLetra = p.toLowerCase().charAt(0);

            if (primeiraLetra == 'a' || primeiraLetra == 'e' || primeiraLetra == 'i' || primeiraLetra == 'o' || primeiraLetra == 'u') {
                contador2++;
            }
        }

        System.out.println("Palavras que começa com vogal. " + contador2);
    

        System.out.println("Palavras que terminam com vogal. " + contador);
    }
    
}
