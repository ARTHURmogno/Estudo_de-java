public class Produto0 {

    private String nome;

    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Nome Inválido. ");
        }
            
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0.00) {
            this.preco = preco;
        } else {
            System.out.println("Preco Inválido. ");
        }
    }
}
