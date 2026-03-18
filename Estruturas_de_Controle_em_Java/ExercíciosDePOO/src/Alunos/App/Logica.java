package Alunos.App;

import Alunos.Modelo.Aluno;
import Alunos.Serviço.SistemaAluno;
import java.util.List;
import java.util.ArrayList;

public class Logica {
    public static void main(String[] args) {
        List<Aluno> test = new ArrayList<>();
        List<Aluno> aprovado = new ArrayList<>();

        int quantidaDeAlunos = 0;
        double somaNotas = 0;
        double mediaNotas = 0;
        int maiorQ7 = 0;
        int menorQ7 = 0;


        Aluno a1 = new Aluno(456, "Duda", 8.0);
        Aluno a2 = new Aluno(567, "Jujú", 7.0);
        Aluno a3 = new Aluno(395, "Ana", 9.0);
        Aluno a4 = new Aluno(284, "FF", 10.0);
        Aluno a5 = new Aluno(234, "Leu", 6.0);

        test.add(a1);
        test.add(a2);
        test.add(a3);
        test.add(a4);
        test.add(a5);

        for (Aluno a : test) {
            System.out.printf("Nome: %s Notas: %.1f\n", a.getNome(), a.getNota());
            quantidaDeAlunos++;
        }

        System.out.println("========================");

        for (Aluno x : test) {
            if (x.getNota() > 7) {
                System.out.printf("Notas Maior que 7.0: Nome: %s Nota: %.1f\n", x.getNome(), x.getNota());
            }
        }

        System.out.println("========================");

        System.out.println("Quantidade de Alunos: " + quantidaDeAlunos);

        System.out.println("Nivel 2 - Números: ");

            for (Aluno y : test) {
                if (y.getNota() != somaNotas) {
                    somaNotas += y.getNota();
                }
            }

            for (Aluno v : test) {
                if (v.getNota() > 7) {
                    maiorQ7++;
                }
            }

            for (Aluno q : test) {
                if (q.getNota() < 7) {
                    menorQ7++;
                }
            }

            Aluno menorNota = test.get(0);
            Aluno maiorNota = test.get(0);

            for (Aluno m : test) {

                if (m.getNota() > maiorNota.getNota()) {
                    maiorNota = m;
                }
                if (m.getNota() < menorNota.getNota()) {
                    menorNota = m;
                }
            }


            Aluno melhorAluno = null;
            Aluno piorAluno = null;

            for (Aluno r : test) {
                
                if (melhorAluno == null || r.getNota() > melhorAluno.getNota()) {
                    melhorAluno = r;
                }

                if (piorAluno == null || r.getNota() < piorAluno.getNota()) {
                    piorAluno = r;
                }
            }

            System.out.println("========================");

            for (Aluno w : test) {
                if (w.getNota() >= 7) {
                    aprovado.add(w);
                    System.out.printf("Aluno: %s Aprovado:\n ", w.getNome());
                } else {
                    System.out.printf("Aluno: %s Reprovado:\n ", w.getNome());
                }
            }

            

            mediaNotas = somaNotas / test.size();


            System.out.printf("Soma das Notas: %.1f Media da turma: %.1f Notas Maior Que 7: %d Notas menores Que 7: %d\n",
             somaNotas, mediaNotas, maiorQ7, menorQ7);

            System.out.printf("A Maior Nota: %.1f Menor Nota: %.1f\n", maiorNota.getNota(), menorNota.getNota());
            System.out.printf("Melhor Aluno: %.1f Pior Aluno: %.1f\n", melhorAluno.getNota(), piorAluno.getNota());

            for (Aluno i : aprovado) {
                System.out.println("Lista De Alunos Aprovados: " + i.getNome());

                if (i.getNota() == 10) {
                    System.out.println("Aluno com Nota 10: " + i.getNome());
                }
            }




    }
    
}
