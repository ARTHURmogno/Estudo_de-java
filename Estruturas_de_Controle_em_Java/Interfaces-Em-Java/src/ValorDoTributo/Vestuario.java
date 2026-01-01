package ValorDoTributo;

public class Vestuario extends Produto {

     public Vestuario(String nome, int valorProduto) {
        super(nome, valorProduto);
    }  
    @Override
    public double ValorDoTributo() {
        return getValorProduto() * 0.025;
    }
      
}
