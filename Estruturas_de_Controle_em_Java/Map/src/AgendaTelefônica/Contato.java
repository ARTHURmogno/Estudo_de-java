package AgendaTelefônica;

public class Contato {

    private String nome;
    private String telefone;

    public Contato(String nome, String telefone) {
        if (nome == null && nome.isBlank()) {
            throw new IllegalArgumentException("Nome não pode ser vazio nem nullo. ");
        }
        if (telefone == null && telefone.isBlank()) {
            throw new IllegalArgumentException("telefone não pode ser vazio nem nullo. ");
        }
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
    
}
