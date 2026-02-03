package Pessoa;

public class Main {
    public static void main(String[] args) {
        
        Pessoa pe1 = new Pessoa("ana", 19);
        Pessoa pe2 = new Pessoa("juju", 17);

        System.out.printf("Á primeira Pessoa criada: %s ela tem %d anos e  Maior de idade %b.%n ", pe1.getNome(), pe1.getIdade(), pe1.ehMaiorDeIdade());
        System.out.printf("Um Segundo indivíduo, Pessoa criada: %s ela tem %d anos e Maior de idade %b.  ", pe2.getNome(), pe2.getIdade(), pe2.ehMaiorDeIdade());

    }
    
}
