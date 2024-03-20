import java.util.Scanner;

public class Ejer6 {
    public static void executar () {

        Programa.imprimirTitulo("EXERCÍCIO 06");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (9 * celsius + 160) / 5;

        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit + " °F");

        scanner.close();
    }
}