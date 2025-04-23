import javax.swing.*;

public class Exercicio8JOption {
    public static void main(String[] args) {
        String inputCelsius = JOptionPane.showInputDialog("Digite a temperatura:");
        double celsius = Double.parseDouble(inputCelsius);

        double converter = celsius * 1.8 + 32;
        JOptionPane.showMessageDialog(null, String.format("A temperatura em fahrenheit e: %.2f ", + converter));

    }
}
