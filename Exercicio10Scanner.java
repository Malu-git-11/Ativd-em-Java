import java.util.Scanner;

public class Exercicio10Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();

        System.out.print("Digite a frequencia do aluno: ");
        double frequencia = scanner.nextDouble();

        if (nota < 7 && frequencia > 75) {
            System.out.println("O aluno pode fazer recuperaçao.");

        } else {
            System.out.println("O aluno nao pode fazer recuperaçao.");
        }

        scanner.close();
    }
}