import java.util.Scanner;

public class Ejer15 {

    public static void executar() {

        Programa.imprimirTitulo("EXERCÍCIO 15");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira as coordenadas do ponto P1:");
        System.out.print("x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("y1: ");
        double y1 = scanner.nextDouble();

        System.out.println("Insira as coordenadas do ponto P2:");
        System.out.print("x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("y2: ");
        double y2 = scanner.nextDouble();

        double distancia = calcularDistancia(x1, y1, x2, y2);

        System.out.printf("A distância entre os pontos P1 e P2 é: %.2f\n", distancia);

        scanner.close();
    }

    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}