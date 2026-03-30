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

   
    }
    

