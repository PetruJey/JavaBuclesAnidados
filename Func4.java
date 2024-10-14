public class Func4 {
    public static void main(String[] args) {
        String[] clientes = {"Cliente A", "Cliente B", "Cliente C", "Cliente D", "Cliente E"};
        int[] compras = {5, 12, 8, 15, 3};
        double[] montosCompras = {100.0, 150.0, 200.0, 50.0, 300.0};
        calcularDescuentos(clientes, compras, montosCompras);
    }
    public static void calcularDescuentos(String[] clientes, int[] compras, double[] montosCompras) {
        System.out.println("Clientes con descuento:");
        for (int i = 0; i < clientes.length; i++) {
            if (compras[i] > 10) {
                double descuento = montosCompras[i] * 0.10;
                System.out.println(clientes[i] + " - Descuento: $" + descuento);
            }
        }
    }
}
