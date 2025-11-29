import java.util.Scanner;

public class SistemaBancárioCadastrosDeClientes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Preencha os Compos Abaixo Com As Devidas informaçãos De Cadastro: ");

        System.out.println("Informe Seu Nome: ");
        String nome = sc.nextLine();
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Erro: Nome é obrigatório. ");
            return;
        }

        System.out.println("Informe Um CPF Valido: ");
        String cpf = sc.nextLine();
        if (cpf == null || cpf.trim().isEmpty()) {
            System.out.println("Erro: cpf é obrigatorio. ");
            return;
        }
        if (!cpf.matches("[0-9]{11}")) {
            System.out.println("Erro: cpf deve conter exatomente 11 número. ");
            return;
        }

        System.out.println("Informe Um Email Valido");
        String email = sc.nextLine();
        if (email == null || email.trim().isEmpty()) {
            System.out.println("Erro: email é Obrigatorio. ");
        }

        System.out.println("Cadastro validado com sucesso: ");


        

        sc.close();
    }
}
