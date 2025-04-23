import javax.swing.*;

public class Exercicio9JOption {
    public static void main(String[] args) {
        String inputnumero = JOptionPane.showInputDialog("Digite o numero: ");
        int numero = Integer.parseInt(inputnumero);

        if (numero >= 10 && numero <= 20){
            JOptionPane.showMessageDialog(null, "O numero esta entre 10 e 20");
        }else {
            JOptionPane.showMessageDialog(null, "O numero esta fora");
        }
    }
}
