import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ImprimindoComHashSetELinkedHashSetETreeSet {
    public static void main(String[] args) {
        Set<Integer> numeros01 = new LinkedHashSet<>();

        numeros01.add(50);
        numeros01.add(10);
        numeros01.add(40);
        numeros01.add(20);
        numeros01.add(60);
        numeros01.add(30);
        numeros01.add(50);
        numeros01.add(50);

        Set<Integer> numeros02 = new HashSet<>(numeros01);
        Set<Integer> numeros03 = new TreeSet<>(numeros02);

        System.out.println("Print do HashSet: " + numeros02);
        System.out.println("Print do LinkedHashSet: " + numeros01);
        System.out.println("Print do TreeSet: " + numeros03);
        

        

        


        
    }
    
}
