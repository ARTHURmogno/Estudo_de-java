package Empresa;

public class Main {
    public static void main(String[] args) {

        Funcionario gerente = new Gerente("Adair ", "adair@.com " , 987676, true );
        Funcionario vendedor = new Vendedor("vini ", "viniii@.com ", 98765, 0, false);
        Funcionario atendente = new Atendente("vivi ", "vivini@.com ", 9866, false);

        
        System.out.println(gerente);
        System.out.println(vendedor);
        System.out.println(atendente);
        


    }
    
}
