import java.util.Scanner;

public class Exercicio8Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base do retângulo: ");
        double base = scanner.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();

        double area = base * altura;

        double perimetro = 2 * (base + altura);

        System.out.printf("Área do retângulo: " + area);
        System.out.printf("Perímetro do retângulo: " + perimetro);

        scanner.close();

    }
}