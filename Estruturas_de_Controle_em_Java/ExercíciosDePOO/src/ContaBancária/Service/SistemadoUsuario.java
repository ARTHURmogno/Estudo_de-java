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

        Usuario user = usuarios.get(numeroDaConta);

        if (user == null) {
            usuarios.remove(numeroDaConta);
        } else {
            System.out.println("Usúario não essiste. ");
        }

    }

    public boolean adicionarSaldo(int numeroDaConta, double valor) {

        if (usuarios.containsKey(numeroDaConta) && valor > 0) {
            Usuario a = usuarios.get(numeroDaConta);
            double novoSaldo = a.getSaldo() + valor;
            a.setSaldo(novoSaldo);
            System.out.println("Saldo adicionado com sucesso. " + "Novo Saldo: " + novoSaldo);
            return true;
        }

        System.out.println("Conta não existe ou valor inválido. ");
        return false;

    }

    public boolean sacarSaldo(int numeroDaConta, double valorSaque) {

        if (usuarios.containsKey(numeroDaConta)) {
            Usuario user = usuarios.get(numeroDaConta);

            if (user.getSaldo() >= valorSaque && valorSaque > 0) {
                double novoSaldo = user.getSaldo() - valorSaque;
                user.setSaldo(novoSaldo);
                System.out.println("Saque efetuado com sucesso. " + "Novo Saldo: " + novoSaldo);
                return true;
            } else {
            System.out.println("Saldo insuficiente ou volor de saque inválido. ");
            return false;
        }

    }

          System.out.println("Conta Não encontrada. ");
            return false;
    
    
    }

    public boolean verificarSaldo(int numeroDaConta) {
        
        if (usuarios.containsKey(numeroDaConta)) {
            Usuario user = usuarios.get(numeroDaConta);
            System.out.printf("Conta: %d nome: %s saldo: %.2f\n", user.getNumeroDaConta(), user.getNome(), user.getSaldo());
            return true;
        }

        System.out.println("Conta não encontrada. ");
        return false;

    }

    public void usuariosLista() {

        for (Usuario user : usuarios.values()) {
            System.out.printf("Conta: %d Nome: %s Saldo: %.2f\n",
             user.getNumeroDaConta(), user.getNome(), user.getSaldo());
        }

    }






}



    

