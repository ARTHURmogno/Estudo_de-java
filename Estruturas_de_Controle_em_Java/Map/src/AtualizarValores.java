import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class AtualizarValores {
    public static void main(String[] args) {
        Map<String, Integer> votos = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        Boolean funcionando = true;
        Integer java = 0;
        Integer python = 0;

        while(funcionando) {
        System.out.println("Escolha entre: java é python.");
        System.out.println(" 1 Java: ");
        System.out.println(" 2 Python: ");
        Integer opçao = sc.nextInt();

        switch(opçao) {
            case 1:
                if (votos.containsKey(opçao) || opçao.equals(java)) {
                    votos.put(Value(opçao) 1);
                }

        }

       
    }




    

        
    }
    
    }
    
