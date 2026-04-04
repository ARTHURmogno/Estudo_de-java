package Alunos.Serviço;

import Alunos.Modelo.Aluno;
import java.util.Map;
import java.util.HashMap;

public class SistemaAluno02 {
    Map<Integer, Aluno> alunos = new HashMap<>();

    public void adicionarAlunoPorId(Aluno aluno) {
        alunos.put(aluno.getId(), aluno);
    }
    
}
