import java.util.HashMap;
import java.util.Map;

public class EstudoDeMap {
    public static void main(String[] args) {
        Map<String, Integer> produtos = new HashMap<>();
        
        //Adicionando
        produtos.put("uva", 20);
        produtos.put("banana", 30);
        produtos.put("ovo", 15);

        //Buscando valor
        System.out.println("Valor da uva: " + produtos.get("uva"));

        //verificar se existe
        if (produtos.containsKey("banana")) {
            System.out.println("Banana existe no map. ");
        }

        //remover
        produtos.remove("ovo");

        if (produtos.containsKey("ovo")) {
            System.out.println("Banana existe no map. ");
        } else {
            System.out.println("Ovo, Não existe no map. ");
        }

        for (Map.Entry<String, Integer> entry : produtos.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
    
}
