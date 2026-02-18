package Usuario;

public class Usuario {

    private String nome;
    private Integer idade;
    private Double saldo;
    private Boolean ativo;


    public Usuario(String nome, Integer idade, Double saldo, Boolean ativo) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome não pode ser nulo nem vazio. ");
        }
        if (idade <= 0) {
            throw new IllegalArgumentException("Idade não pode ser menor que (0). ");
        }
        if (saldo < 0) {
            throw new IllegalArgumentException("Saldo não pode ser negativo. ");
        }
        if (ativo == null) {
            throw new IllegalArgumentException("Status não pode ser nulo. ");
        }
        this.nome = nome;
        this.idade = idade;
        this.saldo = saldo;
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public Double getSaldo () {
        return saldo;
    }

    public boolean getAtivo () {
        return ativo;
    }

    public void exibirStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Saldo Em Conta: " + saldo);
        System.out.println("Status: " + (ativo ? "Ativo" : "Inativa"));

    }

    public void fazerCompra(Double valor) {
        if (valor > saldo) {
            System.out.println("Saldo Insuficiente. Saldo atual: R$ " + saldo);
        } else {
            this.saldo -= valor;
            System.out.println("Saldo Atualizado.Novo saldo: R$ " + saldo);
        }
    }

    public boolean ehMaiorDeIndade() {
        return idade >= 18;
    }
    
}
