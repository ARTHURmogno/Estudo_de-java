package Humano;

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        List<Pessoas> pessoa = new ArrayList<>();

        Pessoas p1 = new Pessoas("Duda", 19);
        Pessoas p2 = new Pessoas("Juju", 18);
        Pessoas p3 = new Pessoas("Leo", 15);

        pessoa.add(p1);
        pessoa.add(p2);
        pessoa.add(p3);

        for (Pessoas a : pessoa) {
            System.out.printf("%s %d %s\n", a.nome, a.idade, a.maiorDeIdade());
        }
        
    }
    
}
