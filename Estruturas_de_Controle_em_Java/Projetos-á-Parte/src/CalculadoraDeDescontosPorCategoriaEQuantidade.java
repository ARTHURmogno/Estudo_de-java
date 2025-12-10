import java.util.Scanner;

public class CalculadoraDeDescontosPorCategoriaEQuantidade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int precoUnitario = 50;
        double descontoBase = 00;
        double descontoAdicional = 00;

        System.out.println("Categoria de Produtos: " );
        System.out.println("Eletronicos: ");
        System.out.println("Livros: ");
        System.out.println("Vestuario: ");
        System.out.println("Qual á Categoria do produto: ");
        String categoriaProduto = sc.nextLine();

        System.out.println("Informe á quantidade do produto: ");
        int quantidadeComprada = sc.nextInt();

        //double precoTotal = quantidadeComprada * precoUnitario;
        //double descontoTotal = precoTotal descontoBase + descontoAdicional;
        
        
        switch (categoriaProduto) {
            case "Eletronicos": 
            descontoBase = 0.10; 
            System.out.println("Desconto de 10% ");
            break;

            case "Livros": 
            descontoBase = 0.05;
            System.out.println("Desconto de 5% ");
            break;

            case "Vestuario": 
            descontoBase = 0.15;
            System.out.println("Desconto de 15% ");
            break;

            default:
                System.out.println("0% de desconto, Categoria não Reconhecida: ");
                descontoBase = 0;
        }

        if (quantidadeComprada > 10) {
            descontoAdicional = 0.05;
        } else if (quantidadeComprada > 5 && quantidadeComprada <= 10) {
            descontoAdicional = 0.02;
        } else if (quantidadeComprada < 5) {
            descontoAdicional = 0;
        }


        double precoTotal = quantidadeComprada * precoUnitario;
        double descontoTotal = precoTotal * (descontoBase + descontoAdicional);
        double precoFinal = precoTotal - descontoTotal;
        

        System.out.println(precoFinal);

        sc.close();


        
    }
    
}
