package Usuario;

public class Usuario {

    private String nome;
    private Integer idade;
    private Double saldo;
    private Boolean ativo;

    private String exibirStatus;

    public Usuario(String nome, Integer idade, Double saldo, Boolean ativo) {
        if (nome == null && nome.isBlank()) {
            throw new IllegalArgumentException("Nome não pode ser nulo nem vazio. ");
        }
        if (idade <= 0) {
            throw new IllegalArgumentException("Idade não pode ser menor que (0). ");
        }
        if (saldo < 0) {
            throw new IllegalArgumentException("Saldo não pode ser negativo. ");
        } 
        if (ativo == null) {
            throw new IllegalArgumentException("Status do Ueuario não pode ser Negativo. ");
        }
        this.nome = nome;
        this.idade = idade;
        this.saldo = saldo;
        this.ativo = ativo;
        this.exibirStatus = exibirStatus;
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

    public void setExibirStatus() {
        
        System.out.printf("Status do Usuario: nome %s, idade %d saldo %b Comto está ativa %c. ");
    }

    public  String getExibirStatus(/*String nome, Integer idade, Double saldo, Boolean ativo */) {
        return exibirStatus;
    }
    
}
