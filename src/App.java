import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        Fibonacci fibonacci = new Fibonacci();

        System.out.println("--------------- SUMA DE CONSECUTIVOS ---------------");
        System.out.print("Ingrese un número entero positivo: ");
        int numero = sc.nextInt();
        System.out.print("Suma de consecutivos hasta 5: " + SumaConsecutivos.calcular(numero));
        System.out.println();
        System.out.println("---------------------- POTENCIA --------------------");
        System.out.print("\nIngrese la base la potencia: ");
        int base = sc.nextInt();
        System.out.print("Ingrese el expotente la potencia: ");
        int exponente = sc.nextInt();
        System.out.print("Potencia " + base + "^" + exponente + " = " +Potencia.calcular(base, exponente));
        System.out.println();
        System.out.println("---------------------- SUMA DIGITOS ------------------");
        System.out.print("\nIngrese un número entero positivo: ");
        int numero2 = sc.nextInt();
        System.out.print("Suma de dígitos de 1234: " + SumaDigitos.calcular(numero2));
        System.out.println();
        System.out.println("----------------------- FIBONACCI --------------------");
        System.out.print("\nIngrese un numero entero positivo: ");
        int numero3 = sc.nextInt();
        System.out.print("Secuencia de Fibonacci hasta el número: " + fibonacci.fibonacciS(numero3));

    }
}