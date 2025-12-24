package Cinema;

public class Main {
    public static void main(String[] args) {

        Ingressos normal = new IngressoNormal("Matrix", true, 40);
        Ingressos familia = new IngressoFamilia("Matrix", true, 40, 5);
        Ingressos meiaEntrada = new MeiaEntrada("Matrix", false, 40);

        System.out.println("Ingresso Normal: R$ " + normal.calcularValorFinal());
        System.out.println("Ingresso MeiaEmtrada: R$ " + meiaEntrada.calcularValorFinal());
        System.out.println("Ingresso Familha: R$ " + familia.calcularValorFinal());

    }
    
}
