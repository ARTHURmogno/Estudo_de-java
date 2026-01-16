/*  List.of: uma lista imutável, Não permite adicionar, remover ou alterar elementos após a criação.
*
*   get: Para acessar valores de uma Lista(List), Ex: numeros.get(i);
*
* O Programa Descrito realiza três operações : Tem uma list imutável e ele soma os Valores da List é Apresenta a Média TamBém Mostra A soma Somente dos Números Pares;
* */



import java.util.List;
import java.util.ArrayList;

public class SomarAMédia {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(List.of(3,1,4,1,5,9,8));

        int soma = 0;
        int numerosPar = 0;

        for(int i = 0; i < numeros.size();i++) {
            if (numeros.get(i) % 2 == 0) {
            numerosPar += numeros.get(i);
            }
            soma += numeros.get(i);
        }

        double media = (double) soma / numeros.size();

        System.out.println("Contar: " + soma);
        System.out.println("Soma Somente Os Números Pares: " + numerosPar);
        System.out.println("Média: " + media);
    }
    
}