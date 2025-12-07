public class Main {

    public static void main(String[] args) {
        var masculino = new Pessoa();
        masculino.setNome("léo");
        masculino.setIdade(22);
        var feminino = new Pessoa();
        feminino.setNome("juju");
        feminino.setIdade(19);

        System.out.println("feminino nome: " + feminino.getNome() + " masculino nome: " + masculino.getNome());
    }
    
}