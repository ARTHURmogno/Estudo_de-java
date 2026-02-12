package PessoaComCpf;

import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Set<Pessoa> nomes = new HashSet<>();

        Pessoa p1 = new Pessoa("ana", 253564324);
        Pessoa p2 = new Pessoa("ana", 253564324);
        Pessoa p3 = new Pessoa("juju", 253564318);
        Pessoa p4 = new Pessoa("ana", 253564399);

        nomes.add(p1);
        nomes.add(p2);
        nomes.add(p3);
        nomes.add(p4);

        System.out.println("Quantas Pessoa tem no Set. " + nomes.size());






    }
    
}
