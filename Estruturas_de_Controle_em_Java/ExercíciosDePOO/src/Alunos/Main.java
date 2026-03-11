package Alunos;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Aluno> alunos = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        boolean estaFuncionando = true;

        while(estaFuncionando) {

            System.out.println("==================");
            System.out.println("Opções");
            System.out.println(" 1 - Cadastrar aluno: ");
            System.out.println(" 2 - Buscar aluno: ");
            System.out.println(" 3 - Listar aluno: ");
            System.out.println(" 4 - Atualizar nota: ");
            System.out.println(" 5 - Remover aluno: ");
            System.out.println(" 0 - Sair: ");

            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o ID so aluno: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Informe o nome do aluno: ");
                    String nome = sc.nextLine();

                    System.out.println("Informe  matricula do novo aluno: ");
                    double nota = sc.nextDouble();

                    Aluno novoAluno = new Aluno(id, nome, nota);

                    if (alunos.containsKey(id)) {
                        System.out.println("Aluno já existe! ");
                    } else {
                         alunos.put(id, novoAluno);
                        System.out.println("Aluno cadastrado com sucesso! ");
                    }
                    break;
                    case 2:

                        System.out.println("Informe o ID do aluno: ");
                        id = sc.nextInt();

                        Aluno aluno = alunos.get(id);

                        if (alunos.containsKey(id)) {
                            System.out.printf("nome: %s nota: %.1f Status: %\n",
                             aluno.getNome(), aluno.getNota(), aluno.status());
                        } else {
                            System.out.println("Aluno não encontrado. ");
                        }
                        break;
                        case 3:

                            for (Map.Entry<Integer, Aluno> entry : alunos.entrySet()) {
                            aluno = entry.getValue();
                            System.out.printf("ID: %d Nome: %s Nota: %.1f Status: %s\n",
                             entry.getKey(), aluno.getNome(), aluno.getNota());
                        }
                             break;
                        case 4:
                            System.out.println("Infome o ID do aluno: ");
                            id = sc.nextInt();

                            aluno = alunos.get(id);

                            if (alunos.containsKey(id)) {
                                System.out.println("Informe a nova nota: ");
                                double novaNota = sc.nextDouble();

                                aluno.setNota(novaNota);
                                System.out.println("Nota atualizada com sucesso!: ");
                            } else {
                                System.out.println("Aluno nâo encontrado. ");
                            }
                            break;
                        case 5:
                            System.out.println("Informe o ID do aluno: ");
                            id = sc.nextInt();

                            aluno = alunos.get(id);

                            if (alunos.containsKey(id)) {
                                alunos.remove(id);
                                System.out.println("Aluno removido com sucesso! ");
                            } else {
                                System.out.println("Aluno não encontrado. ");
                            }
                        case 0:
                            estaFuncionando = false;
                            System.out.println("Fim. ");
                            break;
                            default:
                                System.out.println("Opção inválida. ");
            }
        }

        sc.close();

    }
        
}
