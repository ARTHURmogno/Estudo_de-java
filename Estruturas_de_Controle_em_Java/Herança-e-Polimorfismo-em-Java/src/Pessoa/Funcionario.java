package Pessoa;

public class Funcionario extends Pessoa {

    private double salario;
    private Endereco endereco;

    public Funcionario(String nome, int idade,Endereco endereco, double salario) {
        super(nome, idade, endereco);
        this.salario = salario;
        this.endereco = endereco;
    }

    public double getSalario() {
        return salario;
    }

    public Endereco getEndereco() {
        return endereco;
    }
    
}
