import java.util.Scanner;
public class Bu1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] actividades = {"Estudiar", "Hacer ejercicio", "Leer", "Tiempo libre"};
        int[] horas = new int[actividades.length];
        int tiempoTotal = 0;
        for (int i = 0; i < actividades.length; i++) {
            System.out.print("Ingrese las horas dedicadas a " + actividades[i] + ": ");
            horas[i] = scanner.nextInt();
            tiempoTotal += horas[i];
        }
        System.out.println("El tiempo total dedicado a actividades académicas y personales es: " + tiempoTotal + " horas.");
        scanner.close();
    }
}
