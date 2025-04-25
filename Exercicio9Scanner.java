import java.util.Scanner;

public class Exercicio9Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        System.out.print("Está com ingresso? (true/false): ");
        boolean temIngresso = scanner.nextBoolean();

        if (idade >= 18 && temIngresso) {
            System.out.println("Entrada permitida.");

        } else {
            System.out.println("Entrada negada.");
        }

        scanner.close();

    }
}
