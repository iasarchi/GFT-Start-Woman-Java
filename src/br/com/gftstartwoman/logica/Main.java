package br.com.gftstartwoman.logica;

public class Main {
    public static void main(String[] args) {

        // Calculadora
        System.out.println("EXERCICIO CALCULADORA");
        Calculadora.soma(3, 6);
        Calculadora.subtrai(9, 1.8);
        Calculadora.multiplica(7, 8);
        Calculadora.divide(5, 2.5);

        //  Mensagem

        System.out.println("EXERCICIO MENSAGEM");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);


        //  Empréstimo
        System.out.println("EXERCICIO EMPRÉSTIMO");
        Emprestimo.calcular(1000,Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000,Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000,5);
    }
}
