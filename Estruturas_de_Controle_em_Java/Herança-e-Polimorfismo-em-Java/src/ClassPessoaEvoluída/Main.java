package ClassPessoaEvoluída;

public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("ana ", 3);
        Pessoa p2 = new Pessoa("juju", 33);

        System.out.printf("Seu Nome é %s tém %d anos é Maior de Idade %b, ultima Letro de seu Nome %c  %n",
         p1.getNome(), p1.getIdade(), p1.ehMaiorDeIdade(), p1.ultimaLetraDoNome());
        System.out.printf("Seu Nome é %s tém %d anos é Maior de Idade %b, ",
         p2.getNome(), p2.getIdade(), p2.ehMaiorDeIdade(), p2.ultimaLetraDoNome());


    }
    
}
