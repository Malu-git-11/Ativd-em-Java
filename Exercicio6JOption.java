import javax.swing.*;

public class Exercicio6JOption {
    public static void main (String[] args){
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número inteiro:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número inteiro:"));

        String operacao = JOptionPane.showInputDialog("Digite a operação (+, -, *, /):");

        int resultado;
        String mensagem;

        if (operacao.equals("+")) {
            resultado = num1 + num2;
            mensagem = "Resultado: " + resultado;
        } else if (operacao.equals("-")) {
            resultado = num1 - num2;
            mensagem = "Resultado: " + resultado;
        } else if (operacao.equals("*")) {
            resultado = num1 * num2;
            mensagem = "Resultado: " + resultado;
        } else if (operacao.equals("/")) {
            resultado = num1 / num2;  // divisão inteira
            mensagem = "Resultado: " + resultado;
        } else {
            mensagem = "Operação inválida.";
        }
        JOptionPane.showMessageDialog(null, mensagem);

    }
}
