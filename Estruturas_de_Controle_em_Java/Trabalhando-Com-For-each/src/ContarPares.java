public class ContarPares {
    public static void main(String[] args) {
        
        int[] par = {2, 5, 8, 9, 10};

        int contador = 0;
        int adiciona = 0;
        for (int n : par) {
            if(n % 2 == 0) {
                adiciona++;
                contador += n;
            }
        }
        System.out.println("A soma dos Números Pares é " + contador);
        System.out.println("A Quantidade de Números Pares São: " + adiciona);

    }
    
}
