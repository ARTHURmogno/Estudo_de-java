package Alunos.Serviço;

import Alunos.Modelo.Aluno;
import java.util.Map;
import java.util.HashMap;

public class SistemaAluno02 {
    Map<Integer, Aluno> alunos = new HashMap<>();

    public void adicionarAlunoPorId(Aluno aluno) {
        alunos.put(aluno.getId(), aluno);
    }

    public Aluno buscarMelhorAluno() {
        Aluno melhor = null;

        for (Aluno x : alunos.values()) {
            if (melhor == null || x.getNota() > melhor.getNota()) {
                melhor = x;
            }
        }

        return melhor;

    }

    public boolean removerAlunoPorIdRe(int id) {

        if (alunos.containsKey(id)) {
            alunos.remove(id);
            return true;
        }

        return false;

    }

    public void listaTodosOsAlunos() {

        for (Aluno a : alunos.values()) {
            if (alunos != null) {
            System.out.printf("Aluno: ID: %d Nome: %s Nota: %.1f\n", a.getId(), a.getNome(), a.getNota());
            } else {
                System.out.println("Aluno Não encontrado. ");
            }
        } 

    }

    public void mostrarAlunoPorId(int id) {

        if (alunos.containsKey(id)) {
            Aluno a = alunos.get(id);

            System.out.printf("Aluno: Id: %d Nome: %s Nota: %.1f\n", a.getId(), a.getNome(), a.getNota());
        } else {
            System.out.println("Aluno não encontrado. ");
        }

    }

    public boolean alterarNotaDoAluno(int id, double novaNota) {
        Aluno a = alunos.get(id);

        if (a != null) {
            a.setNota(novaNota);
            System.out.println("Nota alterada com Sucesso. ");
            return true;
        } else {
            System.out.println("Aluno Não existe.");
        }

        return false;

    }


    
}
