package Alunos.App;

import Alunos.Modelo.Aluno;
import java.util.Scanner;
import Alunos.Serviço.SistemaAluno02;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SistemaAluno02 sistema02 = new SistemaAluno02();

        boolean ligado = true;


        while(ligado) {

        System.out.println("=================");
        System.out.println(" 1 - Melhor Aluno: ");
        System.out.println(" 2 - Adicionar Aluno: ");
        System.out.println(" 3 - Remover Aluno: ");
        System.out.println(" 4 - Buscar Aluno: ");
        System.out.println(" 5 - Listar Alunos: ");
        System.out.println(" 6 - Alterar Nota: ");
        System.out.println(" 0 - Para Sair: ");

        int opcao = sc.nextInt();
        sc.nextLine();


            switch(opcao) {
                case 1: {

                    Aluno melhor = sistema02.buscarMelhorAluno();

                    if (melhor != null) {
                    System.out.printf("Aluno: Nome: %s Nota: %.1f\n", melhor.getNome(), melhor.getNota());
                    } else {
                        System.out.println("Nenhum Aluno cadastrado ainda. ");
                    }

                }
                break;
                case 2:

                System.out.println("ID do Aluno: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.println("Nome do Aluno: ");
                String nome = sc.nextLine();

                System.out.println("Nota do Aluno: ");
                double nota = sc.nextDouble();
                sc.nextLine();


                sistema02.adicionarAlunoPorId(new Aluno(id, nome, nota));
                System.out.println("Cadastro efetuado com sucesso.");

                break;
                case 3:

                System.out.println("Id do Aluno: ");
                id = sc.nextInt();
                sc.nextLine();

                sistema02.removerAlunoPorIdRe(id);

                break;
                case 5:

                sistema02.listaTodosOsAlunos();

                break;

                case 0:
                    ligado = false;

                    System.out.println("Fim. ");
                    break;

                default: 
                System.out.println("Opção Invalida. ");

                break;
            }

        }

      }

    }