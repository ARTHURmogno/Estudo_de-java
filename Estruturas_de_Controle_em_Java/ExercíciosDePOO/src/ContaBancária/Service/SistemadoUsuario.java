package ContaBancária.Service;

import ContaBancária.Modelo.Usuario;
import java.util.Map;
import java.util.HashMap;

public class SistemadoUsuario {
    Map<Integer, Usuario> usuarios = new HashMap<>();

    public void adicionarCliente(int numeroDaConta, Usuario usuario) {

        if (usuarios.containsKey(numeroDaConta)) {
            System.out.println("Usúario já cadastrado. ");
        } else {
            usuarios.put(numeroDaConta, usuario);
            System.out.println("Usúsrio cadastrado com sucesso! ");
        }

    }

    public void removerConta(int numeroDaConta) {

        if (usuarios.containsKey(numeroDaConta)) {
            usuarios.remove(numeroDaConta);
        } else {
            System.out.println("Usúario não essiste. ");
        }

    }

    public boolean adicionarSaldo(int numeroDaConta, double novoSaldo) {

        if (usuarios.containsKey(numeroDaConta) && novoSaldo > 0) {
            Usuario a = usuarios.get(novoSaldo);
            System.out.println("Saldo adicionado com sucesso: ");
            return true;
        }

        return false;

    }

    

}