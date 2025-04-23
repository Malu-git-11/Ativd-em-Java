import javax.swing.*;

public class Exercicio7JOption {
    public static void main(String[] args) {
        String inputPeso = JOptionPane.showInputDialog("Digite seu peso (em kg):");
        double peso = Double.parseDouble(inputPeso);

        String inputAltura = JOptionPane.showInputDialog("Digite sua altura (m):");
        double altura = Double.parseDouble(inputAltura);

        double imc = peso / (altura * altura);
        JOptionPane.showMessageDialog(null, String.format("Seu IMC e: %.2f ", + imc));

    }
}
