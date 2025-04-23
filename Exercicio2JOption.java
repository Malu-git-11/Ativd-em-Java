import javax.swing.*;

public class Exercicio2JOption {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite a nota:");

        double nota = Double.parseDouble(input);
        if (nota >= 7) {
            JOptionPane.showMessageDialog(null, "Aprovado.");
        }else if (nota >= 5 && nota < 7) {
            JOptionPane.showMessageDialog(null, "Em recuperação.");
        }else if (nota >= 0 && nota < 5){
            JOptionPane.showMessageDialog(null, "Reprovado.");
        }else {
            JOptionPane.showMessageDialog(null,"Nota invalida");
        }
    }
}
