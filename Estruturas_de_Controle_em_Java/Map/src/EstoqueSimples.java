import java.util.Map;
import java.util.HashMap;

public class EstoqueSimples {
    public static void main(String[] args) {
        Map<String, Integer> estoque = new HashMap<>();

        estoque.put("uva", 5);
        estoque.put("banana", 10);
        estoque.put("batata", 15);

        int uva = estoque.getOrDefault("uva", 0);
        int banana = estoque.getOrDefault("banana", 0);
        int batata = estoque.getOrDefault("batata", 0);
        int ovo = estoque.getOrDefault("ovo", 0);

        
        System.out.println("uva: " + uva);
        System.out.println("ovo: " + ovo);



    }
    
}
