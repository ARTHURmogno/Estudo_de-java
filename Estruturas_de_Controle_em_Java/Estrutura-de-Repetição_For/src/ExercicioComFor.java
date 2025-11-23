/**
 * Tabuada: 
 * 
 * Eu utilizei: for é támbem if e switch case:
 * 
 * for para laso de repetição.
 * 
 * if para interronper tudo caso o usuário escolhe-se uma opção não existente.
 * 
 * E switch case para escolher o tipo de tabuada.
 * 
 *    
 *          
 */



import java.util.Scanner;

public class ExercicioComFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tabuada de: ");
        System.out.println("Escolha um Número de 1 á 4: ");
        System.out.println("Tabuada de Adição: 1 ");
        System.out.println("Tabuada de Subtração: 2 ");
        System.out.println("Tabuada de Divisão: 3 ");
        System.out.println("Tabuada de Multiplicação: 4 ");

        int opcao = scanner.nextInt();

        if(opcao < 1 || opcao > 4) {
            System.out.println("Opção Não Existente: ");
            scanner.close();
            System.out.println("Fim do Programa: ");
            return;
        }

        System.out.println("Escolha ó Número da Tabuada: ");
        int numero = scanner.nextInt();

        switch(opcao) {
            case 1:
            for(int x = 1; x <=10; x++) {
                System.out.println(numero + "+" + x + "=" + (numero + x));
            } break;
            case 2:
            for(int x = 1; x <= 10; x++) {
                System.out.println(numero + "-" + x + "=" + (numero - x));
            }break;
            case 3:
            for(int x = 1; x <=10; x++) {
                System.out.println(numero + "/" + x + "=" + (numero / x));
            } break;
            case 4:
            for(int x = 1; x <=10; x++) {
                System.out.println(numero + "*" + x + "=" + (numero * x));
            } break;

        }

        System.out.println("Fim do Programa: ");

        scanner.close();

        
        
        
    }
    
}
