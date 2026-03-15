package Alunos.Modelo;

public class Aluno {

    private int id;
    private String nome;
    private double nota;

    public Aluno(int id, String nome, double nota) {
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
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        } else {
            System.out.println("Nota Inválida.");
        }
    }

    public String status() {
        if (nota >= 7) {
            return ("Aprovado");
        } else if (nota >= 5) {
            return("Recuperação");
        } else {
            return("Reprovado");
        }
    }
    
}
