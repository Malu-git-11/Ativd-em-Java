import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercicio1JOptin {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite um numero:");
        double numero = Double.parseDouble(input);

        if (numero > 0) {
            JOptionPane.showMessageDialog(null, "O numero e positivo.");
        } else if (numero < 0) {
            JOptionPane.showMessageDialog(null, "O numero e negativo.");
        } else {
            JOptionPane.showMessageDialog(null, "O numero e zero.");
        }

    }
}