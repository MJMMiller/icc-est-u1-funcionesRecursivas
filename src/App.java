import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int numero = sc.nextInt();
        System.out.print("Suma de consecutivos hasta 5: " + SumaConsecutivos.calcular(numero));

        System.out.print("\nIngrese la base la potencia: ");
        int base = sc.nextInt();
        System.out.print("Ingrese el expotente la potencia: ");
        int exponente = sc.nextInt();
        System.out.print("Potencia " + base + "^" + exponente + " = " +Potencia.calcular(base, exponente));

        System.out.print("\nIngrese un número entero positivo: ");
        int numero2 = sc.nextInt();
        System.out.print("Suma de dígitos de 1234: " + SumaDigitos.calcular(numero2));
    }
}
