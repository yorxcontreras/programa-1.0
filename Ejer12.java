import java.util.Scanner;

public class Ejer12 {

    public static void executar() {

        Programa.imprimirTitulo("EXERCÍCIO 12");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número do mês (1 a 12): ");
        int numeroMes = scanner.nextInt();

        if (numeroMes >= 1 && numeroMes <= 12) {
 
            String mes = obterNomeMes(numeroMes);
            System.out.println("O mês correspondente ao número " + numeroMes + " é " + mes + ".");
        } else {
 
            System.out.println("Mês inválido! O número do mês deve estar entre 1 e 12.");
        }

        scanner.close();
    }

    public static String obterNomeMes(int numeroMes) {
        switch (numeroMes) {
            case 1:
                return "Janeiro";
            case 2:
                return "Fevereiro";
            case 3:
                return "Março";
            case 4:
                return "Abril";
            case 5:
                return "Maio";
            case 6:
                return "Junho";
            case 7:
                return "Julho";
            case 8:
                return "Agosto";
            case 9:
                return "Setembro";
            case 10:
                return "Outubro";
            case 11:
                return "Novembro";
            case 12:
                return "Dezembro";
            default:
                return "Mês inválido";
        }
    }
}