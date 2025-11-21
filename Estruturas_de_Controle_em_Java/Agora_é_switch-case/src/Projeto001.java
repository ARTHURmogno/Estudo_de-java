import java.util.Scanner;

public class Projeto001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu de dias da Semana: ");
        System.out.println("Digité um Número de 1 a 7 ");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1: 
            System.out.println("Domimgo ");
            System.out.println("Fim de Semana uhuull \\o/");
            break;
            case 2:
            System.out.println("Segunda ");
            break;
            case 3:
            System.out.println("Terça ");
            break;
            case 4:
            System.out.println("Quarta ");
            break;
            case 5:
            System.out.println("Quinta ");
            break;
            case 6:
            System.out.println("Sexta ");
            break;
            case 7:
            System.out.println("Sábado ");
            System.out.println("Fim de Semana uhuull \\o/");
            break;
            default:
            System.out.println("Opção inválida! ");
            
    }
    System.out.println("Fim do Programa. ");

    scanner.close();
}
    
}
