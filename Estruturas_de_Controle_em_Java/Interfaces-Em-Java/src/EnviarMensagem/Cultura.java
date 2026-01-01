package EnviarMensagem;

public class Cultura extends Produto {

     public Cultura(String nome, int valorProduto) {
        super(nome, valorProduto);
    }  
    @Override
    public double ValorDoTributo() {
        return getValorProduto() * 0.04;
    }
    
}
