import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Senha {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Entrada
        String senhaDigitada = br.readLine();
        String senhaConfirmada = br.readLine();

        // Comparação correta de String em Java
        if (senhaDigitada.equals(senhaConfirmada)) {
            System.out.println("Senha valida");
        } else {
            System.out.println("Senhas nao conferem");
        }
    }
}

