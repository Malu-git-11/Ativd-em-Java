import javax.swing.*;

public class Exercicio10JOption {
    public static void main(String[] args) {
        String inputidade = JOptionPane.showInputDialog("Digite sua idade:");
        int idade = Integer.parseInt(inputidade);

        String inputNacionalidade = JOptionPane.showInputDialog("Digite sua nacionalidade:");

        if (idade >= 16 && inputNacionalidade.equals("brasileiro")){
            JOptionPane.showMessageDialog(null, "Voce pode votar");

        }else {
            JOptionPane.showMessageDialog(null, "Voce nao pode votar");
        }
    }
}
