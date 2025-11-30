/*Durante testes de segurança de uma interface bancária,você 
*precisa criar um código que compare se a senha digitada e a
*confirmação são idênticas.
*/

import java.util.Scanner;

public class ConferenciaDeSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    String senhaDigitada = sc.nextLine();
    String senhaConfirmada = sc.nextLine();
        
        if (senhaDigitada.equals(senhaConfirmada)) {
          System.out.println("Senha valida. ");
        } else {
          System.out.println("Senha nao conferem.");
        }

        // TODO: Implemente a estrutura condicional que compara as duas strings:

        sc.close();
    }
    
}
