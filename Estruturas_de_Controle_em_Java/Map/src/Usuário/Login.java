package Usuário;

public class Login {

    private String login;
    private String senha;

    public Login(String login, String senha) {
        if (login == null || login.isBlank()) {
            throw new IllegalArgumentException("Login Inválido.");
        }
        if (senha == null || senha.isBlank()) {
            throw new IllegalArgumentException("Senha Não é Válida.");
        }
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public String validandoLogin(String login) {
        if (login != login) {
            return true;
        }
    }
    
}
