import java.util.Scanner;

public class Exercicio7Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor total da conta: R$ ");
        double valorConta = scanner.nextDouble();

        System.out.print("Digite o número de pessoas: ");
        int numeroPessoas = scanner.nextInt();

        if (numeroPessoas <= 0) {
            System.out.println("Número de pessoas inválido.");

        } else {

            double valorPorPessoa = valorConta / numeroPessoas;
            System.out.printf("Cada pessoa deve pagar: R$ " + valorPorPessoa);
        }

        scanner.close();

    }
}