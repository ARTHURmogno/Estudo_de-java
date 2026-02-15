package Usuários;

public class Gerente extends Funcionário {

    private boolean adm = true;

    public String relatorioFinanceiro;

    public Gerente(String nome, String email, int login, boolean adm) {
        super(nome,email,login);
        this.adm = adm;
    }    

    public void setRelatorioFinanceiro(String relatorioFinanceiro) {
        System.out.println("O relatório Está Sendo Feito: ");
    }

    public String getRelatorioFinanceiro() {
        return relatorioFinanceiro;
    }

    public boolean getAdm() {
        return adm;
    }
}
