package Usuários;

public class Gerente extends Funcionário {

    private boolean adm = true;

    public String relatorioFinanceiro;

    public Gerente(String nome, String email, int login, boolean adm) {
        super(nome,email,login);
        this.adm = adm;
    }    

    public void String setRelatorioFinanceiro(String relatorioFinanceiro) {
        
    }

    public String getRelatorioFinanceiro() {
        return relatorioFinanceiro;
    }

    public boolean getAdm() {
        return adm;
    }
}
