import java.util.Scanner;
public class Ani3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número N: ");
        int N = sc.nextInt();
        long suma = 0;
        for (int i = 0; i <= N; i++) {
            suma += calcularFactorial(i);
        }
        System.out.println("La suma de los factoriales desde 0 hasta " + N + " es: " + suma);
        sc.close();
    }
    public static long calcularFactorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
