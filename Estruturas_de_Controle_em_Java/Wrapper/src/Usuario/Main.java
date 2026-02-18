package Usuario;

public class Main {
    public static void main(String[] args) {
        Usuario p1 = new Usuario("ana", 18, 10.00, true);
        Usuario p2 = new Usuario("uu", 18, 50.0, true);

        p1.exibirStatus();

        p1.fazerCompra(5.00);
        p1.exibirStatus();




    }
    
}
