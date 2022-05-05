package br.com.gftstartwoman.projetobancodigital;

public class Conta implements Iconta {

    private static final int AGENCIA_PADRAO = 0001;
    private static int SEQUECIAL = 1;

    public Conta(){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUECIAL++;
    }
    protected int agencia;
    protected int numero;
    protected int saldo;

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

    }


    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public int getSaldo() {
        return saldo;
    }

}

