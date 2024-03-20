import java.util.Scanner;

public class Ejer9 {

    public static void executar() {

        Programa.imprimirTitulo("EXERCÍCIO 09");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();

        if (A == B) {
            System.out.println("Os números são iguais.");
        } else {
            System.out.println("Os números são diferentes.");
        
            if (A > B) {
                System.out.println("O número maior é: " + A);
            } else {
                System.out.println("O número maior é: " + B);
            }
        }

        scanner.close();
    }
}