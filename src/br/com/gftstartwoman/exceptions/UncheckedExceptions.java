package br.com.gftstartwoman.exceptions;

import javax.swing.*;

public class UncheckedExceptions {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Denominador: ");

        try {
            int resultado = dividir(Integer.parseInt(a),Integer.parseInt(b));
            System.out.println("Resultado" + resultado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Entrada inválida, informe um múmero inteiro" + e.getMessage());
            // e.printStackTrace();
        }finally {
            System.out.println("Chegou no finally!");
        }

        System.out.println("O código continua...");
        {
        }
        int resultado = dividir(Integer.parseInt(a),Integer.parseInt(b));
        System.out.println("Resultado" + resultado);
        System.out.println("Chegou até aqui...");
    }
    public static int dividir(int a, int b) {
        return a/b;
    }
}
