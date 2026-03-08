package Alunos;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Aluno> alunos = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        Aluno a1 = new Aluno(234, " ana ", 7.0);
        Aluno a2 = new Aluno(333, " duda ", 5.0);
        Aluno a3 = new Aluno(444, " juju ", 9.0);

        alunos.put(a1.getId(), a1);
        alunos.put(a2.getId(), a2);
        alunos.put(a3.getId(), a3);

        System.out.println("Digite o id do aluno. ");
        int alunoId = sc.nextInt();

        Aluno aluno = alunos.get(alunoId);

        if (alunos.containsKey(alunoId)) {
            System.out.printf("Nome: %s Nota: %.1f Status: %s \n",
             aluno.getNome(), aluno.getNota(), aluno.status());
        }

        sc.close();

    }
        
}
