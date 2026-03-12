package Alunos.App;

import Alunos.Modelo.Aluno;
import java.util.Scanner;
import Alunos.Serviço.SistemaAluno;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SistemaAluno sistema = new SistemaAluno();
;
        boolean estaFuncionando = true;

        while(estaFuncionando) {

            System.out.println("\n====Sistema de Aluno====");
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

                    System.out.println("Informe nota do aluno: ");
                    double nota = sc.nextDouble();

                    sistema.cadastraAluno(new Aluno(id, nome, nota));
                    break;
                    case 2:

                        System.out.println("Informe o ID do aluno: ");
                        id = sc.nextInt();

                        Aluno aluno = sistema.buscarAluno(id);

                        if (aluno != null) {
                            System.out.printf("nome: %s nota: %.1f Status: %s\n",
                             aluno.getNome(), aluno.getNota(), aluno.status());
                        } else {
                            System.out.println("Aluno não encontrado. ");
                        }

                        break;
                        case 3:
                            sistema.listaAlunos();

                             break;
                        case 4:
                            System.out.println("Infome o ID do aluno: ");
                            id = sc.nextInt();

                                System.out.println("Informe a nova nota: ");
                                double novaNota = sc.nextDouble();

                                sistema.atualizarNota(id, novaNota);

                            break;
                        case 5:
                            System.out.println("Informe o ID do aluno: ");
                            id = sc.nextInt();

                            sistema.removerAluno(id);
                            break;
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
