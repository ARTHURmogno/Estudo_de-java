package MiniSistemaBancário;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Double> usuarios = new HashMap<>();

        usuarios.put(1001, 3500.00);

        Integer opcao = 0;

        while(opcao != 4) {

        System.out.println("======================");
        System.out.println("1 - Consultar Saldo: ");
        System.out.println("2 - Depositar: ");
        System.out.println("3 Sacar: ");
        System.out.println("0 - Sair: ");
        opcao = sc.nextInt();
        System.out.println("======================");

        System.out.println("Escalha um opção: ");

        switch(opcao) {
            case 1: 
            System.out.println("Informe o número da conta: ");
            Integer opcao1 = sc.nextInt();

            if (usuarios.containskey(conta) && usuarios.get(conta).equals(salso)) {

            }
        }

        }




    }
    
}
