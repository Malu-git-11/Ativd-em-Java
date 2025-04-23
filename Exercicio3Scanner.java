import java.util.Scanner;


public class Exercicio3Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite o codigo:");
        int codigo = scanner.nextInt();

        if ( codigo == 1 ){
            System.out.println("Alimento");

        }else if ( codigo == 2 ){
            System.out.println("Limpeza");

        }else if (codigo == 3 ){
            System.out.println("Vestuario");

        }else {
            System.out.println("Categoria desconhecida");
        }
           scanner.close();
    }
}