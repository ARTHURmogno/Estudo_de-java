package Livros;

public class Main {
    public static void main(String[] args) {

        Livro l1 = new Livro("Alice", 300);
        Livro l2 = new Livro("juju",0);


        System.out.printf("Livro: %s com %d paginas.%n ", l1.getTitulo(), l1.getPaginas());
        System.out.printf("Livro: %s com %d paginas. %n", l2.getTitulo(), l2.getPaginas());
        System.out.println("Poo" );
    }
    
}
