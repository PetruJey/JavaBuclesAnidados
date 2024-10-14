public class Func9 {
    public static void main(String[] args) {
        double[] preciosOriginales = {100.0, 250.0, 75.0, 150.0, 300.0};
        calcularPrecioFinal(preciosOriginales);
    }
    public static void calcularPrecioFinal(double[] preciosOriginales) {
        final double porcentajeDescuento = 0.10;
        System.out.println("Precio Original - Descuento - Precio Final");
        for (double precio : preciosOriginales) {
            double descuento = precio * porcentajeDescuento;
            double precioFinal = precio - descuento;
            System.out.printf("%.2f - %.2f - %.2f%n", precio, descuento, precioFinal);
        }
    }
}
