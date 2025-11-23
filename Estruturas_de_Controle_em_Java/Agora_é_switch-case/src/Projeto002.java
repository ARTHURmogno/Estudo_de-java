import java.util.Scanner;

public class Projeto002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu de Conversor de Medidas. ");
        System.out.println("Digité um Número Corespondente. ");
        System.out.println("Metros para KM 1.");
        System.out.println("Metros para Cm 2. ");
        System.out.println("Litros para ML 3. ");
        System.out.println("Kg Para Gramas 4. ");

        int opcao = scanner.nextInt();

        if (opcao <1 || opcao >4) {
            System.out.println("Opção Inválida. ");
            scanner.close();
            System.out.println("Fim do Programa. ");
            return;
        }

        System.out.println("Digité um valor: ");
        double num = scanner.nextDouble();

        //System.out.println("Digité outro Valor: ");
        //boolean num2 = scanner.nextBoolean();

        double resultado;

        switch (opcao) {
            case 1:
            resultado = num * 1000;
            System.out.println("Metros para Km: " + resultado + " Km\n");
            break;
            case 2:
            resultado = num * 100;
            System.out.println("Metros para Cm: " + resultado + " Cm");
            break;
            case 3:
            resultado = num * 1000;
            System.out.println("Litros para ML: " + resultado + " ML");
            break;
            case 4:
            resultado = num * 1000;
            System.out.println("Kg para gramas: " + resultado + " gramas ");
            break;

        }

        System.out.println("Fim do Programa. ");


        scanner.close();



    }
    
}
