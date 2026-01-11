public class ContarPares {
    public static void main(String[] args) {

        int i = 1;
        int pares = 1;

        while(i <= 50) {
            if (i % 2 == 0) {
                pares++;
            }
            i++;
            
        }
        System.out.println("Números Pares: " + pares);

    }
    
    
}
