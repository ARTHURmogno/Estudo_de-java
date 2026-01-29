import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;


public class RemovendoNúmerosDuplicados {
    public static void main(String[] args) {
        List<Integer> numerus = new ArrayList<>(List.of(1, 2, 3, 3, 4, 5, 5, 6, 7, 7, 8));
        Set<Integer> semRepetidoSet = new HashSet<>(numerus);

        Set<Integer> numeros = new HashSet<>();


        numeros.add(1);
        numeros.add(2);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(4);
        numeros.add(5);

        System.out.println("Set<> Números" + numeros);
        System.out.println("Números do ArrayList: " + numerus);
        System.out.println("Sem Repetidos do ArrayList" + semRepetidoSet);

        
    }
    
}
