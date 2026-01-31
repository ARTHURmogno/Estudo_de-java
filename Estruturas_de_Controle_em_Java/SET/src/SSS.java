import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class SSS {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(List.of(1, 2, 2, 3, 4, 5, 5, 5, 6, 7, 7, 8));
        Set<Integer> novoSemRepetido = new HashSet<>(numeros);

        System.out.println("Números: " + novoSemRepetido);
        
    }
    
}
