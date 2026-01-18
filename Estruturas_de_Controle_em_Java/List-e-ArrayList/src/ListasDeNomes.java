import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ListasDeNomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();

        System.out.println("Queremos 5 Nomes: ");

        for(int i = 0; i < 5; i++){
            String nome;

            while(true) {
                System.out.println("Informe um Nome. ");
                nome = scanner.nextLine();

                if (!nome.isEmpty()) {
                    break;
                }
                System.out.println("Nome Não pode ser vazio. Tente Novamente. ");
            }
            nomes.add(nome);

        }
        System.out.println("\nNomes digitados: ");
        for(String nome : nomes) {
            System.out.println(nome);
        }

        scanner.close();

    }
    
}
