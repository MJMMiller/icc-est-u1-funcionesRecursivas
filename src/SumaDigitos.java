public class SumaDigitos {
    public static int calcular(int numero) {
        
        if (numero < 10) return numero;
        return (numero % 10) + calcular(numero / 10);
    }
}
