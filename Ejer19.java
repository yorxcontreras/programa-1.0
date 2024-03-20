import java.util.Scanner;

public class Ejer19 {

    public static void executar() {

        Programa.imprimirTitulo("EXERCÍCIO 19");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do cilindro: ");
        double raio = scanner.nextDouble();

        System.out.print("Digite a altura do cilindro: ");
        double altura = scanner.nextDouble();

        double volume = calcularVolumeCilindro(raio, altura);

        System.out.printf("O volume do cilindro é: %.2f\n", volume);

        scanner.close();
    }

    public static double calcularVolumeCilindro(double raio, double altura) {
        return 3.14 * raio * raio * altura;
    }
}