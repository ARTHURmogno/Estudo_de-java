import java.util.Scanner;

public class AcertaSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha1;

        while(true) {
            System.out.println("Informe A Senha: ");
            senha1 = sc.nextInt();

            int senha2 = 3455;

            if (senha1 != senha2) {
                System.out.println("Senha Incoreta: ");
            } else {
                System.out.println("Senha coreta: ");
                break;
            }
        }

        sc.close();
        
    }
    
}
