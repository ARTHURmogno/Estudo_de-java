package AgendaTelefônica;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> agenda = new HashMap<>();

        boolean executando = true;
        int opcao = 0;

        while(executando) {

            System.out.println("===========================");
            System.out.println("  1 - Cadastrar contato: ");
            System.out.println("  2 - Buscar contato: ");
            System.out.println("  3 - Remover contato: ");
            System.out.println("  4 - Remover contato: ");
            System.out.println("  0 - Sair: ");
            System.out.println("Faça sua escolha. ");
            opcao = sc.nextInt();
            System.out.println("===========================");

            switch(opcao) {
                case 1: 
                System.out.println("Informe o nome do contato: ");
                String nome = sc.next();

                System.out.println("Informe o número: ");
                String telefoneE = sc.next();

                if (nome == null && nome.isBlank() && telefoneE == null && telefoneE.isBlank()) {
                    System.out.println("Contato Invalido. ");
                } else {
                    agenda.put(nome, telefoneE);
                }
                break;
                case 2:
                    System.out.println("Informe o nome do Contato: ");
                    nome = sc.next();

                    if (agenda.containsKey(nome)) {
                        System.out.println("Número do contato: " + agenda.get(nome));
                    } else {
                        System.out.println("Contato não encontrado ou nome inválido. ");
                    }
            }
        }
    }
    
}
