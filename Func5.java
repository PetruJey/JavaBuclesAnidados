public class Func5 {
    public static void main(String[] args) {
        int[] calificaciones = {5, 4, 3, 5, 2, 4, 5, 1, 5, 4};
        double promedio = calcularPromedioSatisfaccion(calificaciones);
        System.out.println("El promedio de satisfacción de los clientes es: " + promedio);
    }
    public static double calcularPromedioSatisfaccion(int[] calificaciones) {
        double suma = 0;
        for (int calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }
}
