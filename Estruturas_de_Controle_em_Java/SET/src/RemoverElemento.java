import java.util.Set;
import java.util.HashSet;

public class RemoverElemento {
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>(Set.of(10, 20, 30, 40));

        numeros.remove(30);

        System.out.println(numeros);
        
    }
    
}
