import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o Nome: ");
        String nome = scanner.next();

        System.out.println("Informe uma Nota de 0 á 10: ");
        int nota = scanner.nextInt();

        if (nota >= 7) {
            System.out.printf("%S A sua nota é  %s e está APROVADO! \n", nome, nota); 
        } else if (nota == 6) {
            System.out.printf("%s a sua noto é %s e está de RECUPERAÇÃO! \n",nome, nota);
        } else {
            System.out.printf("%s nota %s Está de REPROVADO! \n",nome, nota);
        }

        System.out.println("Fim do programa! ");

        scanner.close();
    }
    
}
