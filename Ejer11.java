import java.util.Scanner;

public class Ejer11 {

     public static void executar() {

        Programa.imprimirTitulo("EXERCÍCIO 11");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite três números inteiros distintos:");

        System.out.print("Número 1: ");
        int numero1 = scanner.nextInt();

        System.out.print("Número 2: ");
        int numero2 = scanner.nextInt();

        System.out.print("Número 3: ");
        int numero3 = scanner.nextInt();

        int menor, medio, maior;

        if (numero1 < numero2 && numero1 < numero3) {
            menor = numero1;
            if (numero2 < numero3) {
                medio = numero2;
                maior = numero3;
            } else {
                medio = numero3;
                maior = numero2;
            }
        } else if (numero2 < numero1 && numero2 < numero3) {
            menor = numero2;
            if (numero1 < numero3) {
                medio = numero1;
                maior = numero3;
            } else {
                medio = numero3;
                maior = numero1;
            }
        } else {
            menor = numero3;
            if (numero1 < numero2) {
                medio = numero1;
                maior = numero2;
            } else {
                medio = numero2;
                maior = numero1;
            }
        }

        System.out.println("Os números em ordem crescente são: " + menor + ", " + medio + ", " + maior);

        scanner.close();
    }
}