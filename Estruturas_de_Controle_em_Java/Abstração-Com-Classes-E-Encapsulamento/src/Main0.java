import java.util.Scanner;

public class Main0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto0 produto0 = new Produto0();

        System.out.println("Nome do Produto: ");
        produto0.setNome(sc.nextLine());

        System.out.println("Preco do Produto: ");
        produto0.setPreco(sc.nextDouble());

        System.out.println("O Nome do produto: " + produto0.getNome());
        System.out.println(" Preco do Produto: " + produto0.getPreco());

        sc.close();
    
    }
    
}
