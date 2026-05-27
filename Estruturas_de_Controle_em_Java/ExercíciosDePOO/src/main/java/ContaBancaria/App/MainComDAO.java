package ContaBancaria.App;

import java.util.List;

import ContaBancaria.Modelo.Usuario;
import ContaBancaria.Service.SistemadoUsuario;
import ContaBancaria.UsuarioDAO.Dao;

import java.util.Scanner;

public class MainComDAO {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Dao dao = new Dao();

        boolean ligado = true;

        while(ligado) {

            System.out.println("=======Opçães/=======");
            System.out.println(" 1 - Criar conta: ");
            System.out.println(" 2 - Listar usuario:");
            System.out.println(" 3 - Listar usuarios:");
            System.out.println(" 4 - Adicionar saldo:");
            System.out.println(" 5 - Subtrair saldo: ");
            System.out.println(" 6 - deletar usuario:");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao) {
                case 1:

                System.out.println("Informe seu nome: ");
                String nome = sc.nextLine();

                System.out.println("Informe o saldo: ");
                double saldo = sc.nextDouble();

                System.out.println("Usuario salvo. ");
                Usuario user = new Usuario(nome, saldo);

                dao.salvar(user);

                break;
                case 2:
                    System.out.println("Informe o id: ");
                    int id = sc.nextInt();

                    Usuario u = dao.mostraPorId(id);

                    System.out.println(u);

                break;
                case 3:

                List<Usuario> usuario = dao.listar();

                if (usuario.isEmpty()) {
                    System.out.println("Usuario não existe.");
                } else {

                    for(Usuario u1 : usuario) {
                    System.out.println(u1);

                }
                }

                break;
                case 4:

                System.out.println("Informe ID: ");
                id = sc.nextInt();

                System.out.println("Informe o valor: ");
                saldo = sc.nextDouble();

                Usuario n = new Usuario(id, saldo);

                dao.adicionarSaldo(id, saldo);

                break;
                case 5:

                System.out.println("Informe ID: ");
                id = sc.nextInt();

                System.out.println("Informe o valor: ");
                saldo = sc.nextDouble();

                Usuario x = new Usuario(id, saldo);

                dao.adicionarSaldo(id, saldo);

                break;

                default:
                    System.out.println("Opção invalida. ");

            } 




        }




    }

    
}
