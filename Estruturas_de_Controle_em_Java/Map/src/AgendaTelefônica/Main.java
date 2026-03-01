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
            System.out.println("  4 - Listar contatos: ");
            System.out.println("  0 - Sair: ");
            System.out.println("Faça sua escolha. ");
            System.out.println("==========================");
            opcao = sc.nextInt();

            switch(opcao) {
                case 1: 
                System.out.println("Informe o nome do contato: ");
                String nome = sc.nextLine();

                System.out.println("Informe o número: ");
                String telefoneE = sc.nextLine();

                if (nome == null && nome.isBlank() || telefoneE == null && telefoneE.isBlank()) {
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
                    break;
                    case 3:
                        System.out.println("Informe o nome do Contato: ");
                        nome = sc.next();

                        if (agenda.containsKey(nome)) {
                            System.out.println("Contato Removido Com sucesso. ");
                            agenda.remove(nome);
                        } else {
                            System.out.println("Contato não encontrado. ");
                        }
                        break;
                        case 4:
                            System.out.println("Contatos: " + agenda.size());
                            for (Map.Entry<String, String> entry : agenda.entrySet()) {
                                System.out.println(entry.getKey() + " > " + entry.getValue());
                            }
                            break;
                            case 0:
                                System.out.println("Encerrando programa... ");
                                executando = false;
                                break;

                                default: 
                                System.out.println("Opção inválida. ");


            }
        }

        sc.close();
    }
    
}
