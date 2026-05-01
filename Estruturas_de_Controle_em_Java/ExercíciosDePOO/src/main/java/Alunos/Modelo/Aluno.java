package Alunos.Modelo;

public class Aluno {

    private int id;
    private String nome;
    private double nota;

    public Aluno(int id, String nome, double nota) {
        if (id < 10000 || id > 99999) {
            throw new IllegalArgumentException("Digité um ID com 5 dígitos. ");
        }
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome Inválido. ");
        }
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("Nota Inválida. ");
        }
        this.id = id;
        this.nome = nome;
        this.nota = nota;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("Nota Inválida. ");
        }
        this.nota = nota;
    }
    
    
}
