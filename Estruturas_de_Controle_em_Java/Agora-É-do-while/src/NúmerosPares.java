public class NúmerosPares {
    public static void main(String[] args) {

        int par = 0;
        System.out.println("Números Pares de 1 á 20. ");

        do {
            if (par <= 20) {
                par++;
                //System.out.println("Números Pares de 1 á 20. ");
            }

            if (par % 2 == 0) {
                System.out.printf(", " + par);
            }
        } while(true);

    }
    
}
