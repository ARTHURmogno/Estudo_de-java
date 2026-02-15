import java.util.List;

public class ContandoPares {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

       for(int i = 0; i < numeros.size(); i++) {
         if (numeros.get(i) % 2 == 0) {
                System.out.println("Os Númros pares são: " + numeros.get(i));
         }
       }
    }
    
}
