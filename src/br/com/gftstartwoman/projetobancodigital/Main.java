package br.com.gftstartwoman.projetobancodigital;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Cliente cliente1 = new Cliente();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do Cliente: ");
        String nome = scanner.next();
        cliente.setNome(nome);
        System.out.println("Digite o nome do Cliente: ");
        nome = scanner.next();
        cliente1.setNome(nome);
        Conta cc = new ContaCorrente();
        Conta poupanca = new ContaPoupanca();
        cliente.getContas().add(new ContaCorrente());
        cliente.getContas().add(new ContaPoupanca());
        cliente1.getContas().add(new ContaCorrente());
        cliente1.getContas().add(new ContaPoupanca());

        System.out.println("Informações do cliente 1");
        System.out.println(" --------------- ");
        for (Conta conta : cliente.getContas()) {
            conta.imprimirExtrato();
        }

        System.out.println(" --------------- ");

        System.out.println("Informações do cliente 2");
        System.out.println(" --------------- ");
        for (Conta conta : cliente1.getContas()) {
            conta.imprimirExtrato();
        }
        System.out.println(" --------------- ");


    }

}
