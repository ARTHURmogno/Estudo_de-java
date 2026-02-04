package Pessoa;

public class Endereco {

    private String cidade;
    private String rua;
    private int numero;

    public Endereco(String cidade, String rua, int numero) {
        this.cidade = cidade;
        this.rua = rua;
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public String getRua() {
        return rua;
    }

    public int getNumero() {
        return numero;
    }
}
