import java.util.List;
import java.util.ArrayList;

public class ComaçaETerminaComVogal {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>(List.of("banana", "igreja", "final", "Abacate", "uva", "Ovo", "Estilo"));

        int contador = 0;

        for(String p : palavras) {
            char vogal = p.toLowerCase().charAt(p.length() - 1);
        }

    }
    
}
