package PessoaComCpf;

import java.util.Objects;

public class Pessoa {

    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome não pode ser vazio nem nulo. ");
        }
        this.nome = nome.trim().toLowerCase();
        this.cpf = cpf.trim();
    }

    public String getNome() {
        return nome;
    }

    public String  getCpf() {
        return cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa)) return false;

        Pessoa pessoa = (Pessoa) o;

        return cpf.equals(pessoa.cpf);
    }

    public int hashCode() {
        return Objects.hash(cpf);
    }


    
}
