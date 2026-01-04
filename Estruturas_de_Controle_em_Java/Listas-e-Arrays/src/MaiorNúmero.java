public class MaiorNúmero {
    public static void main(String[] args) {

        int[][] numero = {
            {5, 9, 1},
            {4, 8, 2},
            {7, 3, 6}
        };

        for(int i = 0; i < numero.length; i++) {
            for(int n = 0; n < numero[i].length; n++) {
                System.out.print(numero[i][n] + " ");
            }
            System.out.println();
        } 
        //System.out.println();
        
    }
    
}
