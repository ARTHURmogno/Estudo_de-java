import java.util.Scanner;

public class SistemaBancárioCadastrosDeClientes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe Seu Nome: ");
        String nome = sc.nextLine();

        System.out.println("Informe Um CPF Valido: ");
        String cpf = sc.nextLine();

        System.out.println("Informe Um Email Valido");
        String email = sc.nextLine();

        //TODO: Crie a estrutura condicional para verificar se algum dos campos está vazio:

        sc.close();
    }
}
