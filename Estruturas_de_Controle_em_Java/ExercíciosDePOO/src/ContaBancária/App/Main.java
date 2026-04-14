package ContaBancária.App;

import ContaBancária.Modelo.Usuario;
import ContaBancária.Service.SistemadoUsuario;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SistemadoUsuario sistema = new SistemadoUsuario();

        boolean funcionando = true;

        while(funcionando) {

            System.out.println("\\==========Opçães==========//");
            System.out.println(" 01 - Criar conta: ");
            System.out.println(" 02 - Remover conta: ");
            System.out.println(" 03 - Adicionar saldo: ");
            System.out.println(" 04 - Sacar saldo: ");
            System.out.println(" 05 - Verificar saldo: ");
            System.out.println(" 06 - Lista usúarios: ");
            System.out.println(" 07 - Transferir entre contas. ");
            System.out.println(" 0 - Para Sair: ");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao) {

                case 1:

                System.out.println("Informe o Nome: ");
                String nome = sc.nextLine();

                System.out.println("Número da conta: ");
                int numeroConta = sc.nextInt();
                sc.nextLine();

                System.out.println("Saldo: ");
                double saldoConta = sc.nextDouble();
                sc.nextLine();

                Usuario user = new Usuario(nome, numeroConta, saldoConta);

                sistema.adicionarCliente(numeroConta, user);

                break;
                case 2:

                System.out.println("Número da conta: ");
                numeroConta = sc.nextInt();
                sc.nextLine();

                sistema.removerConta(numeroConta);

                break;
                case 3:

                System.out.println("Número da conta: ");
                numeroConta = sc.nextInt();
                sc.nextLine();

                System.out.println("Valor á ser adicionado: ");
                saldoConta = sc.nextDouble();
                sc.nextLine();

                if (sistema.adicionarSaldo(numeroConta, saldoConta)) {
                    System.out.println("Saldo adicionado com sucesso. ");
                    sistema.verificarSaldo(numeroConta);
                } else {
                    System.out.println("Conta não existe ou valor inválido. ");
                }

                break;
                case 4:

                System.out.println("Informe o número da conta: ");
                numeroConta = sc.nextInt();
                sc.nextLine();

                System.out.println("Informe o valor que sera sacado: ");
                saldoConta = sc.nextDouble();
                sc.nextLine();

                sistema.sacarSaldo(numeroConta, saldoConta);

                break;
                case 5:

                System.out.println("Infome o número da conta: ");
                numeroConta = sc.nextInt();
                sc.nextLine();

                sistema.verificarSaldo(numeroConta);

                break;
                case 6:

                sistema.usuariosLista();

                break;
                case 7:

                System.out.println("Conta enviar: ");
                numeroConta = sc.nextInt();
                sc.nextLine();

                System.out.println("Conta receber: ");
                int numeroConta02 = sc.nextInt();
                sc.nextLine();

                System.out.println("Informe o Valor: ");
                double valorASerTreansferido = sc.nextDouble();
                sc.nextLine();

                sistema.transferenciaEntreContas(numeroConta, numeroConta02, valorASerTreansferido);

                break;
                case 0:

                funcionando = false;
                System.out.println("Programa Fim. ");

                break;
                default:
                    System.out.println("Opção Invalida. ");

            }




        }

        sc.close();


    }
    
}
