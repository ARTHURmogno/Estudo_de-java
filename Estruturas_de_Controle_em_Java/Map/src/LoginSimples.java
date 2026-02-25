import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class LoginSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> usuario = new HashMap<>();

        usuario.put("ana", "456");
        usuario.put("ffgg", "984");
        usuario.put("ju", "47");

        System.out.println("Informe Seu Login. ");
        String login = sc.next();

        System.out.println("Informe a Senha. ");
        String senha = sc.next();

        if (usuario.containsKey(login) && usuario.get(login).equals(senha)) {
            System.out.println("Login efetuado com sucesso. ");
        } else {
            System.out.println("Usuário ou Senha inválido. ");
        }

            sc.close();
        
    }
    
}
