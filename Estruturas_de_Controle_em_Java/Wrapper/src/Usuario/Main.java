package Usuario;

public class Main {
    public static void main(String[] args) {
        Usuario p1 = new Usuario("ana", 18, 10.00, true);

        p1.exibirStatus();

        p1.fazerCompra(5.00);
        p1.exibirStatus();




    }
    
}
