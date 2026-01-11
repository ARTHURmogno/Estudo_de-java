import java.util.Scanner;

public class ContarStrung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String nome = "Arthur";

        System.out.println("============================================");

        System.out.println(nome + ": Têm Letras: " + nome.length());

        System.out.println("============================================");

        System.out.println(nome + ": Em Maiúsculo: " + nome.toUpperCase());

        System.out.println("============================================");

        System.out.println(nome.charAt(0));
        System.out.println(nome.charAt(1));
        System.out.println(nome.charAt(2));
        System.out.println(nome.charAt(3));
        System.out.println(nome.charAt(4));
        System.out.println(nome.charAt(5));

        System.out.println("============================================");

        System.out.println(nome.length()- 1);

        System.out.println("===========================================");

        System.out.println("Informe um Nome: ");
        String nome1 = scanner.next();

        System.out.println("Informe Outro Nome: ");
        String nome2 = scanner.next();

        if (nome1.equals(nome2)) {
            System.out.println("Nome paresido: ");
         
        } else { 
            System.out.println("Não é paresido: ");
        }

         System.out.println("==========================================");

        System.out.println(nome1.equals(nome2));

         System.out.println("==========================================");

          System.out.println("Digité: A palavra(java). ");
          String nodd = scanner.next();

          String nott = "java";

          if (nodd.equals(nott)) {
            System.out.println("Igual: a palavra ");
          } else {
            System.out.println("Não é Igual: ");
          }

          







    }
    
}
