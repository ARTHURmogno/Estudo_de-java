import java.util.Scanner;

public class TrabalhandoComString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digité: ");
        String nodd = scanner.next();

          String nott = "java";
          nodd.toUpperCase();

          if (nodd.equals(nott)) {
            System.out.println("Igual: ");
          } else {
            System.out.println("Não é Igual: ");
          }

    }
    
}
