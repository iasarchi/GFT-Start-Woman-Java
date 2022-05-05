package br.com.gftstartwoman.projetobancodigital;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 0001;
    private static int SEQUECIAL = 1;

    public Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUECIAL++;
    }

    protected int agencia;
    protected int numero;
    protected double saldo;

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);

    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    protected void imprimirDadosDaConta() {
        System.out.printf("Agencia: %d%n", this.agencia);
        System.out.printf("Agencia: %d%n", this.numero);
        System.out.printf("Agencia: %.2f%n", this.saldo);
    }
}

