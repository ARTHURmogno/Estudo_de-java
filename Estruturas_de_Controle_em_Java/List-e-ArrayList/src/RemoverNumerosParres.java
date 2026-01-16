/*
* O removeIf: Serve para Remover Elementos de uma Coleção (como de um ArrayList). 
*
*
*
 */



import java.util.List;
import java.util.ArrayList;

public class RemoverNumerosParres {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(List.of(1,4,6,4,8,14,87,5,9));
        System.out.println("Antes: " + numeros);
        numeros.removeIf(n -> n % 2 == 0);
        System.out.println("Depois: " + numeros);

        
    }
    
    
}
