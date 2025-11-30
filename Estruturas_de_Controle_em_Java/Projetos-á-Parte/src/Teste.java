import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        String cpf = sc.nextLine();
        String email = sc.nextLine();
        
        if (nome.isEmpty() || cpf.isEmpty() || email.isEmpty() ) {
          System.out.println("Cadastro incompleto.");
        } else {
          System.out.println("Cadastro validado com sucesso.");
        }
            
        

        //TODO: Crie a estrutura condicional para verificar se algum dos campos está vazio:

        sc.close();
    }
        
 }


