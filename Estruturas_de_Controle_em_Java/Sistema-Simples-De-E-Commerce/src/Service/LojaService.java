package Service;

import Modelo.Usuario;
import Modelo.Carrinho;

public class LojaService {

    public static void realizarCompra(Usuario usuario, Carrinho carrinho) {
        double total = carrinho.calculaTotal();

        if (usuario.podeComprar(total)) {
            usuario.debitarSaldo(total);
            System.out.println("Compra relizada com sucesso!");
        } else {
            throw new RuntimeException("Saldo insuficiente para realizar a compra.");
        }
    }
    
}
