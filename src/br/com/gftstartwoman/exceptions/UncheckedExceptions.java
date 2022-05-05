package br.com.gftstartwoman.exceptions;

import javax.swing.*;

public class UncheckedExceptions {
    public static void main(String[] args) {

        boolean continueLooping = true;
        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

        } while (continueLooping);
        String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Denominador: ");

        try {
            int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
            System.out.println("Resultado" + resultado);
            continueLooping = false;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida, informe um múmero inteiro" + e.getMessage());
            e.printStackTrace();
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "impossivel dividir um numero por 0!");
        } finally {
            System.out.println("Chegou no finally!");
        }

        System.out.println("O código continua...");
        {
        }
        int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
        System.out.println("Resultado" + resultado);
        System.out.println("Chegou até aqui...");
    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}
