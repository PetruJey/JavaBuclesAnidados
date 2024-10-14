import java.util.Scanner;

public class Func1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] ventas = new double[30];
        for (int dia = 0; dia < 30; dia++) {
            System.out.print("Ingrese las ventas del día " + (dia + 1) + ": ");
            ventas[dia] = scanner.nextDouble();
        }
        double ingresosMensuales = calcularIngresosMensuales(ventas);
        System.out.println("Los ingresos totales mensuales son: $" + ingresosMensuales);
        scanner.close();
    }
    public static double calcularIngresosMensuales(double[] ventas) {
        double total = 0;
        for (double venta : ventas) {
            total += venta;
        }
        return total;
    }
}
