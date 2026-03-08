import java.util.Map;
import java.util.HashMap;

public class MapDeFrutas {
    public static void main(String[] args) {
        Map<String, Integer> frutas = new HashMap<>();

        //merge() contador automático.

        frutas.merge("uva", 1, Integer::sum);
        frutas.merge("batata", 1, Integer::sum);
        frutas.merge("banana", 1, Integer::sum);
        frutas.merge("uva", 1, Integer::sum);
        frutas.merge("batata", 1, Integer::sum);
        frutas.merge("uva", 1, Integer::sum);
        frutas.merge("batata", 1, Integer::sum);

        for (Map.Entry<String, Integer> entry : frutas.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        
    }
    
}
