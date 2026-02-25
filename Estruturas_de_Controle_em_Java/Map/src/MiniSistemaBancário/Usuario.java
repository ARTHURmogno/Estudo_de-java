package MiniSistemaBancário;

public class Usuario {

    private Integer conta;
    private Double saldo;

    public Usuario(Integer conta, Double saldo) {
        if (conta == null && conta.isBlank()) {
            throw new IllegalArgumentException("Conta Não pode ser nulo nem vazio. ");
        }
        if (saldo <= 0) {
            throw new IllegalArgumentException("Saldo não pode ser Negativo. ");
        }
        this.conta = conta;
        this.saldo = saldo;
    }

    public String getConta() {
        return conta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double consultarSaldo(Double saldo) {
        return saldo;
    }
    
}
