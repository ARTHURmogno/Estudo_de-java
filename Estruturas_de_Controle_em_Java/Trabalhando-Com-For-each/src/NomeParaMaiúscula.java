public class NomeParaMaiúscula {
    public static void main(String[] args) {

        String[] nome = {"ana", "joao", "Maria"};

        for(int i = 0; i < nome.length; i++) {
            nome[i] = nome[i].toUpperCase();
            System.out.println(nome[i]);
        }

    }
}
