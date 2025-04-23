
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Exercicio2Scanner {
        public static void main(String[] args) {
            Scanner scanner = new Scanner (System.in);
            
                System.out.print("Digite sua senha: ");
    String senha = scanner.nextLine();
            
            if (senha.equals("java123")) {
                System.out.println("Acesso permitido");
            }
            else {
                System.out.println("Senha incorreta");
            }
             scanner.close();
            }
            
            
        }


