import java.util.Scanner;

public class Exercicio6Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite o valor da compra: R$ ");
        double valorCompra = scanner.nextDouble();

        System.out.print("Digite a porcentagem de desconto (%): ");
        double porcentagemDesconto = scanner.nextDouble();

        double valorDesconto = valorCompra * (porcentagemDesconto / 100);

        double valorFinal = valorCompra - valorDesconto;

        System.out.printf("Valor com desconto: R$ " + valorFinal);

        scanner.close();

    }
}