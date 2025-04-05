package tabuadageral;

import java.util.Scanner;

public class Tabuadas {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String encerra;
        do {
            System.out.println("Tabuadas");
            System.out.println();

            System.out.println("Digite o número para a tabuada:");
            int numero = scanner.nextInt();

            for (int i = 1; i <= 10; i++){
                int resultado = numero *i;
                System.out.println("Tabuada do " + numero + " X " + i + " " +  resultado);
            }

            System.out.println("\n Deseja saber outra tabuada? (sim/não)");
            scanner.nextLine();
            encerra = scanner.nextLine().toLowerCase();

        } while (encerra.equals("sim"));
            System.out.println("Encerrando");



        scanner.close();
    }
}
