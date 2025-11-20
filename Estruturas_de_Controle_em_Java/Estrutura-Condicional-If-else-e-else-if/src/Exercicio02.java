import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.println("Informe seu Nome! ");
        //String nome = scanner.next();

        System.out.println("Informe sua altura! ");
        double altura = scanner.nextDouble();

        System.out.println("Informe seu peso! ");
        int peso = scanner.nextInt();

        double imc = peso / (altura * altura);

        if (imc <= 17) {
            System.out.printf("Magreza moderada! \n");
        } else if (imc <= 18.5) {
            System.out.printf("Magreza leve! \n");
        } else if (imc <= 25) {
            System.out.printf("Está Saudável! \n");
        } else if (imc == 30) {
            System.out.printf("Está de Sobrepeso! \n");
        } else if (imc <= 35) {
            System.out.printf("Você está com obesidade grau I. \n");
        } else {
            System.out.printf("imc entre 35 a 40 obesidade grou II é maior que 40 obesidade grau III. \n");
        }

        System.out.println("Fim do programa. ");

        scanner.close();
    }
    
}
