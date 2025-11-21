import java.util.Scanner;

public class Exercicio000 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual Seu nome! ");
        String nome = scanner.next();

        System.out.printf("Bem vindo, " + nome + " Digité algum valor quê aparecer abaixo! \n");
        System.out.println("Quer Somar, Digité 1. ");
        System.out.println("Quer Subtrair, Digité 2. ");
        System.out.println("Quer Multiplicar, Digité 3. ");
        System.out.println("Quer Dividirm Digité 4. ");

        int opcao = scanner.nextInt();


        System.out.println("Informe um Número: " + nome);
        int num1 = scanner.nextInt();

        System.out.println("Informe outro Número: " + nome);
        int num2 = scanner.nextInt();


        int resultado;

        switch (opcao) {
            case 1: 
            resultado = num1 + num2; 
            System.out.printf("Resultado é " + resultado);
            break;
            case 2:
            resultado = num1 - num2;
            System.out.printf("Resultado é " + resultado);
            break;
            case 3: 
            resultado = num1 * num2;
            System.out.printf("Resultado é " + resultado);
            break;
            case 4:
            if (num2 == 0) {
                System.out.println("erro: divisão por zero! ");
            } else {
            resultado = num1 / num2;
            System.out.printf("Resultado é " + resultado);
            }
            break;
            default:
            System.out.println("Opção Inexistente. ");

        }

        System.out.println("Fim do Programa! ");

        scanner.close();


        
    }
    
}
