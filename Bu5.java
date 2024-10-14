import java.util.Scanner;

public class Bu5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de empleados: ");
        int numeroEmpleados = sc.nextInt();
        int empleado = 1;
        do {
            System.out.print("Ingrese las horas trabajadas por el empleado " + empleado + ": ");
            int horasTrabajadas = sc.nextInt();
            if (horasTrabajadas > 40) {
                int horasExtras = horasTrabajadas - 40;
                System.out.println("El empleado " + empleado + " ha trabajado " + horasExtras + " horas extras.");
            } else {
                System.out.println("El empleado " + empleado + " no tiene horas extras.");
            }
            empleado++;
        } while (empleado <= numeroEmpleados);
        sc.close();
    }
}
