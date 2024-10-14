import java.util.Scanner;
public class Ani2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número N: ");
        int N = sc.nextInt();
        System.out.println("Factoriales desde 0 hasta " + N + ":");
        for (int i = 0; i <= N; i++) {
            System.out.println(i + "! = " + calcularFactorial(i));
        }
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
