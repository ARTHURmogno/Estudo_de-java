package ValorDoTributo;

public class SaldeBemEstar extends Produto {


    public SaldeBemEstar(String nome, int valorProduto) {
        super(nome, valorProduto);        
    }  
    @Override
    public double ValorDoTributo() {
       return getValorProduto() * 0.015;
    }

}
