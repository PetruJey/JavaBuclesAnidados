public class Func8 {
    public static void main(String[] args) {
        String[] empleados = {"Empleado A", "Empleado B", "Empleado C", "Empleado D", "Empleado E"};
        int[] horasTrabajadas = {40, 35, 50, 45, 30};
        calcularPagoSemanal(empleados, horasTrabajadas);
    }
    public static void calcularPagoSemanal(String[] empleados, int[] horasTrabajadas) {
        final double tarifaPorHora = 15.0;
        System.out.println("Pago semanal de empleados:");
        for (int i = 0; i < empleados.length; i++) {
            double pagoSemanal = horasTrabajadas[i] * tarifaPorHora;
            System.out.printf("%s - Horas trabajadas: %d - Pago: $%.2f%n", empleados[i], horasTrabajadas[i], pagoSemanal);
        }
    }
}
