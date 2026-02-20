package Modelo;

import java.util.Objects;

public class Usuario {

    private String nome;
    private int idade;
    private double saldo;

    public Usuario(String nome, int idade, double saldo) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome não pode ser vazio nem nulo");
        }
        if (idade <= 16) {
            throw new IllegalArgumentException("Não pode ser menor de 16 anos.");
        }
        if (saldo < 0) {
            throw new IllegalArgumentException("Saldo não pode ser menor que 0.");
        }
        this.nome = nome;
        this.idade = idade;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getSaldo() {
        return saldo;
    }

    public String setNome() {
        return nome;
    }

    public double setSaldo() {
        return saldo;
    }

    public boolean podeComprar(double valor) {
        if (saldo >= valor) {
            return true;
        } else {
            return false;
        }
    }

    public void debitarSaldo(double valor) {
        saldo -= valor;
    }

}
