package Alunos;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();

        Aluno a1 = new Aluno(234, " ana ", 7.0);
        Aluno a2 = new Aluno(333, " duda ", 8.0);
        Aluno a3 = new Aluno(444, " juju ", 9.0);

        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a3);

        for (Aluno a : alunos) {
            System.out.printf("Nome: %s Nota: %f \n", a.getNome(), a.getNota());
        }
        
    }
    
}
