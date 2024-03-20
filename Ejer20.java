import java.util.Scanner;

public class Ejer20 {

    public static void executar() {

        Programa.imprimirTitulo("EXERCÍCIO 20");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tempo da viagem (em horas): ");
        double tempoViagemHoras = scanner.nextDouble();

        System.out.print("Digite a velocidade média (em km/h): ");
        double velocidadeMediaKmPorHora = scanner.nextDouble();

        double distanciaTotalKm = velocidadeMediaKmPorHora * tempoViagemHoras;

        double consumoLitros = calcularConsumoCombustivel(distanciaTotalKm);

        System.out.printf("A quantidade de litros de combustível gasta na viagem é: %.2f litros\n", consumoLitros);

        scanner.close();
    }

    public static double calcularConsumoCombustivel(double distanciaTotalKm) {
      
        double rendimentoKmPorLitro = 12.0;
        return distanciaTotalKm / rendimentoKmPorLitro;
    }
}