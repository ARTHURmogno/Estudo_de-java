package Pessoa;

public class Main {
    public static void main(String[] args) {

        Endereco end1 = new  Endereco("Los Angeles", "ocean ParK Blvd", 777);

        Pessoa p1 = new Pessoa("juju",18, end1);

        System.out.printf("Pessoa: seu nome %s tem %d anos, Seu emdereco é cidade: %s rua: %s seu numero: %d ", 
        p1.getNome(), p1.getIdade(), p1.getEndereco().getCidade(), p1.getEndereco().getRua(), p1.getEndereco().getNumero());



    }
    
}
