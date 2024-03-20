import java.util.Scanner;

public class Ejer14 {

     public static void executar() {

        Programa.imprimirTitulo("EXERCÍCIO 14");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro termo (a1) da Progressão Aritmética: ");
        int a1 = scanner.nextInt();

        System.out.print("Digite o número do termo (n) que deseja encontrar: ");
        int n = scanner.nextInt();

        System.out.print("Digite a razão (r) da Progressão Aritmética: ");
        int r = scanner.nextInt();

        int an = a1 + (n - 1) * r;

        System.out.println("O termo de ordem " + n + " da Progressão Aritmética é: " + an);

        scanner.close();
    }
}