package Java;

import java.util.Scanner;

public class Apresentacao {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Meu nome é " + nome + " e tenho " + idade + " anos.");
        }

    }
}