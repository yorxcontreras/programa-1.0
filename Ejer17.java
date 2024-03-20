import java.util.Scanner;

public class Ejer17 {

    public static void executar() {

        Programa.imprimirTitulo("EXERCÍCIO 17");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite o peso da primeira nota: ");
        double peso1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite o peso da segunda nota: ");
        double peso2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        System.out.print("Digite o peso da terceira nota: ");
        double peso3 = scanner.nextDouble();

        double mediaPonderada = calcularMediaPonderada(nota1, nota2, nota3, peso1, peso2, peso3);

        System.out.printf("A média ponderada das notas é: %.2f\n", mediaPonderada);

        scanner.close();
    }

    public static double calcularMediaPonderada(double nota1, double nota2, double nota3, double peso1, double peso2, double peso3) {
        return (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
    }
}