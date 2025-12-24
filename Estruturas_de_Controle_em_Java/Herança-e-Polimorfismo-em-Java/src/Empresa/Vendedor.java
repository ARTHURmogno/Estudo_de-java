package Empresa;

public class Vendedor extends Funcionario {

    private boolean adm = false;

    private int quantidadeDeVendas;

    public Vendedor(String nome, String email, int login, int quantidadeDeVendas, boolean adm) {
        super(nome, email, login);
        this.adm = adm;
        this.quantidadeDeVendas = quantidadeDeVendas;
    }

    public void realizandoLogin() {
        System.out.println("Realizou login as 06:30. ");
    }

    public void realizoulogoff() {
        System.out.println("Realizou logoff as 15:00. ");
    }

    public void condultadnoVendas() {
        System.out.println("Está consultando Vendas. ");
    }

    public void realizandoVendas() {
        quantidadeDeVendas++;
    }

    public int getQuantidadeDeVendas() {
        return quantidadeDeVendas;
    }

    public boolean getAdm() {
        return adm;
    }




    
}
