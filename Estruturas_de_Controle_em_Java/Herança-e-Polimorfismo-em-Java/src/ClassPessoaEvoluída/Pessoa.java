package ClassPessoaEvoluída;

public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome não pode ser só espaços nem Vazil. ");
        }
        if (idade <= 0) {
            throw new IllegalArgumentException("Ideda Inválida.");
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

    public char ultimaLetraDoNome() {
        return nome.charAt(nome.length() - 1);
    }

    public boolean ehMaiorDeIdade() {
        return idade >= 18;
    }


    
}
