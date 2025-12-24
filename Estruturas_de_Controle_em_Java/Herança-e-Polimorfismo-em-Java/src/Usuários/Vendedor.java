package Usuários;

public class Vendedor extends Funcionário {

    private boolean adm = false;

    private double quantidadeDeVendas;
    
    private int vendas;

    public Vendedor(String nome, String email, int login,double quantidadeDeVendas, boolean adm) {
        super(nome,email,login);
        this.adm = adm;
        this.quantidadeDeVendas = quantidadeDeVendas;
    }

    public void realizarVendas() {
        System.out.println("Venda realizada com sucesso! ");
    }

    public boolean getAdm() {
        return adm;
    }

    public double getQuantidadeDeVendas() {
        return quantidadeDeVendas;
    }




    
}
