import java.util.Scanner;

public class VendasMensais {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float metaVendas = 100;
        String nivelDesempenho = "";
        float bonus = 0;

        System.out.println("Informe o Nome do Vendedor: ");
        String vendedor = scanner.nextLine();

        System.out.println("Informe as Vendas: ");
        float vendas = scanner.nextFloat();

        // Definindo o nível de desempenho
        if (vendas >= metaVendas) {
            nivelDesempenho = "Excelente";
        } else if (vendas > 50) {
            nivelDesempenho = "Bom";
        } else if (vendas > 10) {
            nivelDesempenho = "Mediano";
        } else {
            nivelDesempenho = "Insatisfatorio";
        }

        // Calculando bônus com switch
        switch (nivelDesempenho) {
            case "Excelente":
                bonus = vendas * 0.10f; // 10%
                break;

            case "Bom":
                bonus = vendas * 0.05f; // 5%
                break;

            case "Mediano":
                bonus = vendas * 0.01f; // 1%
                break;

            case "Insatisfatorio":
            default:
                bonus = 0;
                break;
        }

        System.out.println("--------------- RESULTADO ---------------");
        System.out.println("Vendedor: " + vendedor);
        System.out.println("Vendas: " + vendas);
        System.out.println("Nível de Desempenho: " + nivelDesempenho);
        System.out.println("Bônus Recebido: R$ " + bonus);
        System.out.println("-----------------------------------------");

        scanner.close();
    }
}
