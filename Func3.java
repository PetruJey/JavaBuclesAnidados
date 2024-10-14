public class Func3 {
    public static void main(String[] args) {
        String[] clientes = {"Cliente A", "Cliente B", "Cliente C", "Cliente D", "Cliente E"};
        double[] facturasPendientes = {300, 700, 450, 600, 200};
        enviarFacturas(clientes, facturasPendientes);
    }
    public static void enviarFacturas(String[] clientes, double[] facturasPendientes) {
        System.out.println("Clientes con facturas pendientes mayores a $500:");
        for (int i = 0; i < clientes.length; i++) {
            if (facturasPendientes[i] > 500) {
                System.out.println(clientes[i] + " - Monto: $" + facturasPendientes[i]);
            }
        }
    }
}
