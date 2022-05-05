package br.com.gftstartwoman.projetobancodigital;

public class ContaPoupanca extends Conta {
    @Override
    public void imprimirExtrato() {
        System.out.println("===Extrato Conta Poupança===");
        System.out.printf("Agencia: %d%n",super.agencia);
        System.out.printf("Agencia: %d%n",super.numero);
        System.out.printf("Agencia: %.2f%n",super.saldo);

    }

}
