import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class ElementosÚnicos {
    public static void main(String[] args) {
        List<String> nomes = List.of("ana", "joão", "ana", "morcos", "joão");
        Set<String> nomesUnicos = new HashSet<>(nomes);


            System.out.println("Nomes Únicos: " + nomesUnicos);
        System.out.println("Quantidade de Nomes Únicos: " + nomesUnicos.size());
        
    }
    
}
