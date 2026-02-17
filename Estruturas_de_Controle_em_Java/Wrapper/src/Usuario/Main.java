package Usuario;

public class Main {
    public static void main(String[] args) {
        Usuario p1 = new Usuario("ana", 18, 200.00, true);

        System.out.printf("Usuario: nome: %s, idade: %d, saldo %f R$, Conta está Ativa: %b.  %n", 
        p1.getNome(), p1.getIdade(), p1.getSaldo(), p1.getAtivo());

        
        System.out.printf("Status do Usuario: %s ", p1.getExibirStatus());
    }
    
}
