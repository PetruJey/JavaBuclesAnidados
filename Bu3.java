import java.util.Scanner;

public class Bu3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de productos: ");
        int numeroProductos = sc.nextInt();
        int i = 1;
        boolean necesitaPedido = false;
        while (i <= numeroProductos) {
            System.out.print("Ingrese la cantidad disponible del producto " + i + ": ");
            int cantidad = sc.nextInt();
            if (cantidad < 5) {
                necesitaPedido = true;
                System.out.println("Es necesario realizar un pedido para el producto " + i + ".");
            }
            i++;
        }
        if (!necesitaPedido) {
            System.out.println("Todos los productos tienen suficiente inventario.");
        }
        sc.close();
    }
}
