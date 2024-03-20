import java.util.Scanner;

public class Ejer4 {

    public static void executar () {

        Programa.imprimirTitulo("EXERCÍCIO 04");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Insira o segundo número: ");
        double numero2 = scanner.nextDouble();

        double soma = numero1 + numero2;
        System.out.println("Soma: " + soma);

        double subtracao = numero1 - numero2;
        System.out.println("Subtração: " + subtracao);

        double multiplicacao = numero1 * numero2;
        System.out.println("Multiplicação: " + multiplicacao);

        if (numero2 != 0) {
        
            double divisao = numero1 / numero2;
            System.out.println("Divisão: " + divisao);
        } else {
            System.out.println("Não é possível dividir por zero.");
        }

        scanner.close();
    }
}