import java.util.Scanner;

public class Ejer3 {

    public static void executar () {


        Programa.imprimirTitulo("EXERCÍCIO 03");
        

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o valor de A: ");
        int a = scanner.nextInt();

        System.out.print("Insira o valor de B: ");
        int b = scanner.nextInt();

        if (a != b) {
         
            if (a > b) {
                System.out.println("O número A é maior do que o número B.");
            } else {
                System.out.println("O número B é maior do que o número A.");
            }
        } else {
            System.out.println("A sequência de números informados é inválida, pois os números são iguais.");
        }

        scanner.close();
    }
}