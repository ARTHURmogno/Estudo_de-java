package Alunos.App;

import Alunos.Modelo.Aluno;
import java.util.Scanner;
import Alunos.Serviço.SistemaAluno;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SistemaAluno sistema = new SistemaAluno();

        boolean ligado = true;

        System.out.println("=================");
        System.out.println(" 1 - Melhor Aluno: ");
        System.out.println(" 2 - Adicionar Aluno: ");

        int opcao = sc.nextInt();
        sc.nextLine();

        while(ligado) {

            switch(opcao) {
                case 1: {

                    Aluno melhor = sistema.buscarMelhorAluno();
                    System.out.printf("Aluno: Nome: %s Nota: %.1f\n", melhor.getNome(), melhor.getNota());

                    break;
                }
                case 2:

                System.out.println("ID do Aluno: ");
                int id = sc.nextInt();

                System.out.println("Nome do Aluno: ");
                String nome = sc.nextLine();

                System.out.println("Nota do Aluno: ");
                double nota = sc.nextDouble();

                Aluno alunoA = new Aluno(id, nome, nota);

                sistema.adicionarAluno(id, alunoA);

                default: 
                System.out.println("Opção Invalida. ");

                break;
            }

        }

      }

    }