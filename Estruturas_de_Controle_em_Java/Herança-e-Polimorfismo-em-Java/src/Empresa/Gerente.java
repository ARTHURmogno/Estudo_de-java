package Empresa;

public class Gerente extends Funcionario {

    private boolean adm = true;

    public Gerente(String nome, String email, int login, boolean adm) {
        super(nome, email, login);
        this.adm = adm;

    }

    public void realizarRelatorio(){
        System.out.println("Realizando Relatório. ");
    }

    public boolean getAdm() {
        return adm;
    }


    
}
