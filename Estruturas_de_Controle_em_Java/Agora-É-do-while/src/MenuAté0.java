import java.util.Scanner;

public class MenuAté0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        
        int numero;

        do{
            System.out.println("Digité 0 Para Sair. ");
             numero = sc.nextInt();

            
            if (numero == 0) {
                System.out.println("Fim do Programa. ");
                break;
            }

        } while(true);

    }
    
}
