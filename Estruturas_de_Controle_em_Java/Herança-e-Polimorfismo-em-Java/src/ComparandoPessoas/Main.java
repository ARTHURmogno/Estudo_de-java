package ComparandoPessoas;

public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("juju", 18);
        Pessoa p2 = new Pessoa("ana", 17);

        System.out.printf("Seu nome é %s vocé têm %d anos é Maior de idade: %b, Pode dirigir: %b. %n",
         p1.getNome(), p1.getIdade(), p1.ehMaiorDeIdade(), p1.ehMaiorDeIdade());
        System.out.printf("Seu nome é %s vocé têm %d anos é Maior de idade: %b, Pode dirigir: %b. %n",
         p2.getNome(), p2.getIdade(), p2.ehMaiorDeIdade(), p2.ehMaiorDeIdade());

        System.out.printf("Nomes: %s, é iguais! %s: %b", p2.getNome(), p1.getNome(), p1.temMesmoNome(p2));

    }
    
}
