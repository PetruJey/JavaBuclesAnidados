import java.util.Scanner;
public class Bu2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double tarifaPorHora = 15.0;
        System.out.print("Ingrese la cantidad de empleados: ");
        int cantidadEmpleados = sc.nextInt();
        for (int i = 1; i <= cantidadEmpleados; i++) {
            System.out.print("Ingrese las horas trabajadas para el empleado " + i + ": ");
            int horasTrabajadas = sc.nextInt();
            double salario = horasTrabajadas * tarifaPorHora;
            System.out.println("El salario del empleado " + i + " es: $" + salario);
        }
        sc.close();
    }
}
