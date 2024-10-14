import java.util.Scanner;
public class Bu4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalVentas = 0;
        int dia = 1;
        while (dia <= 7) {
            System.out.print("Ingrese las ventas del día " + dia + ": ");
            double ventasDiarias = sc.nextDouble();
            totalVentas += ventasDiarias;
            dia++;
        }
        System.out.println("El total de ventas de la semana es: $" + totalVentas);
        sc.close();
    }
}
