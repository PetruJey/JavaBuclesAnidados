public class Func7 {
    public static void main(String[] args) {
        double[] compras = {450.0, 600.0, 300.0, 800.0, 500.0};
        aplicarDescuento(compras);
    }

    public static void aplicarDescuento(double[] compras) {
        final double porcentajeDescuento = 0.15;
        System.out.println("Monto Original - Descuento - Total");
        for (double compra : compras) {
            double descuento = 0;
            if (compra > 500) {
                descuento = compra * porcentajeDescuento;
            }
            double total = compra - descuento;
            System.out.printf("%.2f - %.2f - %.2f%n", compra, descuento, total);
        }
    }
}
