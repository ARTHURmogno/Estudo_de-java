package EnviarMensagem;

public class Alimentação extends Produto {

    public Alimentação(String nome, int valorProduto) {
        super(nome, valorProduto);
    }  
    @Override
    public double ValorDoTributo() {
       return getValorProduto() * 0.01;
    }


    
}
