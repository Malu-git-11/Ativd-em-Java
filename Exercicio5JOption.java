import javax.swing.*;

public class Exercicio5JOption {
        public static void main(String[] args) {
            String input1 = JOptionPane.showInputDialog("Digite a primeira nota:");
            double numero1 = Double.parseDouble(input1);

            String input2 = JOptionPane.showInputDialog("Digite a segunda nota:");
            double numero2 = Double.parseDouble(input2);

            String input3 = JOptionPane.showInputDialog("Digite a terceira nota:");
            double numero3 = Double.parseDouble(input3);

            double media = (numero1 + numero2 + numero3)/3;
            JOptionPane.showMessageDialog(null,"A media das notas e:" + media);

    }
}
