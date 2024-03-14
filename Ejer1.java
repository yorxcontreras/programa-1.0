  import java.util.Scanner;

  public class Ejer1 {

    public static void executar () {
       
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();
        
        if (numero > 10) {
            System.out.println("Número maior do que 10! ");
        } else {
            System.out.println("Número menor ou igual a 10!");
        }
        
        // Fecha o scanner
        scanner.close();
    }
}


