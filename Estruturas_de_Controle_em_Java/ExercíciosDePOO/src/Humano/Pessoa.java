package Humano;

class Pessoas {

    String nome;
    int idade;

    public Pessoas(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    String maiorDeIdade() {
        if (idade >= 18) {
            return "Maior de Idade.";
        } else {
            return "Menor de Idade.";
        }
    }

}