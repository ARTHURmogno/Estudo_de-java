package ContaBancária.Service;

import ContaBancária.Modelo.Usuario;
import java.util.Map;
import java.util.HashMap;

public class SistemadoUsuario {
    Map<Integer, Usuario> usuarios = new HashMap<>();

    public String adicionarCliente(int numeroDaConta, Usuario usuario) {

        Usuario existente = usuarios.get(numeroDaConta);

        if (existente == null) {
            return "Usuário inválido. ";
        }
        if (existente != null) {
            return "Usúario já cadastrado. ";
        }
            usuarios.put(numeroDaConta, usuario);
            return "Usúsrio cadastrado com sucesso! ";

    }

    public String removerConta(int numeroDaConta) {

        Usuario user = usuarios.get(numeroDaConta);

        if (user == null) {
            return "Usuário não essiste. ";
        }
            usuarios.remove(numeroDaConta);
            return "Usuário removido com sucesso. ";

    }

    public boolean adicionarSaldo(int numeroDaConta, double valor) {

        Usuario a = usuarios.get(numeroDaConta);

        if (a != null && valor > 0) {
            double novoSaldo = a.getSaldo() + valor;
            a.setSaldo(novoSaldo);
            return true;
        }


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

    public Usuario buscarConta(int numeroDaConta) {

        Usuario user = usuarios.get(numeroDaConta);
        
        if (user != null) {
            return user;
        }

        return null;

    }

    public void usuariosLista() {

        for (Usuario user : usuarios.values()) {
            System.out.printf("Conta: %d Nome: %s Saldo: %.2f\n",
             user.getNumeroDaConta(), user.getNome(), user.getSaldo());
        }

    }

    public String transferenciaEntreContas(int numeroConta, int numeroConta02, double valorDaTransferencio) {
        Usuario user01 = usuarios.get(numeroConta);
        Usuario user02 = usuarios.get(numeroConta02);

        if (user01 == null) {
            return "Conta origem não existe. ";
        }

        if (user02 == null) {
            return "Conta destino não ixiste. ";
        }

        if (valorDaTransferencio <= 0) {
            return "Valor inválido. ";
        }

        if (user01.getSaldo() < valorDaTransferencio) {
            return "Saldo insuficiente. ";
        }

        user01.setSaldo(user01.getSaldo() - valorDaTransferencio);
        user02.setSaldo(user02.getSaldo() + valorDaTransferencio);

            return "Transferencia comcluida. ";


    }






}



    

