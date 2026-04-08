package ContaBancária;

public class Usuário {

    private String nome;
    private int numeroDaConta;
    private double saldo;

    public Usuário(String nome, int numeroDaConta, double saldo) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome Inválido. ");
        }
        if (numeroDaConta < 10000 || numeroDaConta > 99999) {
            throw new IllegalArgumentException("Número da Conta Inválido. ");
        }
        if (saldo < 0) {
            throw new IllegalArgumentException("Saldo Não pode ser Negativo. ");
        }
        this.nome = nome;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;

    }

    public String getNome()  {
        return nome;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
