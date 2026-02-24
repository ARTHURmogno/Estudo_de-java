import java.util.Map;
import java.util.HashMap;

public class PrimeirosPassosComMap {
    public static void main(String[] args) {
        Map<String, Double> produtos = new HashMap<>();

        produtos.put("001", 19.50);
        produtos.put("002", 4.50);
        produtos.put("003", 18.00);
        produtos.put("004", 15.40);
        produtos.put("005", 19.00);

        for (Map.Entry<String, Double> entry : produtos.entrySet()) {
            System.out.println("Produto: " + entry.getKey() + " | " + "Preço: " + entry.getValue());
        }


    }


    
}
