/**       Emtendendo Operadores-Logicos
 * 
 * 
 * 
 * 
 */


import java.util.Scanner;

public class Exercício1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //int media = not1 + not2 + not3;
        //int notafinal = media / 2;

        System.out.println("Qual é nota do caderno! ");
        int nota1 = scanner.nextInt();

        System.out.println("Qual é nota da prova! ");
        int nota2 = scanner.nextInt();

        System.out.println("Qual é nota de participação! ");
        int nota3 = scanner.nextInt();

        int media = nota1 + nota2 + nota3;
        int notafinal = media / 3;

        //System.out.println("Nota é ", notafinal );

        if (notafinal >= 7) {
             System.out.println("Nota: " + notafinal + " Aprovado. ");
        } else if (notafinal >= 5.5 && notafinal <= 7) {
            System.out.println("Nota; " + notafinal + " Está de reculperação. ");
        } else {
            System.out.println("Nota: " + notafinal + " Reprovado. ");
        }


        scanner.close();




        
    }

    
    
}
