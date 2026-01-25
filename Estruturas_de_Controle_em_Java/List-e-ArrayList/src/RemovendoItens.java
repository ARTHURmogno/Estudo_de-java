import java.util.List;
import java.util.ArrayList;

public class RemovendoItens {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(List.of(8, 9, 33, 1, 10, 44, 5, 35, 22));
        List<String> nomes = new ArrayList<>();

        nomes.add("java" );
        nomes.add("c++" );
        nomes.add("c#" );
        nomes.add("javaScript" );

        nomes.remove("java");
        nomes.removeIf(n -> n.length() > 4);

        numeros.removeIf(n -> n % 2 != 0);

        System.out.println("Após á remoção dos números inpares. " + numeros);
        System.out.println("Removendo todas ás palavras com mais de 4 letras. " + nomes);

        
    
    }
    
}
