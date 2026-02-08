package ListaCom05Pessoas;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> nomesDePessoas = new ArrayList<>();

        int maior = 0;
        int nomeLongos = 0;

    nomesDePessoas.add(new Pessoa("ARTHUR", 19));
    nomesDePessoas.add(new Pessoa("Evelyn", 18));
    nomesDePessoas.add(new Pessoa("Abigail", 18));
    nomesDePessoas.add(new Pessoa("Emma", 19));
    nomesDePessoas.add(new Pessoa("Evelyn", 18));
    /**nomesDePessoas.add(new Pessoa("Ava", 18));
    nomesDePessoas.add(new Pessoa("Elizabeth", 18));
    nomesDePessoas.add(new Pessoa("Anna", 18));
    nomesDePessoas.add(new Pessoa("Stella", 18)); */

    for (Pessoa p : nomesDePessoas) {
        if (p.ehMaiorDeIdade()) {
            maior++;
        }
        if (p.getNome().length() > 5) {
            nomeLongos++;
        }
    }

    System.out.println("Total de Pessoas: " + nomesDePessoas.size());
    System.out.println("São Maior de Idade: " + maior);
    System.out.println("Nomes com Mais de 5 Letras: " + nomeLongos);






        
    }
    
}
