package Usuários;

public class Atendente extends Funcionário {

    private boolean adm = false;

    private double valorCaixa;

    public String relatorioFinanceiro;

    public Atendente(String nome, String email, int login,double valorCaixa, boolean adm) {
        super(nome,email,login);
        this.adm = adm;
        this.valorCaixa = valorCaixa;
    }

    public boolean getAdm() {
        return adm;
    }

    public double getValorCaixa() {
        return valorCaixa;
    }
    
}
