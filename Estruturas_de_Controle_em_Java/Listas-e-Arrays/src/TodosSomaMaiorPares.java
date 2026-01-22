public class TodosSomaMaiorPares {
    public static void main(String[] args) {

        int[] numeros = {8, 9, 3, 67, 2};

        int soma = 0;
        int maior = numeros[0];
        int pares = 0;

        for(int i = 0; i < numeros.length; i++) {
            soma += numeros[i];

            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] % 2 == 0) {
                pares++;
            }
            System.out.println(numeros[i]);

        }
        System.out.println("================================");
        System.out.println("A soma dos Números é " + soma);
        System.out.println("O maior Número é " + maior);
        System.out.println("Quantidade de Números Pares: " + pares);

    }
    
}
