import java.util.Scanner;

public class Ejer5{

    public static void executar() {

        Programa.imprimirTitulo("EXERCÍCIO 05");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o valor de A: ");
        int a = scanner.nextInt();

        System.out.print("Insira o valor de B: ");
        int b = scanner.nextInt();

        System.out.println("Valores originais:");
        System.out.println("A: " + a);
        System.out.println("B: " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("\nValores trocados:");
        System.out.println("A: " + a);
        System.out.println("B: " + b);

        scanner.close();
    }
}