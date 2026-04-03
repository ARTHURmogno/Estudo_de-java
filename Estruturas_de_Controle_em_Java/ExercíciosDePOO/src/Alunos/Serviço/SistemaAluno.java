package Alunos.Serviço;

import java.util.Map;
import java.util.HashMap;
import Alunos.Modelo.Aluno;

public class SistemaAluno {
    Map<Integer, Aluno> alunos = new HashMap<>();
    

    public void adicionarAluno(Aluno aluno) {
        alunos.put(aluno.getId(), aluno);
    }

    public Aluno buscarAlunoPorId(int id) {
        return alunos.get(id);
    }

    public boolean removerAlunoPorId(int id) {

        if (alunos.containsKey(id)) {
            alunos.remove(id);
            return true;
        }

        return false;
    }

    public void listarAlunos() {

            for (Aluno a : alunos.values()) {
                System.out.printf("Aluno: ID: %d Nome: %s Nota: %.1f\n ", a.getId(), a.getNome(), a.getNota());
            }
        }

        public boolean atualizarNotaAluno(Integer Id, double novaNota) {

            if (alunos.containsKey(Id)) {
                Aluno a = alunos.get(Id);

                a.setNota(novaNota);
                return true;
            }

            return false;
        }

        public Aluno buscarMelhorAluno() {
            Aluno melhorAluno = null;

            for (Aluno x : alunos.values()) {
                if (melhorAluno == null || x.getNota() > melhorAluno.getNota()){
                    melhorAluno = x;

                }
            }

            return melhorAluno;
        }
    }

   
    

