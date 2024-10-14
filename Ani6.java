import java.util.Scanner;
public class Ani6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número N: ");
        int N = sc.nextInt();
        System.out.println("Números primos desde 2 hasta " + N + ":");
        for (int i = 2; i <= N; i++) {
            if (esPrimo(i)) {
                System.out.println(i);
            }
        }
        sc.close();
    }
    public static boolean esPrimo(int numero) {
        if (numero < 2) return false;
        int divisor = 2;
        while (divisor <= Math.sqrt(numero)) {
            if (numero % divisor == 0) {
                return false;
            }
            divisor++;
        }
        return true;
    }
}
