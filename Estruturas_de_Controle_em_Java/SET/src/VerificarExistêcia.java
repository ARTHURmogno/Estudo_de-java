import java.util.Set;
import java.util.HashSet;

public class VerificarExistêcia {
    public static void main(String[] args) {
        Set<String> nomesP = new HashSet(Set.of("Java", "python", "c"));
        Set<String> novoSet = new HashSet<>();

        System.out.println("Comtém: 'java'. " + nomesP.contains("Java"));
        System.out.println("Comtém: 'Ruby'. " + nomesP.contains("ruby"));
        
    }
    
}
