package Empresa;

public abstract class Funcionario {

    public String nome;

    public String email;

    public int login;


    public Funcionario(String nome, String email, int login) {
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
