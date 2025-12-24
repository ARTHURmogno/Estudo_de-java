package Empresa;

public class Atendente extends Funcionario {

    private boolean adm = false;

    private double valorCaixa;

    public Atendente(String nome, String email, int login, boolean adm) {
        super(nome, email, login);
        this.adm = adm;
        this.valorCaixa = valorCaixa;

    }



    public void realizaLogin() {
        System.out.println("Está realizando login. ");
    }

    public void realizandoLogoff() {
        System.out.println("está realizando logoff. ");
    }

    public void receberPagamento() {
        valorCaixa++;
    }

    public boolean getAdm() {
        return adm;
    }

    public double getValorCaixa() {
        return valorCaixa;
    }


}
