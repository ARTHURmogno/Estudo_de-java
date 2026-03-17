package Alunos.App;

import Alunos.Modelo.Aluno;
import Alunos.Serviço.SistemaAluno;
import java.util.List;
import java.util.ArrayList;

public class Logica {
    public static void main(String[] args) {
        List<Aluno> test = new ArrayList<>();

        int quantidaDeAlunos = 0;

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


    }
    
}
