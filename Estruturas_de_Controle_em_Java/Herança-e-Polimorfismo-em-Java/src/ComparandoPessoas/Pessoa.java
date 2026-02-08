package ComparandoPessoas;

public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome não pode ser Vasil nem nulo.");
        }
        if (idade <= 0 ) {
            throw new IllegalArgumentException("Idade inválida");
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

    public boolean temMesmoNome(Pessoa outra) {
        if (outra == null) 
            return false;
        return this.nome.equals(outra.getNome());
    }

    public boolean ehMaiorDeIdade() {
        return idade >= 18;
    }

}
