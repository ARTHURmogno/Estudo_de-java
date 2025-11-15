import java.util.Scanner;

public class AreaDoQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a Área do Quadrado: ");
        int area = scanner.nextInt();
        //System.out.println("")

        int resultado = area * area;

        System.out.println("O resultado é Área = " + area + " x " + area + " = " + resultado );

        scanner.close();
        

    }
    
}
