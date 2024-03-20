import java.util.Scanner;

public class Ejer7 {

    public static void executar() {

        Programa.imprimirTitulo("EXERCÍCIO 07");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int numero = scanner.nextInt();

        if (numero >= 100 && numero <= 200) {
            System.out.println("O número está no intervalo entre 100 e 200.");
        } else {
            System.out.println("O número está fora do intervalo entre 100 e 200.");
        }

        scanner.close();
    }
}