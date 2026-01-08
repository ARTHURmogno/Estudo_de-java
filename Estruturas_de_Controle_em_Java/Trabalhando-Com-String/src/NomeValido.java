/*  Não utilizar para Análise de portfólio.
*
*
*
*
*/


import java.util.Scanner;

public class NomeValido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um nome: ");
        String nome = scanner.next();

        int contador = 0;

        for(int i = 0; i < nome.length(); i++) {
            if(nome.toLowerCase().charAt(i) == 'a') {
                contador++;
            }
        }
        System.out.println("Letra: 'a' " + contador + " vezes. ");
    }
    
}
