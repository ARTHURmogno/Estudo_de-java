public class Main {
    public static void main(String[] args) {

        Ingresso normal = new IngressoNormal("Matrix", true, 40);
        Ingresso familha = new IngressoFamilha("Matrix", true, 40, 5);
        Ingresso meiaEntrada = new MeiaEmtrada("Matrix", false, 40);

        System.out.println("Ingresso Normal: R$ " + normal.calcularValorFinal());
        System.out.println("Ingresso MeiaEmtrada: R$ " + meiaEntrada.calcularValorFinal());
        System.out.println("Ingresso Familha: R$ " + familha.calcularValorFinal());

    }
    
}
