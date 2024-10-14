public class Func6 {
    public static void main(String[] args) {
        double[] facturas = {100.0, 200.0, 300.0, 150.0, 50.0};
        calcularImpuesto(facturas);
    }

    public static void calcularImpuesto(double[] facturas) {
        final double porcentajeImpuesto = 0.21;
        System.out.println("Factura - Impuesto - Total");
        for (double factura : facturas) {
            double impuesto = factura * porcentajeImpuesto;
            double total = factura + impuesto;
            System.out.printf("%.2f - %.2f - %.2f%n", factura, impuesto, total);
        }
    }
}
