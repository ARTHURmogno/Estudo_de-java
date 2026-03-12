package Alunos.Serviço;

import Alunos.Modelo.Aluno;
import java.util.Map;
import java.util.HashMap;

public class SistemaAluno {

    Map<Integer, Aluno> alunos = new HashMap<>();

    public void cadastraAluno(Aluno aluno) {
        if (alunos.containsKey(aluno.getId())) {
            System.out.println("Aluno já existe.");
        } else {
            System.out.println("Aluno cadastrado com sucesso.");
        }
    }

    public Aluno buscarAluno(int id) {
        return alunos.get(id);
    }

    public void listaAlunos() {
        for (Aluno a : alunos.values()) {
            System.out.printf("ID: %d nome: %s nota: %.1f Status: %s\n",
             a.getId(), a.getNome(), a.getNota(), a.status());
        }
    }

    public void atualizarNota(int id, double novaNota) {
        Aluno aluno = alunos.get(id);

        if (aluno != null) {
            aluno.setNota(novaNota);
            System.out.println("Nota atualizada.");
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    public void removerAluno(int id) {
        if (alunos.containsKey(id)) {
            alunos.remove(id);
            System.out.println("Aluno removido.");
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    public double calcularMediaTurma(double nota) {
        double media = 0;
        double resultado = 0;
        int aluno0 = 0;

    for (Aluno a : alunos.values()) {
        media += nota;
        aluno0++;
    }
    for (Aluno b : alunos.values()) {
        resultado = media / aluno0;
    }

    }
    
}
