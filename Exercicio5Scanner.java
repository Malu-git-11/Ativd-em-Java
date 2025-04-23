import java.util.Scanner;


public class Exercicio5Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite o salário bruto: R$ ");
        double salarioBruto = scanner.nextDouble();

        System.out.print("Digite o percentual de desconto do INSS (%): ");
        double percentualINSS = scanner.nextDouble();

        double desconto = salarioBruto * (percentualINSS / 100);

        double salarioLiquido = salarioBruto - desconto;

        System.out.printf("Salário líquido: R$ " + salarioLiquido);

    }
}
