import java.util.Scanner;


public class Exercicio4Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite as coordenadas X e Y:");
        double X Y = scanner.nextDouble();

        if ( X => 0 && Y => 0){
            System.out.println("Primeiro quadrante");

        }else if ( X =< 0 && Y=> 0){
            System.out.println("Segundo quadrante");

        }else if ( X =< 0 && Y =< 0){
            System.out.println("Terceiro quadrante");

        }else if ( X => 0 && Y =< 0){
            System.out.println("Quarto quadrante");

        }else if ( X == 0 || Y == 0 ){
            System.out.println("Esta sobre o eixo");

        }
        scanner.close();
    }
}