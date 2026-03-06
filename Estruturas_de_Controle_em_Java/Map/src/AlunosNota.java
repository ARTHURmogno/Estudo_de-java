import java.util.Map;
import java.util.HashMap;

public class AlunosNota {
    public static void main(String[] args) {
        Map<String, Double> notas = new HashMap<>();

        notas.put("Ana", 8.9);
        notas.put("Carlos", 7.0);
        notas.put("Maria", 9.0);

        System.out.println("Nota de Ana: " + notas.get("ana"));

        if (notas.containsKey("Carlos")) {
            System.out.println("Carlos existe no map.");
        } else {
            System.out.println("Não existe. ");
        }

        notas.remove("Carlos");
        System.out.println("Carlos existe no Map? ");
        if (notas.containsKey("Carlos")) {
            System.out.println("Carlos existe no map. ");
        } else {
            System.out.println("Não existe, foi removido.");
        }

        for (Map.Entry<String, Double> entry : notas.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        }
    
}
