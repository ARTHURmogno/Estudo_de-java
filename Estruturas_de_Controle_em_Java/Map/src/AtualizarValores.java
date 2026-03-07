import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class AtualizarValores {
    public static void main(String[] args) {
        Map<String, Integer> votos = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        Boolean funcionando = true;

        while(funcionando) {
        System.out.println("Escolha entre: java é python.");
        System.out.println(" 1 - Java: ");
        System.out.println(" 2 - Python: ");
        System.out.println(" 3 - C#: ");
        System.out.println(" 0 - Sair. ");
        int opçao = sc.nextInt();

        switch(opçao) {
            case 1:

                if (votos.containsKey("java")) {
                    votos.put("java", votos.get("java") + 1);
                } else {
                    votos.put("java", 1);
                }
                break;
            case 2:
                if (votos.containsKey("pythin")) {
                    votos.put("python", votos.get("python") + 1);
                } else {
                    votos.put("python", 1);
                }
                break;
            case 3:
                if (votos.containsKey("c#")) {
                     votos.put("c#", votos.get("c#") + 1);
                } else {
                    votos.put("c#", 1);
                }
                break;
                case 0:
                    funcionando = false;
                    break;
                default: 
                System.out.println("Opção inválida. ");

        }

    }

    for (Map.Entry<String, Integer> entry : votos.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    sc.close();
        
    }
    
    }
    
