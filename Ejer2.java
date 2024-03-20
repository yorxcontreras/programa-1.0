import java.util.Scanner;

public class Ejer2 {
    
    public static void executar () {

        Programa.imprimirTitulo("EXERCÍCIO 02");
     
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();
        
        int suma = numero1 + numero2;
        
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
        
        scanner.close();
        
    }

}