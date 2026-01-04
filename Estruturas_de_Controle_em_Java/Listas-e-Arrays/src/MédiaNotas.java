public class MédiaNotas {
    public static void main(String[] args) {

        double[] notas = {8.0, 9.5, 10.0, 4.9};
        double soma = 0;


        for(int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        double notaFinal = soma / notas.length;

        if (notaFinal >= 7.0) {
            System.out.println("Está Aprovado: ");
        } else if (notaFinal >= 6.0) {
            System.out.println("Está de Recuperação: ");
        } else if (notaFinal < 5.0) {
            System.out.println("Está Reprovado: ");
        }

        System.out.println(notaFinal); 
    }
    



     /* for(double n : notas) {
            soma += n; 
        } */
}
