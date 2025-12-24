package Usuários;

public abstract class Funcionário {

    private String nome;

    private String email;

    private int login;

    public Funcionário(String nome, String email, int login) {
        this.nome = nome;
        this.email = email;
        this.login = login;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    } 

    public int getLogin() {
        return login;
    }
    
}
