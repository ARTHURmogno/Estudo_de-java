import java.util.Scanner;

public class Cadastro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome seu cpf é um email valido: ");

        System.out.println("Informe seu Nome: ");
        String nome = sc.nextLine();
         System.out.println("Informe seu cpf: ");
        String cpf = sc.nextLine();
         System.out.println("Informe seu email: ");
        String email = sc.nextLine();

        if (!nome.trim().isEmpty() && cpf.length() == 11 && cpf.matches("[0-9]+")
             && !email.trim().isEmpty())  {
            System.out.println("Cadastro validado com sucesso. ");
        } else {
            System.out.println("Cadastro incompleto. ");
            
        }

        //TODO: Crie a estrutura condicional para verificar se algum dos campos está vazio:

        sc.close();
    }
    
}
