import javax.swing.*;

public class Exercicio4JOption {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite o numero:");
        int numero = Integer.parseInt(input);

        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O numero e par");

        }else {
            JOptionPane.showMessageDialog(null, " O numero e impar");
        }
    }
}
