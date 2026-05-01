package Alunos.App;

import Alunos.Modelo.Aluno;
import Alunos.Servico.SistemaAluno;
import java.util.List;
import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        List<Aluno>  notas = new ArrayList<>();

        double somaNotas = 0;
        double maiorNota = 0;

        Aluno aluno1 = new Aluno(456, "Dudu", 7.0);
        Aluno aluno2 = new Aluno(345, "Duda", 8.0);
        Aluno aluno3 = new Aluno(876, "Jujú", 9.0);
        Aluno aluno4 = new Aluno(356, "Jujuba", 7.0);

        notas.add(aluno1);
        notas.add(aluno2);
        notas.add(aluno3);
        notas.add(aluno4);

        for (Aluno s : notas) {
            somaNotas += s.getNota();

            if (s.getNota() > maiorNota) {
                maiorNota = s.getNota();
            }
        }

        Aluno melhorAluno = null;

        for (Aluno x : notas) {

            if (melhorAluno == null || x.getNota() > melhorAluno.getNota()) {
                melhorAluno = x;
            }
        }


        for (Aluno a : notas) {
            if (a.getNota() >= 8) {
                System.out.printf("Nome: %s Nota: %.1f\n", a.getNome(), a.getNota());
            }
        }

        double media = somaNotas / notas.size();
        

        System.out.println("A soma dos Notas: " + somaNotas);
        System.out.printf("A Media da turma: %.1f Maior Nota: %.1f\n", media, maiorNota);
        System.out.printf("Melhor Aluno: Nome: %s Nota: %.1f\n",
         melhorAluno.getNome(), melhorAluno.getNota());
        

    }

    
    
}
