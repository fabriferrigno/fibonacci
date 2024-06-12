import java.util.Scanner;

public class Fibonacci {
    // Función recursiva para calcular el término n de la serie de Fibonacci
    public static int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    // Función principal para generar la serie de Fibonacci
    public static void generarFibonacci(int terminos) {
        for (int i = 0; i < terminos; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el número de términos que desea mostrar
        System.out.print("Ingresa el número de términos que quieres mostrar en la serie de Fibonacci: ");
        int numeroDeTerminos = scanner.nextInt();

        // Generar y mostrar la serie de Fibonacci
        System.out.println("Serie de Fibonacci con " + numeroDeTerminos + " términos:");
        generarFibonacci(numeroDeTerminos);
    }
}