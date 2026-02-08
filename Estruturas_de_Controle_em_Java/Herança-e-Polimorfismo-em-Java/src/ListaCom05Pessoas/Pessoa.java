package ListaCom05Pessoas;

import java.util.List;
import java.util.ArrayList;

public class Pessoa {
    List<String> nomes = new ArrayList<>();

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio.");
        }
        if (idade <= 0) {
            throw new IllegalArgumentException("Idade Inválida.");
        }
        this.nome = nome;
        this.idade = idade;

    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public boolean ehMaiorDeIdade() {
        return idade >= 18;
    }
    


    
}
