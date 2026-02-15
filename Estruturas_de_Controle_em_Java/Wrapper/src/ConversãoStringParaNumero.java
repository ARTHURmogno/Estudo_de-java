public class ConversãoStringParaNumero {
    public static void main(String[] args) {


        double preco = 10.5;
        String valor = "15.55";

        String precoTexto = Double.toString(preco);
        double valorConvertido = Double.parseDouble("15.55");

        System.out.printf("O preco do Sal é %s:  \n", precoTexto);
        System.out.println("O valor é : " + valorConvertido);


        
    }
}
