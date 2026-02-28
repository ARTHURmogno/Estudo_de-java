package MiniSistemaBancário;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Double> usuarios = new HashMap<>();

        usuarios.put(1001, 3500.00);

        boolean executando = true;
        Integer opcao = 0;

        while(executando) {

        System.out.println("======================");
        System.out.println("1 - Consultar Saldo: ");
        System.out.println("2 - Depositar: ");
        System.out.println("3 - Sacar: ");
        System.out.println("0 - Sair: ");
        System.out.println("Escalha um opção: ");
        opcao = sc.nextInt();
        System.out.println("======================");

        switch(opcao) {
            case 1: 
            System.out.println("Informe o número da conta: ");
            Integer numConta = sc.nextInt();

            if (usuarios.containsKey(numConta)) {
                System.out.println("Saldo da Conta: " + usuarios.get(numConta));
            } else {
                System.out.println("Número da Conta Não encontrada. ");
            }
            break;
            case 2:
                System.out.println("Informe o Número da conta: ");
                numConta = sc.nextInt();

                System.out.println("Informe o Valor: ");
                Double addSaldo = sc.nextDouble();

                if (usuarios.containsKey(numConta)) {
                    if (addSaldo > 0) {
                    usuarios.put(numConta, usuarios.get(numConta) + addSaldo);
                    } else {
                        System.out.println("Valor inválido. ");
                    }
                    System.out.println("Novo saldo: " + usuarios.get(numConta));
                } else {
                    System.out.println("Conta não encontrado! ");
                }
                break;
                case 3:
                    System.out.println("Informe o número da conta. ");
                    numConta = sc.nextInt();

                    System.out.println("Informe o Valor: ");
                    Double saque = sc.nextDouble();

                    if (usuarios.containsKey(numConta)) {
                        if (saque > 0 && usuarios.get(numConta) >= saque) {
                            usuarios.put(numConta, usuarios.get(numConta) - saque);
                            System.out.println("Saque realizado com sucesso! ");
                            System.out.println("Novo saldo: " + usuarios.get(numConta));
                        } else {
                            System.out.println("Saldo insuficiente! ");
                        }
                        } else {
                            System.out.println("Conta não encontrada! ");
                        }
                        break;

                        case 0:
                            System.out.println("Encerrando sistema... ");
                            executando = false;
                            break;

                            default:
                                System.out.println("Opção Inválida");
                    }

                }


                sc.close();
            }

        }




    
    

