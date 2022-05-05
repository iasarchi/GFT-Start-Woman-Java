package br.com.gftstartwoman.projetobancodigital;

public interface Iconta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);
}
