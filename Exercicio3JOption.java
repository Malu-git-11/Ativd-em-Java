import javax.swing.*;

public class Exercicio3JOption {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Digite o numero inteiro:");
        int numero1 = Integer.parseInt(input1);

        String input2 = JOptionPane.showInputDialog("Digite o numero inteiro:");
        int numero2 = Integer.parseInt(input2);

        if (numero1 > numero2) {
            JOptionPane.showMessageDialog(null, "O primeiro numero " + numero1 + " e maior que o segundo");
        } else if (numero1 < numero2) {
            JOptionPane.showMessageDialog(null, "O segundo numero " + numero2 + " e maior que");
        } else {
            JOptionPane.showMessageDialog(null, "Os dois numeros são iguais.");
        }
    }
}
