package Pessoa;

public class Main {
    public static void main(String[] args) {

        Endereco end1 = new  Endereco("Los Angeles", "ocean ParK Blvd", 777);
        Endereco end2 = new Endereco("Los Angeles", "ocean Park blvd", 45);

         Pessoa p1 = new Pessoa("juju",18, end1);
         Funcionario p2 = new Funcionario("ocean", 19, end2, 50.000);

        System.out.printf("Pessoa: seu nome %s tem %d anos, Seu emdereco é cidade: %s rua: %s seu numero: %d%n ", 
        p1.getNome(), p1.getIdade(), p1.getEndereco().getCidade(), p1.getEndereco().getRua(), p1.getEndereco().getNumero());

        System.out.printf("Pessoa: seu nome %s tem %d anos, Seu emdereco é cidade: %s rua: %s seu numero: %d , Salário %f",
            p2.getNome(), p2.getIdade(), p2.getEndereco().getCidade(), p2.getEndereco().getRua(), p2.getEndereco().getNumero(), p2.getSalario()
         );



    }
    
}
