import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class VerificarInterseçãoEntreDoisSets {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4);
        List<Integer> numeros02 = List.of(3, 4, 5, 6);
        Set<Integer> set01 = new HashSet<>(numeros);
        Set<Integer> set02 = new HashSet<>(numeros02);

        set01.retainAll(set02);

        System.out.println("objetos em comum de ambas ás Listas. " + set01);
        }
    
}
