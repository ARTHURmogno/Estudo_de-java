package PessoaComCpf;

import java.util.Objects;

public class Pessoa {

    private String nome;
    private int cpf;

    public Pessoa(String nome, int cpf) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome não pode ser vazio nem nulo. ");
        }
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public int getCpf() {
        return cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pessoa pessoa = (Pessoa) o;

        return Double.compare(pessoa.cpf, cpf) == 0 &&
               nome.equals(pessoa.nome);
    }

    public int HashCode() {
        return Objects.hash(nome, cpf);
    }


    
}
